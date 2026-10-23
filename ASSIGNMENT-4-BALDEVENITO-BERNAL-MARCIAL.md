# Assignment 4: Generación de Oráculos con Daikon

## Phase 1: Instrumentación y Recolección de Trazas

### 1.2 Comandos ejecutados

Recolectamos trazas de cinco fuentes de ejecución: la suite de pruebas unitarias manuales, los tests generados por **Randoop**, las partidas del **Fuzzer por CLI**, los tests generados por **EvoSuite** y la combinación de **EvoSuite + Fuzzer**. Todos los comandos se corren desde la raíz del repositorio, con Java 11. Las trazas quedan en `daikon-traces/` y los invariantes en `daikon-invariants/`.

#### 1. Traza de pruebas unitarias manuales

```bash
mvn clean test-compile

CP="lib/daikon.jar:target/classes:target/test-classes:$(mvn -q dependency:build-classpath -Dmdep.includeScope=test -DforceStdout)"

java -cp "$CP" daikon.Chicory \
    --ppt-select-pattern='^ar\.edu\.unrc\.game2048\.(Board|Cell)(\.|:::)' \
    --dtrace-file=ConsoleLauncherManual.dtrace.gz \
    --output-dir=daikon-traces \
    org.junit.platform.console.ConsoleLauncher \
    --select-class=ar.edu.unrc.game2048.CellTest \
    --select-class=ar.edu.unrc.game2048.BoardTest

java -cp lib/daikon.jar daikon.Daikon \
    -o daikon-invariants/ConsoleLauncherManual.inv.gz \
    daikon-traces/ConsoleLauncherManual.dtrace.gz \
    > daikon-invariants/daikon-output-manual.txt
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
```

La inferencia de esta traza se hace junto con la del Fuzzer (punto 3).

#### 3. Traza de partidas con el Fuzzer por CLI

```bash
python3 -c "import fuzzer; print(fuzzer.RandomFuzzer(1000, 50000).fuzz(), end='')" \
  | java -cp "lib/daikon.jar:target/classes" daikon.Chicory \
      --ppt-select-pattern='^ar\.edu\.unrc\.game2048\.(Board|Cell|MainCLI)(\.|:::)' \
      --dtrace-file=FuzzerCLI.dtrace.gz \
      --output-dir=daikon-traces \
      ar.edu.unrc.game2048.MainCLI
```

Inferencia conjunta sobre las trazas de Randoop y el Fuzzer:

```bash
java -cp lib/daikon.jar daikon.Daikon \
    -o daikon-invariants/ConsoleLauncherRandoop.inv.gz \
    daikon-traces/ConsoleLauncherRandoop.dtrace.gz daikon-traces/FuzzerCLI.dtrace.gz \
    > daikon-invariants/daikon-output-randoop-fuzzer.txt
```

#### 4. Traza de pruebas automáticas con EvoSuite

```bash
mvn clean
./scripts/daikon-evosuite.sh
```

El comando de los puntos 1 y 2 no funciona con los tests de EvoSuite; el script resuelve los problemas descriptos en la sección 1.4.

#### 5. Traza combinada de EvoSuite + Fuzzer

```bash
mvn clean
./scripts/daikon-evosuite-fuzzer.sh
```

El script corre el punto 4 y le suma 5 partidas del fuzzer con semillas fijas (sección 1.5). Requiere además `python3`.

A continuación se detalla el propósito de cada paso del proceso:

| Paso | Propósito | Comando | Resultado / Observación |
| :--- | :--- | :--- | :--- |
| **1** | Compilar el proyecto y las pruebas | `mvn clean test-compile` | Genera las clases de producción y de test (JUnit y Randoop). |
| **2** | Instrumentación manual | Chicory con `ConsoleLauncher` sobre `CellTest` y `BoardTest` | Genera `daikon-traces/ConsoleLauncherManual.dtrace.gz`. |
| **3** | Instrumentación de Randoop | Chicory con `ConsoleLauncher` sobre el paquete `randoopTests` | Genera `daikon-traces/ConsoleLauncherRandoop.dtrace.gz`. |
| **4** | Instrumentación del Fuzzer | Pipe de `RandomFuzzer` a Chicory sobre `MainCLI` | Genera `daikon-traces/FuzzerCLI.dtrace.gz`. |
| **5** | Instrumentación de EvoSuite | `scripts/daikon-evosuite.sh` | Genera `daikon-traces/evosuite.dtrace.gz` (`OK (79 tests)`). |
| **6** | Instrumentación de EvoSuite + Fuzzer | `scripts/daikon-evosuite-fuzzer.sh` | Genera `daikon-traces/fuzzer1.dtrace.gz` … `fuzzer5.dtrace.gz`. |
| **7** | Inferencia inicial | Daikon sobre la traza manual | Produce `daikon-invariants/daikon-output-manual.txt`. |
| **8** | Inferencia ampliada con Randoop | Daikon sobre las trazas de Randoop y Fuzzer | Produce `daikon-invariants/daikon-output-randoop-fuzzer.txt`. |
| **9** | Inferencia con EvoSuite | Daikon sobre la traza de EvoSuite (lo hace el script del paso 5) | Produce `daikon-invariants/daikon-output-evosuite.txt`. |
| **10** | Inferencia ampliada con EvoSuite + Fuzzer | Daikon sobre la traza de EvoSuite y las 5 del fuzzer (lo hace el script del paso 6) | Produce `daikon-invariants/daikon-output-evosuite-fuzzer.txt`. |

### 1.3 Archivos generados

A partir de las ejecuciones, obtuvimos los siguientes archivos:

**Trazas (`daikon-traces/`):**

* `ConsoleLauncherManual.dtrace.gz`: Traza de ejecuciones de pruebas manuales.
* `ConsoleLauncherRandoop.dtrace.gz`: Traza de ejecuciones exploratorias de Randoop.
* `FuzzerCLI.dtrace.gz`: Traza de una partida masiva generada por el Fuzzer.
* `evosuite.dtrace.gz`: Traza de los tests generados por EvoSuite.
* `fuzzer1.dtrace.gz` … `fuzzer5.dtrace.gz`: Trazas de las 5 partidas del fuzzer usadas junto con EvoSuite.

**Invariantes (`daikon-invariants/`):**

* `daikon-output-manual.txt` y `ConsoleLauncherManual.inv.gz`: Invariantes de la suite manual.
* `daikon-output-randoop-fuzzer.txt` y `ConsoleLauncherRandoop.inv.gz`: Invariantes de la traza ampliada Randoop + Fuzzer.
* `daikon-output-evosuite.txt` y `ConsoleLauncherEvosuite.inv.gz`: Invariantes de los tests de EvoSuite.
* `daikon-output-evosuite-fuzzer.txt` y `ConsoleLauncherEvosuiteFuzzer.inv.gz`: Invariantes de la traza ampliada EvoSuite + Fuzzer.

Los archivos `.txt` son la salida de Daikon en texto plano; los `.inv.gz` son los mismos invariantes serializados en formato binario, que se pueden reimprimir con `daikon.PrintInvariants`.

Al utilizar los patrones de selección `--ppt-select-pattern`, acotamos el monitoreo exclusivamente a los métodos y estados de las clases de dominio `Board` y `Cell` (incluyendo `MainCLI` para el fuzzer por CLI), evitando el ruido y sobrecosto de librerías de Java o componentes internos de JUnit. Las trazas que se combinan en una misma inferencia deben usar el mismo patrón; si no, Daikon falla con *"Duplicate declaration of program point"*.

### 1.4 Adaptaciones para los tests de EvoSuite

El comando de Chicory de los puntos 1 y 2 no funcionó con los tests de EvoSuite (`Cell_ESTest` y `Board_ESTest`):

1. **Classpath vacío:** con `-DforceStdout` Maven no imprime las dependencias. En los puntos 1 y 2 no se nota porque `daikon.jar` ya incluye JUnit, pero los tests de EvoSuite necesitan además su runtime. Guardamos el classpath en un archivo con `-Dmdep.outputFile`.
2. **Chicory rompía a EvoSuite:** instrumentaba todas las clases. Lo limitamos a `Board` y `Cell` con el mismo `--ppt-select-pattern` de los puntos 1 y 2.
3. **Versiones de Java incompatibles:** `EvoRunner` necesita Java 8 y Daikon Java 11. Convertimos los tests a JUnit 4 común, sin `EvoRunner` ni scaffolding.
4. **Tableros gigantes:** dos tests crean tableros de más de 1000×1000 que corrompen o inflan la traza. Los excluimos (corren 79 de 81).

Todo quedó automatizado en `scripts/daikon-evosuite.sh`:

| Paso | Qué hace el script |
| :--- | :--- |
| **1** | Compila y guarda el classpath en `target/cp.txt`. |
| **2** | Copia los tests de EvoSuite a `target/daikon-es-src/` con las adaptaciones anteriores y los compila. Los tests originales no se modifican. |
| **3** | Corre Chicory con `org.junit.runner.JUnitCore` y genera `daikon-traces/evosuite.dtrace.gz`. |
| **4** | Corre Daikon y genera `daikon-invariants/ConsoleLauncherEvosuite.inv.gz` y `daikon-invariants/daikon-output-evosuite.txt`. |

> Los tests de EvoSuite sin adaptar (con `EvoRunner`) siguen necesitando Java 8. Para correrlos con Maven: `mise exec java@temurin-8 -- mvn test -Pevosuite`.

### 1.5 Adaptaciones para combinar EvoSuite con el Fuzzer

EvoSuite aporta variedad de **objetos** (tableros de muchos tamaños, `AddRandomTile`, excepciones), pero no de **valores**: busca cobertura de código, no jugar partidas, y el score máximo en su traza fue 16. Para cubrir eso combinamos su traza con partidas aleatorias del fuzzer del Assignment 3. Todo quedó en `scripts/daikon-evosuite-fuzzer.sh`:

| Paso | Qué hace el script |
| :--- | :--- |
| **1** | Corre `scripts/daikon-evosuite.sh` y obtiene `daikon-traces/evosuite.dtrace.gz` (sección 1.4). |
| **2** | Juega 5 partidas en el CLI bajo Chicory, con el mismo `--ppt-select-pattern` que la traza de EvoSuite. Las jugadas las genera `RandomFuzzer` de `fuzzer.py` (entre 1000 y 3000 por partida) con semillas fijas, así el resultado es reproducible. Genera `daikon-traces/fuzzer1.dtrace.gz` … `fuzzer5.dtrace.gz`. |
| **3** | Corre Daikon sobre las 6 trazas juntas y genera `daikon-invariants/ConsoleLauncherEvosuiteFuzzer.inv.gz` y `daikon-invariants/daikon-output-evosuite-fuzzer.txt`. |

> El comando del enunciado `python3 fuzzer.py | java ... MainCLI` no funciona con nuestro `fuzzer.py`: su `main()` ejecuta el juego por su cuenta y solo imprime un resumen. Por eso se usa directamente la clase `RandomFuzzer`.

Las 5 partidas terminaron con puntajes de 568, 676, 944, 1356 y 2268. Los resultados se analizan en la sección 3.4.2.

---

## Phase 2: Inferencia de Invariantes

### 2.1 Puntos de programa e invariantes reportados (Traza Manual)

En la primera ejecución sobre la suite manual, Daikon agrupó los hallazgos en los siguientes puntos de programa:

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
| :-: | :--- | :--- | :-: | :-: | :-: | :--- |
| 1 | `this.value >= 0` | `Cell:::OBJECT` | Sí | Sí | Sí | **Correcta y útil** |
| 2 | `this.value >= Cell.EMPTY.value` | `Cell:::OBJECT` | Sí | No | Sí | **Correcta pero trivial** |
| 3 | `this.value == orig(value)` | `Cell.Cell(int):::EXIT` | Sí | Sí | No | **Correcta y útil** |
| 4 | `this.value == other.value` si `return == true` | `Cell.canMergeWith(...):::EXIT` | Sí | Sí | No | **Correcta y útil** |
| 5 | Potencias de 2 y `>= 2` si `return == true` | `Cell.canMergeWith(...):::EXIT` | Sí | Sí | Sí | **Correcta y útil** |
| 6 | `this.value one of {2, 4}` si `return == true` | `Cell.canMergeWith(...):::EXIT` | No | No | No | **Demasiado fuerte** |
| 7 | `return.value one of {4, 8}` | `Cell.mergeWith(...):::EXIT` | No | No | No | **Demasiado fuerte** |

### 3.2 Evaluación de `Board` (Traza Inicial)

| # | Invariante | Punto de programa | ¿Correcta? | ¿Útil? | En `repOK()` | Clasificación |
| :-: | :--- | :--- | :-: | :-: | :-: | :--- |
| 1 | `this.score >= 0` | `Board:::OBJECT` | Sí | Sí | Sí | **Correcta y útil** |
| 2 | `this.grid != null` | `Board:::OBJECT` | Sí | Sí | Sí | **Correcta y útil** |
| 3 | `this.size == size(this.grid[])` | `Board:::OBJECT` | Sí | Sí | Parcial | **Correcta y útil** |
| 4 | `this.grid[] elements != null` | `Board:::OBJECT` | Sí | Sí | Parcial | **Correcta y útil** |
| 5 | `this.spawner != null` | `Board:::OBJECT` | Sí | Sí | No | **Correcta y útil** |
| 6 | `this.spawner` es `AddTileDeterministic` | `Board:::OBJECT` | No | No | No | **Demasiado fuerte** |
| 7 | `this.score % this.size == 0` | `Board:::OBJECT` | No | No | No | **Demasiado fuerte** |
| 8 | `Board.WINNING_VALUE > this.score` | `Board:::OBJECT` | No | No | No | **Demasiado fuerte** |
| 9 | `Board.DEFAULT_SIZE != size(this.grid[])-1` | `Board:::OBJECT` | No | No | No | **Demasiado fuerte** |

### 3.3 Contraejemplos para invariantes demasiado fuertes

* **`this.value one of {2, 4}` en `canMergeWith`:** Al instanciar `new Cell(8)` y llamar a `canMergeWith(new Cell(8))`, el método retorna `true`, violando el conjunto restringido `{2, 4}`.
* **`this.spawner` siempre de tipo `AddTileDeterministic`:** En el juego real se utiliza `AddRandomTile`. Instanciar la clase mediante el constructor de producción viola esta regla.
* **`this.score % this.size == 0`:** En un tablero de tamaño $3$, un movimiento que realiza una fusión de dos celdas de valor $2$ suma $4$ puntos al marcador. Se observa que $4 \bmod 3 = 1 \neq 0$.
* **`Board.WINNING_VALUE > this.score`:** En una partida larga el puntaje puede superar los 2048 puntos. Ni los tests manuales ni los de EvoSuite juegan partidas largas (con EvoSuite el score máximo fue 16); las partidas del fuzzer sí la refutan, con un score de 2268 (ver 3.4.2).
* **`Board.DEFAULT_SIZE != size(this.grid[])-1`:** Equivale a "el tamaño nunca es 5". Construir `new Board(5)` la viola; ninguna suite construyó un tablero de 5x5.

---

### 3.4 Mejora de la cobertura de trazas

Para evaluar el impacto de la diversidad de ejecuciones en la calidad de los oráculos, ampliamos la traza manual de dos formas: combinando **Randoop + Fuzzer** (3.4.1) y combinando **EvoSuite + Fuzzer** (3.4.2).

#### 3.4.1 Traza ampliada con Randoop + Fuzzer

Se recolectó una traza ampliada combinando la exploración automática de **Randoop** y las partidas masivas del **Fuzzer por CLI** (`ConsoleLauncherRandoop.dtrace.gz` y `FuzzerCLI.dtrace.gz`).

| Métrica | Traza Original (Tests Manuales) | Traza Ampliada (Randoop + Fuzzer) |
| --- | --- | --- |
| **Nº de invariantes informados** | 734 | 718 (en `Board` y `Cell`) |
| **Invariantes espurias detectadas** | Acotaba fusiones a $\{2, 4\}$ y `score % size == 0`. | **Eliminadas.** Se descartó la restricción $\{2, 4\}$ y el acoplamiento a múltiplos de tamaño. |
| **Invariantes nuevas y genuinas** | Coincidencias de asignación directas. | **Descubiertas:** $2 \times \text{this.value} = \text{return.value}$ en `mergeWith()`, preservación de score en `applyMove()` y precondiciones de rango. |
| **Puntos de programa (PPTs) cubiertos** | 129 | 137 |
| **Excepciones / Rutas de error (sin retorno)** | 26 | 348 |

##### `Cell` — Invariantes descubiertos en traza ampliada

| # | Invariante | Punto de programa | ¿Correcta? | ¿Útil? | En `repOK()` | Clasificación | Razonamiento |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | `2 * this.value - return.value == 0` | `Cell.mergeWith(...):::EXIT` | Sí | Sí | No | **Correcta y útil** | Ley algebraica real de la fusión: la celda resultante duplica exactamente el valor de la celda combinada. Reemplaza la restricción espuria `{4, 8}` de los tests manuales. |
| 2 | `this.value >= 2` y `this.value is a power of 2` | `Cell.isEmpty():::EXIT;condition="not(return == true)"` | Sí | Sí | Sí | **Correcta y útil** | Confirma que si una celda no está vacía (`return == false`), su valor es obligatoriamente una potencia de 2 válida del dominio. |

##### `Board` — Invariantes descubiertos en traza ampliada

| # | Invariante | Punto de programa | ¿Correcta? | ¿Útil? | En `repOK()` | Clasificación | Razonamiento |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | `(return == false) ==> (this.score == orig(this.score))` | `Board.applyMove(...):::EXIT` | Sí | Sí | No | **Correcta y útil** | Garantiza la preservación del puntaje: si un movimiento no altera el tablero y retorna `false`, el score permanece inalterado. |
| 2 | `row >= 0 && row <= size(this.grid[])-1` | `Board.getCell(int, int):::ENTER` | Sí | Sí | Parcial | **Correcta y útil** | Establece el contrato formal de precondición sobre los límites de filas para prevenir accesos inválidos (`IndexOutOfBoundsException`). |
| 3 | `col >= 0 && col <= size(this.grid[])-1` | `Board.getCell(int, int):::ENTER` | Sí | Sí | Parcial | **Correcta y útil** | Establece la precondición formal sobre los límites de columnas de la matriz. |
| 4 | `return != null` y `return.getClass().getName() == java.util.HashSet.class` | `Board.getEmptyPositions():::EXIT` | Sí | Sí | No | **Correcta y útil** | Garantiza que la consulta de casillas vacías no retorna un valor nulo y asegura el uso de la estructura concreta `HashSet`. |

**¿La ampliación de la traza eliminó las invariantes espurias? ¿Reveló invariantes nuevas?**
**Sí, rotundamente.** Al proporcionar una traza con alta variabilidad (partidas completas con fichas de alto valor como 2048 y miles de llamadas aleatorias a métodos), Daikon descartó automáticamente las falsas generalizaciones sobre los conjuntos acotados $\{2, 4\}$. Además, la diversidad de estados permitió a la herramienta descubrir relaciones algebraicas profundas que la suite manual no había logrado ejercitar con suficiente frecuencia, como la ley de duplicación exacta de valor en `Cell.mergeWith()` ($2 \times \text{this.value} = \text{return.value}$), la preservación del score en jugadas nulas de `Board.applyMove()` y los contratos de bordes en `Board.getCell()`.

#### 3.4.2 Traza ampliada con EvoSuite y EvoSuite + Fuzzer

Comparamos la traza manual con dos trazas: la de los tests de EvoSuite sola (sección 1.4) y la de EvoSuite combinada con 5 partidas del fuzzer (sección 1.5). Los conteos son solo de `Board` y `Cell` y se hicieron con el mismo criterio para las tres columnas (con este criterio la traza manual da 130 puntos y 740 invariantes; la sección 2.1 reporta 129 y 734 con un conteo apenas distinto).

| Métrica | Traza Original (Tests Manuales) | EvoSuite | EvoSuite + Fuzzer |
| :--- | :---: | :---: | :---: |
| **Nº de invariantes informados** | 740 | 802 | 790 |
| **Puntos de programa (PPTs) cubiertos** | 130 | 136 | 140 |
| **Invariantes espurias detectadas** | 6 (filas 6–9 de 3.2 y filas 6–7 de 3.1) | 5: se eliminó la del `spawner` | 3: se eliminaron 4 y apareció 1 más débil (`WINNING_VALUE != score`) |
| **Invariantes nuevas y genuinas** | — | `this.size >= 1` | `this.size >= 1`, `this.score % Board.DEFAULT_SIZE == 0` y `2 * this.value - return.value == 0` |

##### Invariantes espurias de la traza manual

| Invariante espuria | EvoSuite | EvoSuite + Fuzzer | Por qué |
| :--- | :---: | :---: | :--- |
| `this.spawner` siempre `AddTileDeterministic` (`Board:::OBJECT`) | **Eliminada** | **Eliminada** | EvoSuite construye tableros con `AddRandomTile`. Sigue apareciendo en `Board.Board(int):::EXIT`, donde es correcta porque ese constructor siempre lo usa. |
| `this.value one of {2, 4}` (`canMergeWith`, `return == true`) | Se mantiene | **Eliminada** | Las partidas del fuzzer fusionan celdas de 8, 16, 32… |
| `return.value one of {4, 8}` (`mergeWith`) | Se mantiene | **Eliminada** | Mismo motivo. |
| `Board.WINNING_VALUE > this.score` | Se mantiene | **Eliminada** | Una partida terminó con 2268 puntos. En su lugar apareció `WINNING_VALUE != score`, más débil y también espuria: ninguna partida terminó exactamente con 2048. |
| `this.score % this.size == 0` | Se mantiene | Se mantiene | Los tableros de otros tamaños que arma EvoSuite casi no suman puntos, y el fuzzer siempre juega en 4x4, donde coincide con la regla del múltiplo de 4. |
| `Board.DEFAULT_SIZE != size(this.grid[])-1` | Se mantiene | Se mantiene | Ninguna suite construye un tablero de 5x5. |

##### `Cell` — Invariantes descubiertos en traza ampliada

| # | Invariante | Punto de programa | ¿Correcta? | ¿Útil? | En `repOK()` | Clasificación | Razonamiento |
| :-: | :--- | :--- | :-: | :-: | :-: | :--- | :--- |
| 1 | `2 * this.value - return.value == 0` | `Cell.mergeWith(...):::EXIT` | Sí | Sí | No | **Correcta y útil** | Aparece con EvoSuite + Fuzzer: la fusión duplica el valor de la celda. Reemplaza la restricción espuria `{4, 8}`. Coincide con lo encontrado con Randoop + Fuzzer (3.4.1). |

##### `Board` — Invariantes descubiertos en traza ampliada

| # | Invariante | Punto de programa | ¿Correcta? | ¿Útil? | En `repOK()` | Clasificación | Razonamiento |
| :-: | :--- | :--- | :-: | :-: | :-: | :--- | :--- |
| 1 | `this.size >= 1` | `Board:::OBJECT` | Sí | Sí | Sí | **Correcta y útil** | Aparece con EvoSuite, que construye tableros de muchos tamaños. Coincide con la guarda `size > 0` de `Board.repOK()`, que no aparecía con los tests manuales. |
| 2 | `this.score % Board.DEFAULT_SIZE == 0` | `Board:::OBJECT` | Sí | Sí | No | **Correcta y útil** | Aparece con EvoSuite + Fuzzer. Expresa que el score siempre es múltiplo de 4: solo aumenta con el valor de una celda fusionada, que es una potencia de 2 mayor o igual a 4. Daikon la expresó con `DEFAULT_SIZE` porque esa constante vale 4. |

**¿La ampliación de la traza eliminó las invariantes espurias? ¿Reveló invariantes nuevas?**
**EvoSuite sola, solo en parte.** Aporta variedad de **objetos** (tamaños de tablero, `AddRandomTile`, excepciones): eliminó la espuria del `spawner` y reveló `this.size >= 1`. Pero no aporta variedad de **valores**, porque busca cobertura de código y no juega partidas (el score nunca pasó de 16), así que se mantienen `{2, 4}`, `{4, 8}` y las espurias sobre el puntaje. **Combinada con el fuzzer, sí:** las partidas aportan los valores que le faltaban a EvoSuite, se eliminaron 4 de las 6 espurias y aparecieron dos invariantes genuinas más. Las dos espurias que quedan se deben a que ninguna suite juega en tableros de otros tamaños con valores altos.

---

## Phase 4: Comparación

### 4.1 Daikon vs. `repOK()`

A continuación se comparan los invariantes inferidos por Daikon a partir de la traza de **tests manuales** con las propiedades de representación formalizadas en los métodos `repOK()` de `Cell` y `Board`:

| Invariante en `repOK()` | ¿Inferido por Daikon (Tests Manuales)? | Comentario / Observación |
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

#### Impacto de la traza ampliada con EvoSuite y EvoSuite + Fuzzer sobre `repOK()`

| Propiedad / Contrato Descubierto | Invariante Inferido | Aporte y relación con `repOK()` |
| :--- | :--- | :--- |
| **`Board`**: Tamaño positivo | `this.size >= 1` (EvoSuite) | Redescubre la guarda `size > 0` de `Board.repOK()`, que la traza manual no había encontrado. |
| **`Board`**: Score múltiplo de 4 | `this.score % Board.DEFAULT_SIZE == 0` (EvoSuite + Fuzzer) | Propiedad genuina que no está en `Board.repOK()`: candidata a agregarse como `if (this.score % 4 != 0) return false;`. |
| **`Board`**: `spawner` no nulo | Desaparece `this.spawner != null` (EvoSuite) | EvoSuite construye `new Board(2, null)`: el constructor acepta el `null` y el objeto queda a medio construir hasta que falla en `addRandomTile`. Refuerza la candidata `this.spawner != null` de la traza manual, junto con validar el parámetro en el constructor. |

---

### 4.2 Comparación de enfoques de oráculos

| Fuente | Método de producción | Fortalezas | Debilidades |
| :--- | :--- | :--- | :--- |
| **Aserciones manuales** | Escritura manual | Alta intención semántica y precisión. | Costoso y propenso a omitir casos borde. |
| **`repOK()`** | Escritura manual | Reutilizable en cualquier momento del ciclo. | Limitado a lo que el programador anticipe. |
| **Randoop** | Captura automática de ejecuciones | Gran exploración sin esfuerzo manual. | Aserciones frágiles y sin semántica real. |
| **EvoSuite** | Algoritmos genéticos/cobertura | Maximiza la cobertura de código. | Captura el comportamiento actual (incluidos errores). |
| **Fuzzer (CLI)** | Secuencias aleatorias de jugadas | Partidas largas con celdas y puntajes altos. | Siempre juega en 4x4; no explora otros tamaños ni excepciones. |
| **Daikon** | Inferencia dinámica estadística | Descubre relaciones implícitas entre variables. | Sensible a la calidad de la traza (*overfitting*). |

#### Evaluación sobre la traza base (Tests Manuales)

Considerando únicamente la suite de tests manuales, la combinación de **aserciones manuales semánticas y el método `repOK()`** resultó ser el enfoque más útil. En esta etapa, Daikon generó invariantes demasiado fuertes o espurios (como restringir fusiones a $\{2, 4\}$ o asumir que `score` siempre era múltiplo del tamaño), demostrando que la inferencia dinámica sobre suites pequeñas requiere supervisión humana obligatoria.

#### Reevaluación de Daikon tras la ampliación con Randoop y Fuzzer

La inclusión de la traza ampliada (**Randoop + Fuzzer**) transforma significativamente la utilidad de Daikon en el flujo de desarrollo:

* **Eliminación del overfitting:** Al exponer a la herramienta a miles de ejecuciones aleatorias y partidas completas de 2048, Daikon descartó automáticamente todas las restricciones numéricas espurias sin intervención humana.
* **Descubrimiento de leyes algebraicas:** Reveló ecuaciones exactas ($2 \times \text{this.value} = \text{return.value}$) que habrían sido laboriosas de formalizar a mano.
* **Sinergia entre técnicas:** Daikon demuestra su máximo potencial no como un sustituto de los oráculos manuales, sino como una **herramienta de auditoría y descubrimiento de especificaciones**. Utilizar Randoop y el Fuzzer para generar volumen de trazas y Daikon para sintetizar dichas ejecuciones en invariantes legibles proporciona al desarrollador candidatos sólidos para enriquecer el método `repOK()` y las aserciones de regresión.

#### Aporte de EvoSuite

EvoSuite aporta variedad de **objetos** (tamaños de tablero, `AddRandomTile`, excepciones) pero no de **valores**: por sí sola eliminó solo la espuria del `spawner` y recuperó `size > 0`. Combinada con el fuzzer eliminó también `{2, 4}`, `{4, 8}` y `WINNING_VALUE > score`, y reveló que el score siempre es múltiplo de 4 (ver 3.4.2). Más tests no implican datos más variados: cada técnica cubre un tipo de variedad distinto.

**Conclusión:** La combinación de **tests manuales con aserciones semánticas y el método `repOK()`** constituye la aproximación más sólida y confiable. Daikon funciona como un excelente asistente para descubrir propiedades no documentadas, pero sus salidas requieren ser revisadas por un desarrollador para descartar generalizaciones falsas, además, si la test suite no es muy grande y completa no genera condiciones representativas para los métodos, ni para los objetos. Sumar los tests de EvoSuite ayudó solo en parte: eliminó una generalización espuria y recuperó `size > 0`, pero no las espurias sobre valores de celdas y puntaje, porque más tests no implican datos más variados. Esas sí las eliminaron las partidas del fuzzer (ver 3.4.2).
