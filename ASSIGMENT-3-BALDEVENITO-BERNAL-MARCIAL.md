# Assignment 3: Automated Test Generation and Fuzzing

**Integrantes:** Joaquín Baldevenito, Emiliano Bernal, Valentín Marcial

**Modos de ejecución:** cada suite tiene su perfil Maven: `manual` (por defecto: `BoardTest`, `CellTest`, `MovementTest`), `randoop` (`randoopTests.RegressionTest`) y `evosuite` (`*_ESTest`).

```bash
mvn clean test jacoco:report -P<perfil>               # tests + cobertura (target/site/jacoco/)
mvn test-compile pitest:mutationCoverage -P<perfil>   # mutación (target/pit-reports/)
mvn clean compile && python3 fuzzer.py                # fuzzer (con -ea)
```

---

# Fase 1: Generación automática de tests con EvoSuite

## Metricas de cobertura Randoop vs. EvoSuite

### Cómo se midió

Las tres suites se midieron con el mismo procedimiento (JaCoCo + PIT 1.15.0), usando los comandos de *Modos de ejecución* con el perfil de cada una.


Generación de las suites automáticas:

```bash
# Randoop (--time-limit=30, las 3 clases juntas)
mvn clean compile
java -cp "lib/randoop-all-4.3.4.jar:target/classes" randoop.main.Main gentests \
  --testclass=ar.edu.unrc.game2048.Cell \
  --testclass=ar.edu.unrc.game2048.Board \
  --testclass=ar.edu.unrc.game2048.Movement \
  --time-limit=30 --junit-output-dir=src/test/java --junit-package-name=randoopTests

# EvoSuite (search_budget=60 por clase; ver runEvosuite.sh)
java -jar evosuite-1.0.6.jar -projectCP target/classes -class <Clase> \
  -Dsearch_budget=60 -Dtest_dir=src/test/java -Duse_separate_classloader=false
```

### Resumen global

| Suite    | Tests | Line Coverage | Branch Coverage | Mutation Coverage | Test Strength | Mutantes sin cubrir |
|----------|:-----:|:-------------:|:---------------:|:-----------------:|:-------------:|:-------------------:|
| Manual   | 101   | 76%           | 74%             | 75% (177/237)     | 100%          | 60                  |
| Randoop  | 1243  | 71%           | 66%             | 62% (148/237)     | 95%           | 82                  |
| EvoSuite | 83    | 82%           | 80%             | 74% (175/237)     | 89%           | 40                  |

### Mutation Coverage por clase

| Clase                | Manual | Randoop | EvoSuite |
|----------------------|:------:|:-------:|:--------:|
| Board                | 83%    | 63%     | 78%      |
| Cell                 | 74%    | 71%     | 88%      |
| Movement             | 100%   | 100%    | 100%     |
| AddRandomTile        | 0%     | 0%      | 17%      |
| AddTileDeterministic | 100%   | 67%     | 33%      |
| MainCLI              | 0%     | 0%      | 0%       |

### Manual

| Clase                  | Line Coverage | Branch Coverage | Mutation Coverage | Test Strength |
|------------------------|:-------------:|:---------------:|:-----------------:|:-------------:|
| Board                  | 90%           | 80%             | 83% (110/132)     | 100%          |
| Board.Position         | 100%          | 90%             | —                 | —             |
| Board.Direction        | 100%          | n/a             | —                 | —             |
| Cell                   | 80%           | 76%             | 74% (31/42)       | 100%          |
| Movement               | 98%           | 95%             | 100% (33/33)      | 100%          |
| Movement.MoveResult    | 100%          | n/a             | —                 | —             |
| AddRandomTile          | 0%            | 0%              | 0% (0/6)          | n/a           |
| AddTileDeterministic   | 100%          | 100%            | 100% (3/3)        | 100%          |
| MainCLI                | 0%            | 0%              | 0% (0/21)         | n/a           |

**Global:** Line 76% | Branch 74% | Mutation Coverage 75% | Test Strength 100%

*Diferencia con el Assignment 2:* allí la suite manual reportaba 88% de líneas, 90% de branches y 88% de mutación. Estos valores son menores porque se midió la misma suite contra el código actual, que cambió después de aquella medición: se agregaron `repOK()` en `Board` y `Cell`, cambió la lógica de merge de `Cell` y se incorporaron las estrategias `AddRandomTile` / `AddTileDeterministic`. Los tests manuales no ejercitan ese código (por ejemplo, `AddRandomTile` queda en 0%), así que baja el porcentaje total.

### Randoop (--time-limit=30)

Randoop generó 1243 regression tests (`RegressionTest0`: 500, `RegressionTest1`: 500, `RegressionTest2`: 243), sin tests inválidos ni tests que revelen errores.

| Clase                  | Line Coverage | Branch Coverage | Mutation Coverage | Test Strength |
|------------------------|:-------------:|:---------------:|:-----------------:|:-------------:|
| Board                  | 79%           | 64%             | 63% (83/132)      | 93%           |
| Board.Position         | 92%           | 80%             | —                 | —             |
| Board.Direction        | 100%          | n/a             | —                 | —             |
| Cell                   | 77%           | 79%             | 71% (30/42)       | 100%          |
| Movement               | 98%           | 95%             | 100% (33/33)      | 100%          |
| Movement.MoveResult    | 100%          | n/a             | —                 | —             |
| AddRandomTile          | 0%            | 0%              | 0% (0/6)          | n/a           |
| AddTileDeterministic   | 100%          | 100%            | 67% (2/3)         | 67%           |
| MainCLI                | 0%            | 0%              | 0% (0/21)         | n/a           |

**Global:** Line 71% | Branch 66% | Mutation Coverage 62% | Test Strength 95%

### EvoSuite (search_budget=60 por clase)

| Clase                  | Line Coverage | Branch Coverage | Mutation Coverage | Test Strength |
|------------------------|:-------------:|:---------------:|:-----------------:|:-------------:|
| Board                  | 96%           | 82%             | 78% (103/132)     | 89%           |
| Board.Position         | 92%           | 90%             | —                 | —             |
| Board.Direction        | 100%          | n/a             | —                 | —             |
| Cell                   | 94%           | 92%             | 88% (37/42)       | 92%           |
| Movement               | 98%           | 95%             | 100% (33/33)      | 100%          |
| Movement.MoveResult    | 100%          | n/a             | —                 | —             |
| AddRandomTile          | 88%           | 50%             | 17% (1/6)         | 20%           |
| AddTileDeterministic   | 100%          | 100%            | 33% (1/3)         | 33%           |
| MainCLI                | 0%            | 0%              | 0% (0/21)         | n/a           |

**Global:** Line 82% | Branch 80% | Mutation Coverage 74% | Test Strength 89%

#### Nota: PIT con los tests de EvoSuite

Los tests que genera EvoSuite no son JUnit "puro": usan `@RunWith(EvoRunner.class)` y una clase de *scaffolding* que dependen del runtime de EvoSuite (`evosuite-standalone-runtime`). Ese runtime reemplaza por mocks todo lo que no es determinista (`Random`, la hora del sistema, archivos, red), para que los asserts den siempre el mismo resultado.

PIT, por su parte, prueba cada mutante reemplazando "en caliente" la clase ya cargada por su versión mutada, que arma a partir del `.class` original. La JVM solo permite ese reemplazo si cambia el código de los métodos, no si cambia la jerarquía de la clase. Como el mutante no tiene la interfaz que agregó EvoSuite, la JVM lo rechaza:

```
java.lang.UnsupportedOperationException: class redefinition failed: attempted to change superclass or interfaces
```

Con `pitest-junit5-plugin` en el perfil `evosuite` ocurrió exactamente eso: 197 de 237 mutantes terminaron en `RUN_ERROR`. PIT los cuenta como "matados", así que el reporte daba un 83% de mutation coverage falso. Al quitar ese plugin, PIT ejecuta los tests con su soporte nativo de JUnit 4, el error desaparece (0 `RUN_ERROR`) y se obtienen los valores de la tabla. Esto se verificó empíricamente; no se investigó en detalle por qué el runner de JUnit 4 evita el conflicto.


## Respuestas a la inspeccion de EvoSuite

**¿Qué tipo de entradas generó EvoSuite?**
Mayormente entradas "normales" del dominio: `new Board()` (32 veces), tableros chicos (`new Board(1)`, `new Board(3)`), copias (`new Board(board0)`) y celdas válidas (`new Cell(2)`, `new Cell(8)`, `new Cell(0)`). También buscó los bordes para cubrir las ramas de validación: valores inválidos para `Cell` (`new Cell(-404)`, `new Cell(1)`, `new Cell(2388)`), posiciones fuera del tablero (`new Board.Position(2048, 3775)`, `new Board.Position(4, -2660)`), strings arbitrarios para `Board.Direction.valueOf("7PD,jy")` y parámetros `null`. Además construyó tableros con `AddRandomTile` y usó `Random.setNextRandom(...)` del runtime para fijar la aleatoriedad.

**¿Los oráculos son significativos o son mayormente de regresión?**
Son mayormente de regresión: capturan lo que el código hacía al momento de generarlos, no lo que debería hacer. Por ejemplo, hay muchos `assertEquals(4, board0.getSize())`, `assertEquals(0, board0.getScore())` y aserciones repetidas sobre las constantes (`assertEquals(2048, Board.WINNING_VALUE)` aparece varias veces en el mismo test). Los más útiles son:
- `assertTrue(board0.repOK())`, que EvoSuite incluyó porque el método existe, y que verifica el invariante;
- las verificaciones de excepción (`fail(...)` + `verifyException(...)`, 37 casos), que comprueban que las validaciones de `Board` y `Cell` rechazan entradas inválidas.

Ningún assert expresa una regla del juego del tipo "después de mover a la izquierda, dos `2` se combinan en un `4`" con la intención explícita que tiene un test manual.


**¿EvoSuite encontró bugs?**
No. Todas las excepciones que capturó son validaciones esperadas del código: posiciones fuera del tablero (`IndexOutOfBoundsException` con mensajes como `Position (4, 4) is out of bounds for board size 1`), valores inválidos de `Cell` y `Board.Direction.valueOf(...)` con nombres que no existen. Ningún test generado revela un comportamiento incorrecto del juego.

## Comparación EvoSuite vs. Randoop

| Aspecto                   | Randoop                                           | EvoSuite                                                   |
|---------------------------|---------------------------------------------------|------------------------------------------------------------|
| Estrategia                | Aleatoria dirigida por feedback (secuencias de llamadas) | Algoritmo genético guiado por cobertura (branch distance) |
| Tamaño de la suite        | 1243 tests                                        | 83 tests                                                   |
| Line / Branch             | 71% / 66%                                         | 82% / 80%                                                  |
| Mutation Coverage         | 62%                                               | 74%                                                        |
| Test Strength             | 95%                                               | 89%                                                        |
| Mutantes sin cubrir       | 82                                                | 40                                                         |

**Similitudes:** las dos generan oráculos de regresión (observan el comportamiento actual y lo congelan), las dos usan `repOK()` como chequeo de invariante, y ninguna cubre `MainCLI`, porque su entrada es `System.in` y no una API de métodos. En `Movement` las dos llegan al 100% de mutación.

## Resumen: EvoSuite vs Randoop vs tests manuales

- **EvoSuite** cubre más código con muchos menos tests, porque busca a propósito las partes que faltan. Por eso mata más mutantes (175 contra 148) y deja menos sin cubrir (40 contra 82).
- **Randoop** tiene tests más "fuertes": verifican mejor lo que ejecutan (Test Strength 95% contra 89%). EvoSuite a veces corre código pero no chequea bien el resultado. Ejemplo: en `AddRandomTile` cubre el 88% de las líneas pero mata solo 1 de 6 mutantes.
- **Integración:** Randoop es más fácil, sus tests son JUnit puro y andan con PIT sin cambios. EvoSuite necesita su propio runtime, lo que trajo problemas con `pitest-junit5-plugin`.
- **Legibilidad:** las dos generan tests difíciles de leer. Randoop hace muchos y repetitivos; EvoSuite hace pocos pero largos, con nombres genéricos.
- **Contra la suite manual (101 tests):** la manual gana en Test Strength (100%) y en mutación de `Board` (83%), porque sus asserts expresan las reglas del juego. EvoSuite la supera en cobertura de líneas (82% contra 76%) y en mutación de `Cell` (88% contra 74%).

---
# Fase 2: Fuzzing

`fuzzer.py` sigue la estructura de *The Fuzzing Book* y separa dos responsabilidades:

- **`Fuzzer`** genera entradas. `RandomFuzzer.fuzz()` devuelve un string con una secuencia de teclas, una por línea, que termina en `q`.
- **`Runner`** ejecuta el programa bajo prueba. `CLIRunner` lanza `java -ea -cp ./target/classes ar.edu.unrc.game2048.MainCLI` como subproceso, le pasa la entrada por `stdin` (timeout de 10 segundos) y clasifica el resultado:
  - **PASS:** el proceso termina con código 0 y sin salida en `stderr`.
  - **FAIL:** código de salida distinto de 0 o algo escrito en `stderr`, por ejemplo una excepción o un `AssertionError` de `repOK()`.
  - **UNRESOLVED:** el proceso supera el timeout.

`main()` repite el ciclo *generar → ejecutar → clasificar* 20 veces, imprime cada entrada con su resultado y al final muestra un resumen con la cantidad de PASS/FAIL/UNRESOLVED. Al estar separados, se podría combinar otro fuzzer (por ejemplo, uno basado en mutación) con el mismo runner.

## Fuzz function implementation
The function `def fuzz(self) -> str:` returns a string with a sequence of movements for the 2048 game.

The function use parameters (`self.min_length` and `self.max_length`) to define how many movements to generate and pick keys randomly from the KEYS list.

The function starts with a empty string and using the random library we use `random.randrange(self.min_length, self.max_length)` to generate a random length for the string.

The function then uses a loop to pick random keys from the KEYS list and append them to the string until the desired length is reached. Finally, the function return the string with a QUIT key.

### Resultados del fuzzer

Con la configuración de `main()` (1000 a 50000 movimientos, 20 corridas): **20 PASS, 0 FAIL, 0 UNRESOLVED**. El programa nunca terminó con un código distinto de 0 ni escribió en `stderr`.

Para ver qué tan lejos llegan las partidas según la longitud de la entrada, se hicieron corridas adicionales midiendo la ficha máxima alcanzada:

| Movimientos por entrada | Corridas | Resultado  | Llegan a *Game Over* | Ficha máxima | Ficha mediana | Score máximo |
|-------------------------|:--------:|------------|:--------------------:|:------------:|:-------------:|:------------:|
| 10 – 50                 | 50       | 50 PASS    | 0                    | 32           | 16            | 268          |
| 500 – 2000              | 30       | 30 PASS    | 30                   | 256          | 128           | 3316         |

Con entradas cortas, el fuzzer solo explora el principio del juego: nunca llena el tablero ni llega a *Game Over*. Con entradas largas, todas las partidas terminan en *Game Over* antes de 2048, por lo que el camino de victoria (`isWinningBoard()`) nunca se ejercita con movimientos aleatorios. Esto justifica el rango de 1000 a 50000 de `main()`: garantiza que cada partida termine, aunque los movimientos posteriores al *Game Over* ya no se ejecutan.

## Resultados de integrar repOk con -ea

Se agregó `assert board.repOK() : "Invariant violated: Board state is invalid!";` en `MainCLI.play()`, después de procesar cada movimiento. El runner del fuzzer ejecuta ahora `java -ea ...` para que las aserciones estén activas. `Board.repOK()` verifica tamaño positivo, score no negativo, grilla `size × size` sin celdas `null`, y que cada `Cell` cumpla su propio `repOK()` (valor 0 o potencia de 2 mayor que 1).

Con `-ea`, las 20 corridas de `main()` (1000 a 50000 movimientos), 100 corridas de 10 a 50 movimientos y 30 corridas de 500 a 2000 movimientos dieron **todas PASS**. Ninguna aserción falló.

**Bugs encontrados:** ninguno. No hay input mínimo reproducible para reportar.

Interpretación:
- `repOK()` hace al fuzzer más sensible: sin él, un tablero con un `3` o un score negativo no habrían producido error visible. En estas corridas, el invariante se mantuvo en todos los estados alcanzados.
- `repOK()` verifica la **forma** del estado, no las **reglas** del juego. Un bug que combine mal las fichas (por ejemplo, `2 2 2 2 → 8 . . .` en vez de `4 4 . .`) o que sume mal el score dejaría un tablero "válido" y pasaría inadvertido.
- `new Board()` usa `AddTileDeterministic` (siempre un `2` en la primera posición vacía), así que el juego que ejecuta el fuzzer es determinista y no aparece un `4` nuevo. Eso reduce la variedad de estados que explora.

## Reflexiones sobre que tecnica funciono mejor

Para este programa, **EvoSuite fue la técnica más efectiva en la capa de lógica**: logró la mayor cobertura de líneas y ramas (82% / 80%), la mutation coverage más alta entre las técnicas automáticas (74%) y la menor cantidad de mutantes sin cubrir (40), con solo 83 tests. Su búsqueda guiada por cobertura llega a ramas de validación y a `AddRandomTile`, que Randoop no alcanzó.

Aun así, ninguna técnica automática reemplazó a la **suite manual** en calidad de oráculos: con 101 tests obtiene 75% de mutation coverage y 100% de test strength, porque sus asserts expresan reglas del juego y no solo "lo que el código devolvió". Las suites generadas son, sobre todo, buenas **suites de regresión**.

**Randoop** produjo la suite más grande (1243 tests) con la menor cobertura (71% líneas, 62% mutación). Sus asserts son efectivos sobre lo que cubre (95% de test strength), pero la generación aleatoria no llega a las ramas difíciles.

El **fuzzer** es complementario: es la única técnica que ejercita `MainCLI` (0% en las demás) y el programa de punta a punta. Pero su oráculo es débil (solo crashes, o `repOK()` con `-ea`) y la exploración aleatoria no llega a estados profundos como la victoria. En este caso no encontró bugs, lo que sugiere que las clases principales ya estaban bien testeadas desde los Assignments 1 y 2. Para aprovecharlo más, habría que usar oráculos más fuertes (por ejemplo, comparar el score o el tablero contra un modelo de referencia) o guiar la generación hacia estados más avanzados.

En síntesis: EvoSuite para maximizar cobertura automáticamente, tests manuales para verificar las reglas del dominio, y fuzzing para probar la interfaz real del programa. Combinadas, se cubren las debilidades de cada una.
