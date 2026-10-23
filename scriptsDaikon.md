# Scripts y comandos de Daikon + EvoSuite

Este archivo junta todos los comandos usados para generar tests con EvoSuite, recolectar trazas con Chicory e inferir invariantes con Daikon sobre `Cell` y `Board`, con una explicación de qué hace cada uno.

Todos los comandos se corren desde la raíz del repositorio.

---

## 0. Versión de Java

EvoSuite 1.0.6 necesita **Java 8**, pero Daikon 5.9 necesita **Java 11 o más**. El `mise.toml` del proyecto fija Java 11, así que dentro del repo `java` ya es la 11:

```bash
mise current java      # muestra la versión que activa mise en esta carpeta
java -version          # openjdk version "11.0.2"
```

Para correr un único comando con Java 8 sin cambiar `mise.toml`:

```bash
mise exec java@temurin-8 -- <comando>
```

`mise exec` pone Java 8 en el `PATH` solo durante ese comando. Cuando termina, se vuelve a usar lo que dice `mise.toml`.

---

## 1. Generar los tests con EvoSuite (opcional)

```bash
mise exec java@temurin-8 -- ./runEvosuite.sh
```

El script `runEvosuite.sh`:

1. Descarga `evosuite-1.0.6.jar` si no está.
2. Corre `mvn clean compile`.
3. Corre EvoSuite sobre `Board`, `Cell` y `Movement`, con 60 segundos de búsqueda por clase (`-Dsearch_budget=60`).
4. Escribe los tests en `src/test/java/ar/edu/unrc/game2048/`. **Reemplaza** los `*_ESTest.java` y `*_ESTest_scaffolding.java` existentes.
5. Corre `mvn test -Pevosuite`.

EvoSuite es aleatorio, así que cada corrida genera tests distintos. Solo hace falta correrlo de nuevo si cambiaron `Board` o `Cell`.

---

## 2. Trazas e invariantes a partir de los tests de EvoSuite

```bash
./scripts/daikon-evosuite.sh
```

El script `scripts/daikon-evosuite.sh` se corre con Java 11 y hace lo siguiente:

1. **Compila y arma el classpath:** corre `mvn test-compile` y guarda en `target/cp.txt` las dependencias (JUnit, runtime de EvoSuite, etc.).
2. **Adapta los tests de EvoSuite:** copia `Cell_ESTest.java` y `Board_ESTest.java` a `target/daikon-es-src/` y, con `perl`:
   - saca `@RunWith(EvoRunner.class)`, porque el runner de EvoSuite no funciona bajo Chicory;
   - saca `extends ..._ESTest_scaffolding`;
   - borra los tests que hacen `new Board(N)` con N de 3 dígitos o más. Esos tests superan el tiempo límite y siguen escribiendo en la traza, que queda corrupta.

   Después compila los tests a `target/daikon-es-classes/`. Los archivos de `src/` no se modifican.
3. **Recolecta la traza con Chicory:** corre los tests con JUnit e instrumenta solo `Board` y `Cell` (el mismo patrón que usó la traza de los tests manuales, así las dos trazas se pueden combinar), sin los `_ESTest`. Genera `daikon-traces/evosuite.dtrace.gz`.
4. **Infiere los invariantes con Daikon:** genera
   - `daikon-invariants/ConsoleLauncherEvosuite.inv.gz` (binario, para `PrintInvariants`);
   - `daikon-invariants/daikon-output-evosuite.txt` (texto, con todas las clases mezcladas).

Las dos partes centrales del script son:

```bash
# Chicory: ejecuta los tests e instrumenta solo Board y Cell
java -cp "lib/daikon.jar:target/classes:$CLS:$CP" \
     daikon.Chicory \
     --output-dir=daikon-traces \
     --dtrace-file=evosuite.dtrace.gz \
     --ppt-select-pattern='^ar\.edu\.unrc\.game2048\.(Board|Cell)(\.|:::)' \
     --ppt-omit-pattern='_ESTest' \
     org.junit.runner.JUnitCore \
     ar.edu.unrc.game2048.Cell_ESTest ar.edu.unrc.game2048.Board_ESTest

# Daikon: infiere invariantes a partir de la traza
java -cp lib/daikon.jar daikon.Daikon \
     -o daikon-invariants/ConsoleLauncherEvosuite.inv.gz daikon-traces/evosuite.dtrace.gz \
     > daikon-invariants/daikon-output-evosuite.txt
```

> **Nota:** al principio de la salida, Daikon informa *"No return from procedure observed N times"*. Son llamadas que terminaron con una excepción (por ejemplo `getCell` con una posición inválida). Daikon las descarta, así que las entradas inválidas que genera EvoSuite no aportan invariantes.

---

## 3. Salida legible por clase (recomendado)

`daikon-output-evosuite.txt` tiene unas 1100 líneas, mezcla `Cell` y `Board` e incluye secciones condicionales y redundantes. Con opciones oficiales de Daikon se puede obtener un archivo por clase más fácil de leer: `Cell` queda en 161 líneas y `Board` en 569.

```bash
# Cell
java -cp lib/daikon.jar daikon.Daikon \
  --config_option daikon.split.PptSplitter.disable_splitting=true \
  --ppt-select-pattern='^ar\.edu\.unrc\.game2048\.Cell[.:]' \
  --no_text_output -o daikon-invariants/cell.inv.gz daikon-traces/evosuite.dtrace.gz

java -cp lib/daikon.jar daikon.PrintInvariants --suppress_redundant \
  daikon-invariants/cell.inv.gz > daikon-invariants/cell-invariants.txt

# Board
java -cp lib/daikon.jar daikon.Daikon \
  --config_option daikon.split.PptSplitter.disable_splitting=true \
  --ppt-select-pattern='^ar\.edu\.unrc\.game2048\.Board[.:]' \
  --no_text_output -o daikon-invariants/board.inv.gz daikon-traces/evosuite.dtrace.gz

java -cp lib/daikon.jar daikon.PrintInvariants --suppress_redundant \
  daikon-invariants/board.inv.gz > daikon-invariants/board-invariants.txt
```

| Opción | Qué hace |
|---|---|
| `--ppt-select-pattern='...Cell[.:]'` | Infiere solo para los *program points* de esa clase. El `[.:]` evita que el patrón también incluya otras clases cuyo nombre empiece igual. |
| `--config_option daikon.split.PptSplitter.disable_splitting=true` | Desactiva los invariantes condicionales (secciones `;condition="return == true"`). |
| `--no_text_output` | Daikon no imprime nada; solo guarda el `.inv`. |
| `-o archivo.inv.gz` | Guarda los invariantes en binario (equivale a `--save_inv_to`). |
| `PrintInvariants --suppress_redundant` | Reimprime el `.inv` sin los invariantes que se deducen lógicamente de otros. |

### Cómo leer la salida

- `Clase:::OBJECT` → **invariante de clase**.
- `Clase.metodo(...):::ENTER` → **precondición**.
- `Clase.metodo(...):::EXIT` → **postcondición**. Junta todas las salidas del método.
- `Clase.metodo(...):::EXIT75`, `EXIT81`, etc. → postcondición de un `return` concreto (el número es la línea del código).
- `orig(x)` → valor de `x` al entrar al método (equivale a `\old(x)` en JML).
- Las líneas del tipo `Cell.EMPTY == orig(Cell.EMPTY)` solo dicen que la constante no cambió; son triviales.

---

## 4. Otros formatos de salida

`PrintInvariants` reimprime un `.inv` sin volver a hacer la inferencia. Con `--format` se puede cambiar la notación:

```bash
java -cp lib/daikon.jar daikon.PrintInvariants --format java daikon-invariants/cell.inv.gz
java -cp lib/daikon.jar daikon.PrintInvariants --format jml  daikon-invariants/cell.inv.gz
```

Formatos disponibles: `daikon` (por defecto), `java`, `jml`, `esc`, `dbc`. El formato `java` es útil para comparar con `repOK()`.

Para ver todas las opciones:

```bash
java -cp lib/daikon.jar daikon.PrintInvariants --help
```

---

## 5. Combinar los tests manuales con los de EvoSuite

Daikon acepta varias trazas a la vez e infiere invariantes que se cumplen en **todas**. Combinar trazas sirve para ver si los invariantes espurios desaparecen al ampliar las ejecuciones (sección 3.4 del informe). La traza de los tests manuales es `ConsoleLauncherManual.dtrace.gz` (sección 1.2 del informe):

```bash
java -cp lib/daikon.jar daikon.Daikon -o daikon-invariants/ConsoleLauncherManualEvosuite.inv.gz \
  daikon-traces/ConsoleLauncherManual.dtrace.gz daikon-traces/evosuite.dtrace.gz \
  > daikon-invariants/daikon-output-manual-evosuite.txt
```

> Las dos trazas tienen que generarse con el mismo `--ppt-select-pattern`. Si no, Daikon falla con *"Duplicate declaration of program point ... with a different number of VarInfo objects"*.
>
> Usar siempre `-o`: sin esa opción, Daikon guarda el `.inv.gz` en la carpeta actual con el nombre de la primera traza y pisa `ConsoleLauncherManual.inv.gz`.

---

## 6. Combinar EvoSuite con el fuzzer

EvoSuite aporta variedad de objetos (tamaños de tablero, spawners), pero no de valores: el score máximo en su traza es 16. El fuzzer del Assignment 3 juega partidas largas y aporta celdas y puntajes altos.

```bash
mvn clean
./scripts/daikon-evosuite-fuzzer.sh
```

El script `scripts/daikon-evosuite-fuzzer.sh` se corre con Java 11 y `python3`:

1. **Corre `scripts/daikon-evosuite.sh`** (sección 2) y obtiene `daikon-traces/evosuite.dtrace.gz`.
2. **Juega 5 partidas en el CLI bajo Chicory**, con el mismo `--ppt-select-pattern` que la traza de EvoSuite. Genera `daikon-traces/fuzzer1.dtrace.gz` … `fuzzer5.dtrace.gz`.
3. **Corre Daikon sobre las 6 trazas juntas** y genera `daikon-invariants/ConsoleLauncherEvosuiteFuzzer.inv.gz` y `daikon-invariants/daikon-output-evosuite-fuzzer.txt`.

La parte central de cada partida es:

```bash
python3 -c "import random; random.seed($i)
from fuzzer import RandomFuzzer
print(RandomFuzzer(1000, 3000).fuzz(), end='')" \
  | java -cp "lib/daikon.jar:target/classes" daikon.Chicory \
      --output-dir=daikon-traces \
      --dtrace-file=fuzzer$i.dtrace.gz \
      --ppt-select-pattern='^ar\.edu\.unrc\.game2048\.(Board|Cell)(\.|:::)' \
      ar.edu.unrc.game2048.MainCLI > /dev/null
```

| Parte | Qué hace |
|---|---|
| `random.seed($i)` | Fija la aleatoriedad: la partida `i` siempre tiene las mismas jugadas, así el resultado es reproducible. El CLI usa el spawner determinístico, así que la partida completa se repite igual. |
| `RandomFuzzer(1000, 3000).fuzz()` | Genera entre 1000 y 3000 jugadas al azar (`a`, `s`, `w`, `d`) y termina con `q`. |
| `\| java ... daikon.Chicory ... MainCLI` | Le pasa las jugadas al juego por la entrada estándar mientras Chicory registra la ejecución. |
| `> /dev/null` | Oculta los tableros que imprime el juego. |

> El comando del enunciado `python3 fuzzer.py | java ... MainCLI` no funciona con nuestro `fuzzer.py`: su `main()` ejecuta el juego por su cuenta y solo imprime un resumen PASS/FAIL. Por eso se usa directamente la clase `RandomFuzzer`.

Con las 5 partidas (puntajes de 568 a 2268) se eliminan `{2, 4}` en `canMergeWith`, `{4, 8}` en `mergeWith` y `WINNING_VALUE > score`. Siguen `score % size == 0` y `DEFAULT_SIZE != size-1`, porque el CLI siempre juega en 4x4. El detalle está en la sección 3.4.2 del informe.

---

## 7. Lo que no funcionó: `Annotate`

Daikon tiene una herramienta, `daikon.tools.jtb.Annotate`, que inserta los invariantes como comentarios en el código fuente:

```bash
java -cp lib/daikon.jar daikon.tools.jtb.Annotate --format java daikon-invariants/ConsoleLauncherEvosuite.inv.gz Cell.java
```

Con este proyecto falla con `java.lang.Error: This can't happen` y genera un `Cell.java-javaannotated` vacío. Lo más probable es que su parser no reconozca alguna sintaxis moderna del código, pero no se investigó.
