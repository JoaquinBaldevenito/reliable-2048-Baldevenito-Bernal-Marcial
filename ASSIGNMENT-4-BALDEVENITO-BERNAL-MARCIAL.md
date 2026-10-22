# Assignment 4: Generación de Oráculos con Daikon

## Phase 1: Instrumentación y Recolección de Trazas

### 1.2 Comandos ejecutados

Para llevar a cabo la instrumentación y recolección de trazas tanto de la suite de pruebas unitarias manuales como de la generación automática con **Randoop** y la ejecución masiva del **Fuzzer por CLI**, se ejecutaron los siguientes comandos:

#### 1. Traza de pruebas unitarias manuales

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

#### 2. Traza de pruebas automáticas con Randoop

```bash
mvn clean test-compile

CP="lib/daikon.jar:target/classes:target/test-classes:$(mvn -q dependency:build-classpath -Dmdep.includeScope=test -DforceStdout)"

java -cp "$CP" daikon.Chicory \
    --ppt-select-pattern='^ar\.edu\.unrc\.game2048\.(Board|Cell)(\.|:::)' \
    --dtrace-file=ConsoleLauncherRandoop.dtrace.gz \
    --output-dir=daikon-traces \
    org.junit.platform.console.ConsoleLauncher \
    --select-package=randoopTests

# 3. Traza de pruebas con Fuzzer por CLI
python3 -c "import fuzzer; print(fuzzer.RandomFuzzer(1000, 50000).fuzz(), end='')" | java -cp "lib/daikon.jar:target/classes" \
     daikon.Chicory \
     --ppt-select-pattern='^ar\.edu\.unrc\.game2048\.(Board|Cell|MainCLI)(\.|:::)' \
     --dtrace-file=ConsoleLauncherFuzzer.dtrace.gz \
     --output-dir=daikon-traces \
     ar.edu.unrc.game2048.MainCLI

# 4. Inferencia conjunta sobre trazas ampliadas (Randoop + Fuzzer)
 java -cp lib/daikon.jar daikon.Daikon daikon-traces/*{Randoop,Fuzzer}*.dtrace.gz > daikon-output-randoop-fuzzer.txt

```

A continuación se detallo el propósito de cada paso del proceso:

| Paso | Propósito | Comando | Resultado / Observación |
| --- | --- | --- | --- |
| **1** | Compilar clases principales | `mvn clean compile` | Prepara los archivos `.class` de producción. |
| **2** | Compilar las pruebas | `mvn clean test-compile` | Genera las clases de test para JUnit y Randoop. |
| **3** | Instrumentación manual | Chicory con `ConsoleLauncher` | Genera `ConsoleLauncherManual.dtrace.gz`. |
| **4** | Instrumentación de Randoop | Chicory sobre paquete `randoopTests` | Genera `ConsoleLauncherRandoop.dtrace.gz`. |
| **5** | Instrumentación de Fuzzer | Pipe de `fuzzer.py` a Chicory sobre `MainCLI` | Genera `ConsoleLauncherFuzzer.dtrace.gz`. |
| **6** | Inferencia inicial | Daikon sobre traza manual | Produce `daikon-output-manual.txt`. |
| **7** | Inferencia ampliada | Daikon sobre trazas de Randoop y Fuzzer | Produce `daikon-output-randoop-fuzzer.txt`. |

### 1.3 Archivos generados

A partir de las ejecuciones, se obtuvieron los siguientes archivos dentro del repositorio:

* `daikon-traces/ConsoleLauncherManual.dtrace.gz`: Traza de ejecuciones de pruebas manuales.
* `daikon-traces/ConsoleLauncherRandoop.dtrace.gz`: Traza de ejecuciones exploratorias de Randoop.
* `daikon-traces/ConsoleLauncherFuzzer.dtrace.gz`: Traza de partidas masivas generadas por el Fuzzer.
* `daikon-output-manual.txt`: Invariantes inferidos a partir de la suite de pruebas unitarias manuales.
* `daikon-output-randoop-fuzzer.txt`: Invariantes inferidos a partir de la traza ampliada (Randoop + Fuzzer).
* `ConsoleLauncherManual.inv.gz`: Invariantes serializados en formato binario de Daikon.

Al utilizar los patrones de selección `--ppt-select-pattern`, acotamos el monitoreo exclusivamente a los métodos y estados de las clases de dominio `Board` y `Cell` (incluyendo `MainCLI` para el fuzzer), evitando el ruido y sobrecosto de librerías de Java o componentes internos de JUnit.

---

## Phase 2: Inferencia de Invariantes

### 2.1 Puntos de programa e invariantes reportados (Traza Manual)

En la primera ejecución sobre la suite manual, Daikon agrupó los hallazgos en los siguientes puntos de programa:

| Clase | Momento observado | Puntos observados | Invariantes informados | Ejemplo representativo |
| --- | --- | --- | --- | --- |
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

### 2.3 Ejemplos no representativos (Traza Manual)

Se identificaron invariantes inferidos debido a la falta de variabilidad en las pruebas manuales ejecutadas:

* `Cell.canMergeWith(...):::EXIT;condition="return == true"` $\rightarrow$ `this.value one of {2, 4}`: Asume que solo los valores 2 y 4 pueden fusionarse, omitiendo valores superiores como 8 o 16.
* `Cell.mergeWith(...):::EXIT` $\rightarrow$ `return.value one of {4, 8}`: Restringe el resultado de la fusión únicamente a 4 u 8.
* `Board:::OBJECT` $\rightarrow$ `this.score % this.size == 0`: Coincidencia aritmética sin fundamento en las reglas del dominio.

### 2.4 Observaciones sobre la inferencia

1. **Llamadas sin retorno:** Se registraron 26 ejecuciones que lanzaron excepciones esperadas por las pruebas unitarias. Daikon descartó sus puntos de salida `EXIT`, por lo que los invariantes reflejan únicamente llamadas con retorno normal.
2. **Sesgo de entradas pequeñas:** Gran parte de las generalizaciones extremas en la suite manual se deben a la utilización de valores pequeños e iniciales durante las pruebas.

---

## Phase 3: Inspección y Evaluación de los Invariantes

### 3.0 Clasificación empleada

* **Correcta y útil:** Propiedad genuina del programa con capacidad real de detectar fallos.
* **Correcta pero trivial:** Verdadera por definición, pero con bajo valor de detección.
* **Demasiado fuerte:** Producto de un conjunto insuficiente de trazas (*overfitting*).
* **Incorrecta:** Falsa con respecto a la especificación real.

### 3.1 Evaluación de `Cell` (Traza Inicial)

| # | Invariante | Punto de programa | ¿Correcta? | ¿Útil? | En `repOK()` | Clasificación |
| --- | --- | --- | --- | --- | --- | --- |
| 1 | `this.value >= 0` | `Cell:::OBJECT` | Sí | Sí | Sí | **Correcta y útil** |
| 2 | `this.value >= Cell.EMPTY.value` | `Cell:::OBJECT` | Sí | No | Sí | **Correcta pero trivial** |
| 3 | `this.value == orig(value)` | `Cell.Cell(int):::EXIT` | Sí | Sí | No | **Correcta y útil** |
| 4 | `this.value == other.value` si `return == true` | `Cell.canMergeWith(...):::EXIT` | Sí | Sí | No | **Correcta y útil** |
| 5 | Potencias de 2 y `>= 2` si `return == true` | `Cell.canMergeWith(...):::EXIT` | Sí | Sí | Sí | **Correcta y útil** |
| 6 | `this.value one of {2, 4}` si `return == true` | `Cell.canMergeWith(...):::EXIT` | No | No | No | **Demasiado fuerte** |
| 7 | `return.value one of {4, 8}` | `Cell.mergeWith(...):::EXIT` | No | No | No | **Demasiado fuerte** |

### 3.2 Evaluación de `Board` (Traza Inicial)

| # | Invariante | Punto de programa | ¿Correcta? | ¿Útil? | En `repOK()` | Clasificación |
| --- | --- | --- | --- | --- | --- | --- |
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

### 3.4 Mejora de la cobertura de trazas

Para evaluar el impacto de la diversidad de ejecuciones en la calidad de los oráculos, se recolectó una segunda traza ampliada combinando la exploración automática de **Randoop** y las partidas masivas del **Fuzzer por CLI** (`ConsoleLauncherRandoop.dtrace.gz` y `ConsoleLauncherFuzzer.dtrace.gz`).

| Métrica | Traza Original (Tests Manuales) | Traza Ampliada (Randoop + Fuzzer) |
| --- | --- | --- |
| **Nº de invariantes informados** | 734 | 718 (en `Board` y `Cell`) |
| **Invariantes espurias detectadas** | Acotaba fusiones a $\{2, 4\}$ y `score % size == 0`. | **Eliminadas.** Se descartó la restricción $\{2, 4\}$ y el acoplamiento a múltiplos de tamaño. |
| **Invariantes nuevas y genuinas** | Coincidencias de asignación directas. | **Descubiertas:** $2 \times \text{this.value} = \text{return.value}$ en `mergeWith()`, preservación de score en `applyMove()` y precondiciones de rango. |
| **Puntos de programa (PPTs) cubiertos** | 129 | 137 |
| **Excepciones / Rutas de error (sin retorno)** | 26 | 348 |

#### `Cell` — Invariantes descubiertos en traza ampliada

| # | Invariante | Punto de programa | ¿Correcta? | ¿Útil? | En `repOK()` | Clasificación | Razonamiento |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | `2 * this.value - return.value == 0` | `Cell.mergeWith(...):::EXIT` | Sí | Sí | No | **Correcta y útil** | Ley algebraica real de la fusión: la celda resultante duplica exactamente el valor de la celda combinada. Reemplaza la restricción espuria `{4, 8}` de los tests manuales. |
| 2 | `this.value >= 2` y `this.value is a power of 2` | `Cell.isEmpty():::EXIT;condition="not(return == true)"` | Sí | Sí | Sí | **Correcta y útil** | Confirma que si una celda no está vacía (`return == false`), su valor es obligatoriamente una potencia de 2 válida del dominio. |

#### `Board` — Invariantes descubiertos en traza ampliada

| # | Invariante | Punto de programa | ¿Correcta? | ¿Útil? | En `repOK()` | Clasificación | Razonamiento |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | `(return == false) ==> (this.score == orig(this.score))` | `Board.applyMove(...):::EXIT` | Sí | Sí | No | **Correcta y útil** | Garantiza la preservación del puntaje: si un movimiento no altera el tablero y retorna `false`, el score permanece inalterado. |
| 2 | `row >= 0 && row <= size(this.grid[])-1` | `Board.getCell(int, int):::ENTER` | Sí | Sí | Parcial | **Correcta y útil** | Establece el contrato formal de precondición sobre los límites de filas para prevenir accesos inválidos (`IndexOutOfBoundsException`). |
| 3 | `col >= 0 && col <= size(this.grid[])-1` | `Board.getCell(int, int):::ENTER` | Sí | Sí | Parcial | **Correcta y útil** | Establece la precondición formal sobre los límites de columnas de la matriz. |
| 4 | `return != null` y `return.getClass().getName() == java.util.HashSet.class` | `Board.getEmptyPositions():::EXIT` | Sí | Sí | No | **Correcta y útil** | Garantiza que la consulta de casillas vacías no retorna un valor nulo y asegura el uso de la estructura concreta `HashSet`. |

**¿La ampliación de la traza eliminó las invariantes espurias? ¿Reveló invariantes nuevas?**
**Sí, rotundamente.** Al proporcionar una traza con alta variabilidad (partidas completas con fichas de alto valor como 2048 y miles de llamadas aleatorias a métodos), Daikon descartó automáticamente las falsas generalizaciones sobre los conjuntos acotados $\{2, 4\}$. Además, la diversidad de estados permitió a la herramienta descubrir relaciones algebraicas profundas que la suite manual no había logrado ejercitar con suficiente frecuencia, como la ley de duplicación exacta de valor en `Cell.mergeWith()` ($2 \times \text{this.value} = \text{return.value}$), la preservación del score en jugadas nulas de `Board.applyMove()` y los contratos de bordes en `Board.getCell()`.

---

## Phase 4: Comparación
### 4.1 Daikon vs. `repOK()`

A continuación se comparan los invariantes inferidos por Daikon a partir de la traza de **tests manuales** con las propiedades de representación formalizadas en los métodos `repOK()` de `Cell` y `Board`:

| Invariante en `repOK()` | ¿Inferred por Daikon (Tests Manuales)? | Comentario / Observación |
| --- | --- | --- |
| `Cell`: valor no negativo (`value >= 0`) | **Sí** | `this.value >= 0` en `Cell:::OBJECT`. |
| `Cell`: valor $\neq 1$ | **No** | Daikon no infirió la exclusión estática del valor 1 al no ser una plantilla estándar de su librería. |
| `Cell`: valor es 0 o potencia de 2 | **Parcial** | Lo infirió únicamente como postcondición en `canMergeWith` y celda activa en `isEmpty()`, no como regla global de objeto. |
| `Board`: `size > 0` | **No** | Relacionó `size` con la dimensión de la matriz (`size == size(grid[])`), pero no dedujo el límite inferior explícito `size > 0`. |
| `Board`: `score >= 0` | **Sí** | Coincide exactamente con `this.score >= 0` en `Board:::OBJECT`. |
| `Board`: `grid` no nula y matriz cuadrada | **Parcial** | Deduce `grid != null` y el tamaño de las filas, pero no valida la longitud de cada columna individual. |
| `Board`: ninguna celda nula y `cell.repOK()` | **No** | Excede la capacidad de la librería de plantillas de Daikon sobre cuantificación anidada en arreglos multidimensionales. |

**Invariantes nuevas y útiles descubiertas por Daikon (Tests Manuales):**

Daikon detectó la propiedad `this.spawner != null` en `Board:::OBJECT`, la cual representa un contrato válido para evitar un estado nulo en la estrategia de generación de fichas que no estaba contemplado originalmente en `Board.repOK()`.

---

#### Impacto de la Traza Ampliada (Randoop + Fuzzer) sobre `repOK()`

Al integrar las trazas automáticas masivas (**Randoop + Fuzzer**), Daikon no solo reafirmó la estructura básica de `repOK()`, sino que aportó contratos de comportamiento y leyes algebraicas del dominio que enriquecen la especificación del sistema:

| Propiedad / Contrato Descubierto | Invariante Inferido (Randoop + Fuzzer) | Aporte y relación con `repOK()` |
| --- | --- | --- |
| **`Cell`**: Ley de conservación en fusión | `2 * this.value - return.value == 0` | Complementa la validación estática de `repOK()` estableciendo la ley de transición del método `Cell.mergeWith()` ($\text{return} = 2 \times \text{value}$). |
| **`Board`**: Preservación de puntaje en movimientos nulos | `(return == false) ==> (this.score == orig(this.score))` | Formaliza que ante jugadas no válidas o bloqueadas en `Board.applyMove()`, el marcador permanece idéntico al estado previo a la llamada. |
| **`Board`**: Precondición de rango en accesos | `row >= 0`, `col >= 0`, `row <= size(grid[]) - 1`, `col <= size(grid[]) - 1` | Define los límites exactos de entrada en `Board.getCell()` para garantizar que las consultas no violen la integridad del objeto ni disparen excepciones descontroladas (`IndexOutOfBoundsException`). |

---

### 4.2 Comparación de enfoques de oráculos

| Fuente | Método de producción | Fortalezas | Debilidades |
| --- | --- | --- | --- |
| **Aserciones manuales** | Escritura manual | Alta intención semántica y precisión. | Costoso y propenso a omitir casos borde. |
| **`repOK()`** | Escritura manual | Reutilizable en cualquier momento del ciclo. | Limitado a lo que el programador anticipe. |
| **Randoop** | Captura automática de ejecuciones | Gran exploración sin esfuerzo manual. | Aserciones frágiles y sin semántica real. |
| **EvoSuite** | Algoritmos genéticos/cobertura | Maximiza la cobertura de código. | Captura el comportamiento actual (incluidos errores). |
| **Daikon** | Inferencia dinámica estadística | Descubre relaciones implícitas entre variables. | Sensible a la calidad de la traza (*overfitting*). |

#### Evaluación sobre la traza base (Tests Manuales)

Considerando únicamente la suite de tests manuales, la combinación de **aserciones manuales semánticas y el método `repOK()`** resultó ser el enfoque más útil. En esta etapa, Daikon generó invariantes demasiado fuertes o espurios (como restringir fusiones a $\{2, 4\}$ o asumir que `score` siempre era múltiplo del tamaño), demostrando que la inferencia dinámica sobre suites pequeñas requiere supervisión humana obligatoria.

#### Reevaluación de Daikon tras la ampliación con Randoop y Fuzzer

La inclusión de la traza ampliada (**Randoop + Fuzzer**) transforma significativamente la utilidad de Daikon en el flujo de desarrollo:

* **Eliminación del overfitting:** Al exponer a la herramienta a miles de ejecuciones aleatorias y partidas completas de 2048, Daikon descartó automáticamente todas las restricciones numéricas espurias sin intervención humana.
* **Descubrimiento de leyes algebraicas:** Reveló ecuaciones exactas ($2 \times \text{this.value} = \text{return.value}$) que habrían sido laboriosas de formalizar a mano.
* **Sinergia entre técnicas:** Daikon demuestra su máximo potencial no como un sustituto de los oráculos manuales, sino como una **herramienta de auditoría y descubrimiento de especificaciones**. Utilizar Randoop y el Fuzzer para generar volumen de trazas y Daikon para sintetizar dichas ejecuciones en invariantes legibles proporciona al desarrollador candidatos sólidos para enriquecer el método `repOK()` y las aserciones de regresión.

