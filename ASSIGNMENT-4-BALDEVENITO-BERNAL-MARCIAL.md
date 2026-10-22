# Assignment 4: Generación de Oráculos con Daikon

## Phase 1: Instrumentación y Recolección de Trazas

### 1.2 Comandos ejecutados

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

A continuación se detalla el propósito de cada paso del proceso:

| Paso | Propósito | Comando | Resultado / Observación |
| :--- | :--- | :--- | :--- |
| **1** | Compilar clases principales | `mvn clean compile` | Prepara los archivos `.class` de producción. |
| **2** | Compilar las pruebas | `mvn clean test-compile` | Genera las clases de test para JUnit. |
| **3** | Instrumentar y recolectar con Chicory | Execución del agente Chicory | Genera la traza `ConsoleLauncherManual.dtrace.gz`. |
| **4** | Inferir invariantes dinámicos | Execución de Daikon sobre la traza | Finaliza con `Exiting Daikon.` y produce `daikon-output-manual.txt`. |
| **5** | Serialización de invariantes | Generación automática por Daikon | Produce el archivo `ConsoleLauncherManual.inv.gz` para inspección posterior. |

### 1.3 Archivos generados

A partir de la ejecución, obtuvimos los siguientes archivos:

* `daikon-traces/ConsoleLauncherManual.dtrace.gz`: Archivo comprimido con la traza completa de ejecución.
* `daikon-output-manual.txt`: Resultado textual de la inferencia de invariantes.
* `ConsoleLauncherManual.inv.gz`: Invariantes serializados en formato binario de Daikon.

Al utilizar el patrón de selección `--ppt-select-pattern='^ar\.edu\.unrc\.game2048\.(Board|Cell)(\.|:::)'`, acotamos el monitoreo exclusivamente a los métodos y estado de las clases de dominio `Board` y `Cell`, evitando el ruido y sobrecosto de librerías de Java o componentes de JUnit.

---

## Phase 2: Inferencia de Invariantes

### 2.1 Puntos de programa e invariantes reportados

Daikon agrupó los hallazgos en puntos de programa. Resumimos la cantidad de invariantes inferidos:

| Clase | Momento observado | Puntos observados | Invariantes informados | Ejemplo representativo |
| :--- | :--- | :---: | :---: | :--- |
| `Cell` | `CLASS` | 1 | 3 | `Cell.EMPTY.value == 0` |
| `Cell` | `OBJECT` | 1 | 2 | `this.value >= 0` |
| `Cell` | `ENTER` | 8 | 8 | `Cell.Cell(int):::ENTER`: `value >= 0` |
| `Cell` | `EXIT` | 29 | 104 | `Cell.getValue():::EXIT`: `this.value == return` |
| `Board` | `CLASS` | 1 | 0 | Sin invariantes reportados. |
| `Board` | `OBJECT` | 1 | 12 | `this.score >= 0`, `this.grid != null` |
| `Board` | `ENTER` | 23 | 106 | Puntos de entrada a constructores y métodos. |
| `Board` | `EXIT` | 65 | 499 | `Board.Board():::EXIT`: tamaño predeterminado y score cero. |

* **Total de Puntos de Programa (PPTs):** 129
* **Total de Invariantes Informados:** 734

### 2.2 Ejemplos representativos

Se seleccionaron invariantes que reflejan fielmente el comportamiento esperado y las reglas del juego:

* `Cell:::OBJECT` $\rightarrow$ `this.value >= 0`: Garantiza la cota inferior del valor de una celda.
* `Cell.getValue():::EXIT` $\rightarrow$ `this.value == return`: Confirma la consistencia del getter.
* `Cell.isEmpty():::EXIT` $\rightarrow$ `(this.value == 0) <==> (return == true)`: Relación bidireccional entre la vacuidad y el valor $0$.
* `Cell.canMergeWith(...):::EXIT;condition="return == true"` $\rightarrow$ `this.value == other.value`: Confirma que para fusionar celdas, sus valores deben ser iguales.
* `Board:::OBJECT` $\rightarrow$ `this.score >= 0`: El puntaje del juego nunca puede ser negativo.
* `Board:::OBJECT` $\rightarrow$ `this.size == size(this.grid[])`: Coherencia entre el atributo `size` y las filas de la matriz.
* `Board.Board():::EXIT` $\rightarrow$ `this.score == 0`: El estado inicial del tablero comienza siempre con puntaje cero.
* `Board.applyMove(...):::EXIT` $\rightarrow$ `this.score >= orig(this.score)`: Garantiza que el puntaje es monótonamente no decreciente tras una jugada.

### 2.3 Ejemplos no representativos

Se identificaron invariantes inferidos debido a la falta de variabilidad en las pruebas ejecutadas:

* `Cell.canMergeWith(...):::EXIT;condition="return == true"` $\rightarrow$ `this.value one of {2, 4}`: Asume que solo los valores 2 y 4 pueden fusionarse, omitiendo valores superiores como 8 o 16.
* `Cell.mergeWith(...):::EXIT` $\rightarrow$ `return.value one of {4, 8}`: Restringe el resultado de la fusión únicamente a 4 u 8.
* `Board:::OBJECT` $\rightarrow$ `this.score % this.size == 0`: Coincidencia aritmética sin fundamento en las reglas del dominio.

### 2.4 Observaciones sobre la inferencia

1. **Llamadas sin retorno:** Se registraron 26 ejecuciones que lanzaron excepciones esperadas por las pruebas. Daikon descartó sus puntos de salida `EXIT`, por lo que los invariantes reflejan únicamente llamadas con retorno normal.
2. **Sesgo de entradas pequeñas:** Gran parte de las generalizaciones extremas se deben a la utilización de valores pequeños e iniciales durante las pruebas unitarias.

---

## Phase 3: Inspección y Evaluación de los Invariantes

### 3.0 Clasificación empleada

* **Correcta y útil:** Propiedad genuina del programa con capacidad real de detectar fallos.
* **Correcta pero trivial:** Verdadera por definición, pero con bajo valor de detección.
* **Demasiado fuerte:** Producto de un conjunto insuficiente de trazas (*overfitting*).
* **Incorrecta:** Falsa con respecto a la especificación real.

### 3.1 Evaluación de `Cell`

| # | Invariante | Punto de programa | ¿Correcta? | ¿Útil? | En `repOK()` | Clasificación |
| :-: | :--- | :--- | :-: | :-: | :-: | :--- |
| 1 | `this.value >= 0` | `Cell:::OBJECT` | Sí | Sí | Sí | **Correcta y útil** |
| 2 | `this.value >= Cell.EMPTY.value` | `Cell:::OBJECT` | Sí | No | Sí | **Correcta pero trivial** |
| 3 | `this.value == orig(value)` | `Cell.Cell(int):::EXIT` | Sí | Sí | No | **Correcta y útil** |
| 4 | `this.value == other.value` si `return == true` | `Cell.canMergeWith(...):::EXIT` | Sí | Sí | No | **Correcta y útil** |
| 5 | Potencias de 2 y `>= 2` si `return == true` | `Cell.canMergeWith(...):::EXIT` | Sí | Sí | Sí | **Correcta y útil** |
| 6 | `this.value one of {2, 4}` si `return == true` | `Cell.canMergeWith(...):::EXIT` | No | No | No | **Demasiado fuerte** |
| 7 | `return.value one of {4, 8}` | `Cell.mergeWith(...):::EXIT` | No | No | No | **Demasiado fuerte** |

### 3.2 Evaluación de `Board`

| # | Invariante | Punto de programa | ¿Correcta? | ¿Útil? | En `repOK()` | Clasificación |
| :-: | :--- | :--- | :-: | :-: | :-: | :--- |
| 1 | `this.score >= 0` | `Board:::OBJECT` | Sí | Sí | Sí | **Correcta y útil** |
| 2 | `this.grid != null` | `Board:::OBJECT` | Sí | Sí | Sí | **Correcta y útil** |
| 3 | `this.size == size(this.grid[])` | `Board:::OBJECT` | Sí | Sí | Parcial | **Correcta y útil** |
| 4 | `this.grid[] elements != null` | `Board:::OBJECT` | Sí | Sí | Parcial | **Correcta y útil** |
| 5 | `this.spawner != null` | `Board:::OBJECT` | Sí | Sí | No | **Correcta y útil** |
| 6 | `this.spawner` es `AddTileDeterministic` | `Board:::OBJECT` | No | No | No | **Demasiado fuerte** |
| 7 | `this.score % this.size == 0` | `Board:::OBJECT` | No | No | No | **Demasiado fuerte** |

### 3.3 Contraejemplos para invariantes demasiado fuertes

* **`this.value one of {2, 4}` en `canMergeWith`:** Al instanciar `new Cell(8)` y llamar a `canMergeWith(new Cell(8))`, el método retorna `true`, violando el conjunto restringido `{2, 4}`.
* **`this.spawner` siempre de tipo `AddTileDeterministic`:** En el juego real se utiliza `AddRandomTile`. Instanciar la clase mediante el constructor de producción viola esta regla.
* **`this.score % this.size == 0`:** En un tablero de tamaño $3$, un movimiento que realiza una fusión de dos celdas de valor $2$ suma $4$ puntos al marcador. Se observa que $4 \bmod 3 = 1 \neq 0$.

---

## Phase 4: Comparación

### 4.1 Daikon vs. `repOK()`

| Invariante en `repOK()` | ¿Inferred por Daikon? | Comentario |
| :--- | :-: | :--- |
| `Cell`: valor no negativo | **Sí** | `this.value >= 0` en `Cell:::OBJECT`. |
| `Cell`: valor $\neq 1$ | **No** | Daikon no infirió la exclusión explícita del número 1. |
| `Cell`: valor es 0 o potencia de 2 | **Parcial** | Solo lo infirió como postcondición en `canMergeWith`, no como propiedad global del objeto. |
| `Board`: `size > 0` | **No** | Relacionó `size` con la matriz, pero no la cota inferior $size > 0$. |
| `Board`: `score >= 0` | **Sí** | Coincide exactamente con `Board:::OBJECT`. |
| `Board`: `grid` no nula y matriz cuadrada | **Parcial** | Deduce `grid != null` y el tamaño de filas, pero no valida iterativamente cada columna. |
| `Board`: ninguna celda nula y `cell.repOK()` | **No** | Excede la capacidad de inferencia sobre matrices anidadas. |

**Invariantes nuevas y útiles descubiertas por Daikon:**
Daikon detectó la propiedad `this.spawner != null` en `Board:::OBJECT` y formalizó la precondición/postcondición de fusión en `Cell`: una fusión exitosa exige celdas con valores idénticos y no vacíos.

### 4.2 Comparación de enfoques de oráculos

| Fuente | Método de producción | Fortalezas | Debilidades |
| :--- | :--- | :--- | :--- |
| **Aserciones manuales** | Escritura manual | Alta intención semántica y precisión. | Costoso y propenso a omitir casos borde. |
| **`repOK()`** | Escritura manual | Reutilizable en cualquier momento del ciclo. | Limitado a lo que el programador anticipe. |
| **Randoop** | Captura automática de ejecuciones | Gran exploración sin esfuerzo manual. | Aserciones frágiles y sin semántica real. |
| **EvoSuite** | Algoritmos genéticos/cobertura | Maximiza la cobertura de código. | Captura el comportamiento actual (incluidos errores). |
| **Daikon** | Inferencia dinámica estadística | Descubre relaciones implícitas entre variables. | Sensible a la calidad de la traza (*overfitting*). |

**Conclusión:** La combinación de **tests manuales con aserciones semánticas y el método `repOK()`** constituye la aproximación más sólida y confiable. Daikon funciona como un excelente asistente para descubrir propiedades no documentadas, pero sus salidas requieren ser revisadas por un desarrollador para descartar generalizaciones falsas, ademas si la test suite no es muy grande y completa no genera condiciones representativas para los metodos, ni para los objetos.