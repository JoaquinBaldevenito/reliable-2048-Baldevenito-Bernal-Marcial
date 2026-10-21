# Assignment 4: Generación de Oráculos con Daikon

# Phase 1: Instrumentación y Recolección de Trazas

## 1.2 Comandos ejecutados

Para llevar a cabo la instrumentación y recolección, ejecuté los siguientes comandos:

**Ejecución:**

```bash
mvn clean compile

mvn clean test-compile

CP="lib/daikon.jar:target/classes:target/test-classes:$(mvn -q dependency:build-classpath -Dmdep.includeScope=test -DforceStdout)"

java -cp "$CP" daikon.Chicory \
    --ppt-select-pattern='^ar\.edu\.unrc\.game2048\.(Board|Cell)(\.|:::)' \
    --dtrace-file=ConsoleLauncherManual.dtrace.gz \
    --output-dir=daikon-traces \
    org.junit.platform.console.ConsoleLauncher \
    --select-class=ar.edu.unrc.game2048.CellTest \
    --select-class=ar.edu.unrc.game2048.BoardTest

java -cp lib/daikon.jar daikon.Daikon daikon-traces/ConsoleLauncherManual.dtrace.gz > daikon-output-manual.txt
```

En la siguiente tabla detallo el propósito de cada paso. Cabe destacar que el archivo de salida de Daikon finalizó correctamente con el mensaje `Exiting Daikon.`.

| Paso | Propósito | Comando | Resultado / Observación |
| --- | --- | --- | --- |
| 1 | Compilar clases principales | `mvn clean compile` | Ejecutado antes de compilar los tests. |
| 2 | Compilar las pruebas | `mvn clean test-compile` | Ejecutado; produce las clases requeridas por `ConsoleLauncher`. |
| 3 | Instrumentar y recolectar con Chicory | Comando completo de Chicory detallado arriba | Genera `ConsoleLauncherManual.dtrace.gz`. |
| 4 | Inferir invariantes | `java -cp lib/daikon.jar daikon.Daikon daikon-traces/ConsoleLauncherManual.dtrace.gz > daikon-output-manual.txt` | Daikon termina y genera `daikon-output-manual.txt` con 1.014 líneas. |
| 5 | Guardar invariantes serializados | Daikon genera `ConsoleLauncherManual.inv.gz` automáticamente al finalizar. | El archivo se puede imprimir posteriormente usando `daikon.PrintInvariants`. |

## 1.3 Archivos generados

A partir de la ejecución, obtuve los siguientes archivos:

| Archivo | Descripción |
| --- | --- |
| `daikon-traces/ConsoleLauncherManual.dtrace.gz` | Traza de ejecución recolectada por Chicory. |
| `daikon-output-manual.txt` | Salida cruda de la inferencia de Daikon en texto plano. |
| `ConsoleLauncherManual.inv.gz` | Invariantes serializados generados automáticamente. |

Para esta etapa, decidí no agregar una ejecución del fuzzer ni realizar una partida interactiva. Al utilizar el patrón de selección `^ar\.edu\.unrc\.game2048\.(Board|Cell)(\.|:::)`, logré filtrar la captura para que los puntos de programa de la salida correspondan exclusivamente a los métodos declarados en las clases `Board` y `Cell`.

---

# Phase 2: Inferencia de Invariantes

## 2.1 Puntos reportados

En la siguiente tabla resumo las cantidades obtenidas; no enumero todos los invariantes para mantener la concisión. La columna "Puntos observados" cuenta los lugares del programa donde Daikon registró valores, mientras que "Invariantes informados" suma las propiedades que Daikon reportó en esos puntos. Los 734 invariantes completos se encuentran en mi archivo `daikon-output-manual.txt`.

*Nota:* `ENTER` significa que observé la propiedad al entrar al método; `EXIT`, que se observó al salir normalmente. Algunos métodos presentan varios puntos `EXIT` para separar resultados distintos (por ejemplo, cuando retornan `true` o `false`).

| Clase | Momento observado | Puntos observados | Invariantes informados | Ejemplo (no exhaustivo) |
| --- | --- | --- | --- | --- |
| `Cell` | `CLASS` | 1 | 3 | `Cell.EMPTY.value == 0` |
| `Cell` | `OBJECT` | 1 | 2 | `this.value >= 0` |
| `Cell` | `ENTER` | 8 | 8 | `Cell.Cell(int):::ENTER`: `value >= 0` |
| `Cell` | `EXIT` | 29 | 104 | `Cell.getValue():::EXIT`: `this.value == return` |
| `Board` | `CLASS` | 1 | 0 | No se informó un invariante en este punto. |
| `Board` | `OBJECT` | 1 | 12 | `this.score >= 0`, `this.grid != null` |
| `Board` | `ENTER` | 23 | 106 | Incluye puntos de entrada de constructores y métodos. |
| `Board` | `EXIT` | 65 | 499 | `Board.Board():::EXIT`: tamaño predeterminado y score cero. |

En total, contabilicé **129 puntos de programa** y **734 invariantes** para estas dos clases (las salidas condicionales cuentan como puntos `EXIT` separados).

## 2.2 Ejemplos representativos

Seleccioné los siguientes ejemplos porque concuerdan fielmente con los comportamientos que esperaba del sistema y resultan útiles para entender las reglas de negocio.

| Clase / método | Invariante observado | Por qué es representativo |
| --- | --- | --- |
| `Cell:::OBJECT` | `this.value >= 0` | Coincide exactamente con la regla general de representación de `Cell`. |
| `Cell.getValue():::EXIT` | `this.value == return` | Confirma que el getter devuelve el valor almacenado sin alteraciones. |
| `Cell.isEmpty():::EXIT` | `(this.value == 0) <==> (return == true)` | Relaciona de manera bidireccional el valor vacío con el resultado del método. |
| `Cell.canMergeWith(...):::EXIT;condition="return == true"` | `this.value == other.value` | Demuestra que una fusión exitosa requiere valores iguales. |
| `Board:::OBJECT` | `this.score >= 0` | Coincide con el invariante de representación de que el puntaje no puede ser negativo. |
| `Board:::OBJECT` | `this.size == size(this.grid[])` | Relaciona el tamaño declarado en el atributo con el número de filas observado en la matriz. |
| `Board.Board():::EXIT` | `this.score == 0` | Muestra que el constructor observado siempre inicializa el puntaje en cero. |
| `Board.applyMove(...):::EXIT` | `this.score >= orig(this.score)` | Asegura que el puntaje nunca disminuyó tras las jugadas observadas. |

## 2.3 Ejemplos observados no representativos

También identifiqué propiedades que Daikon infirió basándose en la falta de variedad en los tests, por lo que no debo tratarlas como reglas universales de mi programa.

| Clase / método | Invariante observado | Por qué no es representativo de todas las ejecuciones |
| --- | --- | --- |
| `Cell.canMergeWith(...):::EXIT;condition="return == true"` | `this.value one of {2, 4}` | Dos celdas de valor `8` también pueden fusionarse. La traza generalizó esto porque solo observó fusiones con valores pequeños durante mis tests. |
| `Cell.mergeWith(...):::EXIT` | `return.value one of {4, 8}` | Fusionar dos celdas de valor `8` produciría un `16`; lamentablemente, ese caso no apareció en los tests observados. |
| `Board:::OBJECT` | `this.score % this.size == 0` | No hay ninguna regla del juego que obligue al puntaje a ser múltiplo del tamaño del tablero; es una coincidencia matemática dependiente de las pocas jugadas que ejecuté. |

## 2.4 Observaciones sobre la inferencia

*   Noté que Daikon informó **26 llamadas sin retorno** y, consecuentemente, descartó sus entradas al no encontrar una salida emparejada. Revisando la traza, vi que aquí aparecen constructores y métodos ejecutados por mis tests que explícitamente esperan que se lancen excepciones. Es por esto que los invariantes `EXIT` solo me describen las llamadas que retornaron normalmente y omiten las rutas excepcionales.
*   Muchos invariantes están fuertemente condicionados por los valores pequeños inyectados en los tests. El caso más claro es `canMergeWith`, que asume que solo los valores `{2, 4}` devuelven `true`, ignorando por completo el resto de las potencias de dos válidas en el juego real.

---

# Phase 3: Inspección y Evaluación de los Invariantes

## 3.0 Leyenda de clasificación

Para evaluar la utilidad de la herramienta, clasifiqué cada invariante extraído en una de las siguientes categorías:

| Categoría | Significado |
| --- | --- |
| **Correcta y útil** | Propiedad genuina del programa y capaz de detectar un error real si se viola en el futuro. |
| **Correcta pero trivial** | Verdadera, pero tautológica o sin poder de detección real (por ejemplo, `x != null` sobre un campo que nunca puede ser nulo por definición). |
| **Demasiado fuerte** | Solo se sostiene porque las ejecuciones que observé no cubrieron un caso válido; es fácil construir una ejecución perfectamente válida que la viole. |
| **Incorrecta** | Falsa con respecto a la especificación real del programa. |

## 3.1 `Cell` — Análisis de invariantes

| # | Invariante | Punto de programa | ¿Correcta? | ¿Útil? | ¿Ya estaba en `repOK()`? | Clasificación | Razonamiento |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | `this.value >= 0` | `Cell:::OBJECT` | Sí | Sí | Sí | **Correcta y útil** | Es parte fundamental del dominio de valores admitidos y mi `repOK()` actual ya la comprueba directamente. |
| 2 | `this.value >= Cell.EMPTY.value` | `Cell:::OBJECT` | Sí | Poco | Sí | **Correcta pero trivial** | Es equivalente a la fila anterior porque `EMPTY.value == 0`. Solo repite la cota inferior usando el singleton como referencia. |
| 3 | `this.value == orig(value)` | `Cell.Cell(int):::EXIT` | Sí | Sí | No | **Correcta y útil** | Asegura que en una construcción normal, el campo queda configurado con el argumento recibido. |
| 4 | `this.value == other.value` si `return == true` | `Cell.canMergeWith(...):::EXIT;condition="return == true"` | Sí | Sí | No | **Correcta y útil** | Formaliza que la condición de merge exige valores iguales; complementa de manera excelente el invariante de representación. |
| 5 | `this.value` y `other.value` son potencias de 2 y `>= 2` si `return == true` | `Cell.canMergeWith(...):::EXIT;condition="return == true"` | Sí | Sí | Sí | **Correcta y útil** | Instancia la regla general de representación aplicándola específicamente a una fusión exitosa. (La regla de potencias de 2 ya está en `repOK()`). |
| 6 | `this.value one of {2, 4}` si `return == true` | `Cell.canMergeWith(...):::EXIT;condition="return == true"` | No | No | No | **Demasiado fuerte** | Dos celdas de valor `8` pueden fusionarse. El conjunto `{2,4}` refleja los limitados ejemplos observados, no el contrato. |
| 7 | `return.value one of {4, 8}` | `Cell.mergeWith(...):::EXIT` | No | No | No | **Demasiado fuerte** | Mis tests no ejercitaron la fusión de valores más altos, por lo que Daikon limitó artificialmente el resultado esperado. |

## 3.2 `Board` — Análisis de invariantes

| # | Invariante | Punto de programa | ¿Correcta? | ¿Útil? | ¿Ya estaba en `repOK()`? | Clasificación | Razonamiento |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | `this.score >= 0` | `Board:::OBJECT` | Sí | Sí | Sí | **Correcta y útil** | Evita puntajes negativos, tal como exige mi método `Board.repOK()`. |
| 2 | `this.grid != null` | `Board:::OBJECT` | Sí | Sí | Sí | **Correcta y útil** | La matriz estructural siempre debe existir para representar el estado del tablero. |
| 3 | `this.size == size(this.grid[])` | `Board:::OBJECT` | Sí | Sí | Parcialmente | **Correcta y útil** | Verifica el número de filas correctamente, aunque no demuestra explícitamente que cada fila interna tenga longitud `size`. |
| 4 | `this.grid[] elements != null` | `Board:::OBJECT` | Sí | Sí | Parcialmente | **Correcta y útil** | Valida que las filas no son nulas en las observaciones. (Mi `repOK()` es más completo porque además revisa dimensión y contenido iterando la matriz). |
| 5 | `this.spawner != null` | `Board:::OBJECT` | Sí | Sí | No | **Correcta y útil** | Evita que la estrategia de generación de fichas quede en estado inválido, algo que actualmente no tengo en mi `repOK()`. |
| 6 | `this.spawner` es siempre `AddTileDeterministic` | `Board:::OBJECT` | No | No | No | **Demasiado fuerte** | En una ejecución real el juego usa `AddRandomTile`; la clase observada fue producto exclusivo de mi configuración de testing determinista. |
| 7 | `this.score % this.size == 0` | `Board:::OBJECT` | No | No | No | **Demasiado fuerte** | El puntaje incrementa por los valores fusionados, no por proporciones del tablero. Un tablero de 3x3 puede tener tranquilamente un score de 4. |

## 3.3 Invariantes espurias: contraejemplos

Para demostrar por qué catalogué algunos invariantes como "Demasiado fuertes", formulé los siguientes contraejemplos:

| Invariante Demasiado Fuerte | Ejecución válida que la viola | Por qué la traza no la capturó |
| --- | --- | --- |
| `this.value one of {2,4}` cuando `Cell.canMergeWith` retorna `true` | Crear dos objetos `Cell(8)` distintos y consultar `canMergeWith`: la fusión es válida y retorna `true`, pero su valor es 8. | Mis casos observados cubrieron valores 2 y 4, pero nunca llegué a generar valores mayores en la ejecución analizada. |
| `this.spawner` es siempre `AddTileDeterministic` | Construir un `Board` en el código de producción usando `new AddRandomTile()` como estrategia de spawn. | Los tests que corrí usaron exclusivamente la estrategia determinística inyectada; la inferencia asumió que era la única clase posible. |
| `this.score % this.size == 0` | En un tablero de tamaño 3, realizo un movimiento que fusiona dos celdas de valor 2. El score pasa a ser 4, y claramente `4 % 3 != 0`. | Los tests observaron una combinatoria muy reducida de tamaños y puntajes. Daikon encontró una coincidencia matemática sin significado semántico. |

## 3.4 Mejora de la cobertura de trazas

Dado que en esta entrega no recolecté una segunda traza ampliada (mediante un fuzzer o incorporando una partida larga manual), la comparativa queda planteada teóricamente:

| Métrica | Traza original | Traza ampliada |
| --- | --- | --- |
| Nº de invariantes inferidos | 734 en los puntos de programa de `Board` y `Cell` | No medida en esta ejecución |
| Invariantes espurias detectadas | Al menos 3 ejemplos claros identificados en mi análisis | No medida en esta ejecución |
| Invariantes nuevas y genuinas | No aplica sin comparar con una segunda traza | No medida en esta ejecución |
| Puntos de programa cubiertos | 129 puntos declarados en `Board` o `Cell` | No medida en esta ejecución |

**¿La ampliación de la traza eliminó las invariantes espurias? ¿Reveló invariantes nuevas?**
No puedo responder con evidencia empírica ya que no ejecuté dicha ampliación. Sin embargo, es deducible que proporcionar una traza con mucha más variabilidad (valores altos de celdas, diferentes spawners) descartará rápidamente las falsas generalizaciones como los conjuntos `{2,4}` y revelará relaciones más profundas, aunque esto debe verificarse corriendo Daikon nuevamente con el nuevo set de datos.

---

# Phase 4: Comparación

## 4.1 Daikon vs. `repOK()`

Para contextualizar, estos son los métodos `repOK()` que implementé en mi código:

```java
// Cell.repOK()
public boolean repOK() {
    if (this.value < 0) {
        return false; // Not negative
    }
    if (this.value == 1) {
        return false; // Power of two greater than 1
    }
    if (this.value == 0) {
        return true; // EMPTY cell is valid
    }
    // Power of two
    return (this.value & (this.value - 1)) == 0;
}
```

```java
// Board.repOK()
public boolean repOK() {
    // Validate parameters
    if (this.size <= 0) return false;
    if (this.score < 0) return false;
    if (this.grid == null) return false;
    if (this.grid.length != this.size) return false;

    // Validate Board and Cell
    for (int r = 0; r < this.size; r++) {
        if (this.grid[r] == null) return false;
        if (this.grid[r].length != this.size) return false;

        for (int c = 0; c < this.size; c++) {
            Cell cell = this.grid[r][c];
            // Not null Cells and self repOK
            if (cell == null || !cell.repOK()) {
                return false;
            }
        }
    }
    return true;
}
```

| Invariante de `repOK()` | ¿Daikon lo infirió? | Observación |
| --- | --- | --- |
| `Cell`: valor no negativo | Sí, infirió `this.value >= 0` en `Cell:::OBJECT`. | Coincide directamente con la primera guarda de mi `Cell.repOK()`. |
| `Cell`: valor ≠ 1 | No como invariante general de objeto. | Al observar solo valores limitados, Daikon no tuvo suficientes datos para inferir que el 1 está estrictamente excluido en todos los casos. |
| `Cell`: valor es 0 o potencia de 2 | No como invariante general de objeto. | Sí notó que las celdas fusionadas con éxito son potencias de 2 (y `>= 2`), pero solo lo reportó como una condición de salida de ese método, no del objeto entero. |
| `Board`: `size > 0` | No directamente como invariante de objeto. | Reportó `size == size(grid[])`, lo cual relaciona el tamaño con la matriz, pero no dedujo el límite inferior explícito. |
| `Board`: `score >= 0` | Sí, en `Board:::OBJECT`. | Coincide perfectamente con la regla de `Board.repOK()`. |
| `Board`: grilla no nula y de dimensión `size × size` | Parcialmente. | Daikon infirió `grid != null` y que la cantidad de filas equivale a `size`. No logró inferir que *cada fila interna* tenga longitud `size`. |
| `Board`: ninguna celda nula y todas satisfacen `Cell.repOK()` | No en forma completa. | Daikon no tiene la capacidad de inferir la cuantificación anidada sobre toda la matriz sin un punto de observación explícito iterando. |

**¿Qué invariantes de `repOK()` redescubre Daikon?**
Daikon logró redescubrir directamente que el valor de la celda no puede ser negativo y que el score del tablero tampoco puede serlo. También fue capaz de deducir la estructura superficial del tablero (que la matriz no es nula, que la dimensión exterior es coherente con el atributo `size` y que las filas instanciadas no son nulas).

**¿Cuáles no encontró Daikon, y por qué?**
Noté que Daikon no infirió que `Cell.value != 1`, ni la disyunción completa "el valor es cero o es una potencia de dos" como una propiedad estructural del objeto `Cell`. Encontrar el patrón "potencia de dos" únicamente durante la ejecución de una fusión exitosa no reemplaza al invariante general.
Respecto a `Board`, no fue capaz de obtener el límite base `size > 0`, ni de garantizar iterativamente que cada fila tenga exactamente `size` columnas, ni que todas las celdas internas existan satisfaciendo a su vez su propio `Cell.repOK()`. Estas propiedades requieren un razonamiento cuantificado complejo sobre arreglos multidimensionales que excede la inferencia estadística básica.

**¿Daikon infirió alguna invariante correcta y útil que no estuviera en nuestro `repOK()`?**
Sí, identifiqué como candidatas la regla `this.spawner != null` para un objeto `Board` correctamente construido, y las relaciones intrínsecas de `Cell.canMergeWith`: que una fusión exitosa implica inherentemente valores iguales, no vacíos y potencias de dos.

## 4.2 Daikon vs. oráculos manuales y automatizados

| Fuente del oráculo | Cómo se produce | Fortalezas | Debilidades |
| --- | --- | --- | --- |
| Aserciones de test manual | Las escribo yo a partir de las reglas de negocio del juego. | Expresan los resultados esperados con intención semántica real y cubren casos de borde específicos. | Requieren mucho trabajo manual y es fácil omitir casos no imaginados. |
| `repOK()` | Lo implemento manualmente para definir formalmente estados válidos. | Es altamente reutilizable y comprueba propiedades de representación de forma explícita. | Solo verifica lo que yo decidí codificar; si no lo llamo, no previene errores. |
| Aserciones de regresión (Randoop) | Se generan automáticamente observando ejecuciones de secuencias de métodos. | Automatizan la exploración y aseguran que los comportamientos previos no se rompan (preservación). | Suelen ser muy frágiles y carecen de comprensión semántica (no saben jugar a 2048, solo graban qué pasó). |
| Aserciones (EvoSuite) | Se generan mediante algoritmos de búsqueda para maximizar la cobertura del código. | Llegan a rutas de ejecución difíciles y automatizan la generación a gran escala. | Al igual que Randoop, capturan el comportamiento actual (tenga bugs o no), no necesariamente el comportamiento *deseado*. |
| Invariantes de Daikon | Se infieren estadísticamente de los valores recolectados en las trazas dinámicas. | Descubren relaciones ocultas entre variables, parámetros y retornos sin que yo las haya escrito. | Tienden a sobre-generalizar con muestras pequeñas (overfitting) y no demuestran matemáticamente la propiedad, solo que "no falló hasta ahora". |

**¿Qué enfoque produjo los oráculos más útiles para este programa en particular? Justificá la respuesta.**
En mi experiencia analizando la lógica de 2048, los tests manuales con aserciones semánticas complementados con el uso de `repOK()` resultaron ser los oráculos más útiles y precisos. Estos me permiten expresar reglas de negocio irrefutables, como qué fichas exactas se fusionan, bajo qué circunstancias el score debe aumentar y qué estados de la matriz son inválidos. 
Si bien Daikon me aportó pistas muy valiosas y detectó relaciones interesantes entre campos que yo no había formalizado, su dependencia total de la calidad de la traza provocó demasiadas generalizaciones espurias (como asumir que los valores válidos eran solo `{2, 4}` o que el spawner siempre era determinístico). Por ende, los resultados de Daikon son excelentes como asistencia o sugerencia, pero requieren obligatoriamente de mi validación manual como desarrollador antes de convertirse en especificaciones formales.

## 4.3 Actualizaciones aplicadas a `repOK()`

| Cambio | Invariante de Daikon que lo motiva | ¿Aplicado? |
| --- | --- | --- |
| Ninguno respecto a tipos primitivos o dimensiones. | Las propiedades observadas de `score`, `Cell.value` y dimensiones de arreglos ya estaban contempladas exhaustivamente por mis métodos `repOK()` actuales. | No. |
| Ninguno por ahora. | `this.spawner != null` es una candidata fuerte descubierta por Daikon. | No; decidí no aplicarlo por el momento ya que validar la estrategia en el constructor requeriría una refactorización y añadir tests unitarios específicos para ese caso de borde. |