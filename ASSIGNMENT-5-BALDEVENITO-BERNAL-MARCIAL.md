# Tablero inicial y fuzzing

Añadimos la posibilidad de iniciar una partida con un tablero elegido por el
usuario. El tablero es de 4 x 4 y sus 16 valores se leen de izquierda a derecha
y de arriba hacia abajo. Por ejemplo:

```bash
java -ea -cp target/classes ar.edu.unrc.game2048.MainCLI '[0,0,0,0,4,2,0,0,0,0,0,0,2,2,2,2]'
```

## Cambios en `Board`

El constructor `Board(String values)` crea el tablero a partir del string. Para
que el estado inicial coincida exactamente con los valores recibidos, asigna
cada valor a su celda y no agrega fichas automáticamente.

El constructor también valida que el string tenga corchetes y exactamente 16
valores. Cada valor debe ser un entero válido para una celda: `0` o una potencia
de dos mayor que `1`. Además, el tablero debe tener al menos dos fichas, no
puede contener `2048` y debe permitir movimientos. Si alguna condición no se
cumple, se lanza `IllegalArgumentException`.

Para organizar estas comprobaciones, creamos tres métodos privados:

- `splitInitialBoard(String)` comprueba el formato y separa los valores.
- `parseCellValue(String, int)` convierte cada valor a entero y rechaza valores
  que no sean numéricos o que excedan el rango de `int`.
- `validateInitialBoard(int)` verifica que haya al menos dos fichas y que el
  tablero no haya empezado en un estado ganador o perdedor.

Estos métodos se mantienen y, después de las correcciones y la modularización, se
apoyan en helpers auxiliares que se describen más adelante.

## Cambios en `MainCLI`

Agregamos el constructor `MainCLI(String initialBoard)` para conectar el
tablero recibido desde la línea de comandos con la interfaz del juego. Este
constructor crea el `Board` usando `new Board(initialBoard)` y prepara el
`Scanner`, igual que el constructor sin argumentos.

Así mantenemos el uso existente: si no se proporciona un argumento, se usa
`MainCLI()` y el juego crea su tablero. Si se pasa un argumento, se
usa `MainCLI(String)` para usar ese tablero como inicial. El método `main` también
comprueba que no haya argumentos de más y muestra un error si el tablero no es
válido, en lugar de iniciar la partida.

## Fuzzer de tableros

`board_fuzzer.py` fue creado usando la estructura de `fuzzer.py`: el
`GrammarBasedBoardFuzzer` genera strings de tableros y `BoardCLIRunner` se
encarga de ejecutar el juego y comprobar el resultado. La gramática genera
tableros con 16 celdas, al menos dos fichas, una celda vacía y valores menores
que `2048`.

El arnés clasifica cada ejecución como `PASS` si el programa acepta el tablero
y muestra los valores esperados, `FAIL` si la ejecución falla o el tablero no
coincide, y `UNRESOLVED` si excede el tiempo límite. Guarda los tableros
generados, uno por línea, en `grammar-based-fuzzer/fuzzed_boards.txt`.

Para compilar y probar 1.000 tableros desde la raíz del proyecto:

```bash
mvn clean -q -DskipTests compile
python3 board_fuzzer.py --count 1000 --seed 2048
```

Se puede cambiar `--count` para generar otra cantidad de casos. Usar el mismo
`--seed` permite repetir la generación.

## Resultados de las ejecuciones

Ejecutamos el fuzzer con tres semillas para probar distintos tableros:

| Semilla | Tableros | PASS | FAIL | UNRESOLVED |
| --- | ---: | ---: | ---: | ---: |
| 2048 | 1.000 | 1.000 | 0 | 0 |
| 17 | 500 | 500 | 0 | 0 |
| 99 | 500 | 500 | 0 | 0 |
| **Total** | **2.000** | **2.000** | **0** | **0** |

En estas ejecuciones no encontramos errores en la carga ni en la visualización
de tableros válidos y las 2.000 ejecuciones terminaron correctamente.

Estas pruebas usan la gramática para generar tableros válidos; por lo tanto,
comprueban que se acepten y muestren correctamente, pero no prueban el rechazo
de strings mal formados o tableros inválidos.


# Ejecuciones del fuzzing de mutaciones

```bash
python3 mutation_fuzzer.py \
--input grammar-based-fuzzer/fuzzed_boards.txt \
--fails grammar-based-fuzzer/fails.txt \
--mutants 10 --max-mutations 2
```

```bash
Mutants: 10000 (from grammar-based-fuzzer/fuzzed_boards.txt)
Corpus: /home/valentin/Escritorio/Seminario/reliable-2048-Baldevenito-Bernal-Marcial/grammar-based-fuzzer/mutated_boards.txt
PASS: 9892/10000
FAIL: 108/10000
UNRESOLVED: 0/10000

# Ejemplos de caso 1
FAIL #75: [4,128,0,8,4,32,128,512,1024,65536,0,2,16,4,32,0] (invalid board was accepted)
    original: [4,128,0,8,4,32,128,512,1024,128,0,2,16,4,32,0]
FAIL #167: [8,128,0,16,4,8,2,4096,16,16,2,2,16,8,2,16] (invalid board was accepted)
    original: [8,128,0,16,4,8,2,16,16,16,2,2,16,8,2,16]
FAIL #248: [128,1024,0,2,32,16,1024,128,1024,65536,2,64,32,8,256,16] (invalid board was accepted)
    original: [128,1024,0,2,32,16,1024,128,1024,1024,2,64,32,8,256,16]

# Ejemplos de caso 2
FAIL #1070: [512,256,00,8,512,16,64,512,32,1024,32,32,512,8,64,0]  (invalid board was accepted)
    original: [512,256,0,8,512,16,64,512,32,1024,32,32,512,8,64,0]
FAIL #2518: [1024,8,0,64,1024,512,256,8,128,0,0,4096,256,16,2,00] (invalid board was accepted)
    original: [1024,8,0,64,1024,512,256,8,128,0,0,32,256,16,2,0]
FAIL #9712: [64,64,00,512,8,64,1024,16,4,32,64,32,65536,64,4,256] (invalid board was accepted)
    original: [64,64,0,512,8,64,1024,16,4,32,64,32,64,64,4,256]


# Ejemplos de caso 3
FAIL #5513: [2,8,0,4,256,1024,16,64,32,4,128,256,128,4,4,128]  (invalid board was accepted)
    original: [2,8,0,4,256,1024,16,64,32,4,128,256,128,4,4,128]

```

## Errores encontrados en el constructor

De los 10.000 mutantes, 108 fueron aceptados aunque el fuzzer los considera
inválidos (`FAIL`, todos con el detalle `invalid board was accepted`). Al revisar
los casos de `fails.txt` se distinguen tres problemas en el constructor
`Board(String)`:

1. **No se valida el valor máximo de una celda.** 106 de los 108 fallos contienen
   una ficha mayor que 2048: 55 casos con `65536` y 51 con `4096`.
   `parseCellValue` solo comprueba que el token sea `\d+` y que entre en un `int`;
   `Cell` rechaza valores negativos, `1` y no potencias de dos, pero no impone un
   tope. `validateInitialBoard` solo busca exactamente `2048`, por lo que `4096`
   o `65536` (potencias de dos) se aceptan. Debería rechazarse todo valor distinto
   de `0` que no sea una potencia de dos en `[2, 1024]`, es decir que cumpla
   `2 <= value && value < WINNING_VALUE && (value & (value - 1)) == 0`.

2. **Se aceptan ceros con ceros a la izquierda.** El token `"00"` pasa `\d+` e
   `Integer.parseInt("00")` devuelve `0`, así que se acepta como celda vacía
   (caso #1070 y, junto con otro error, #2518 y #9712). Si se exige la forma
   decimal canónica, habría que comparar `token.equals(String.valueOf(parsed))`.

3. **Se aceptan espacios alrededor del tablero.** `splitInitialBoard` aplica
   `trim()` al string completo, por lo que un mutante con un espacio final (caso
   #5513) se acepta aunque `is_valid_board` del fuzzer lo marque como inválido.
   Es una decisión de tolerancia, pero conviene dejarla explícita.

El fallo principal es el primero: la validación de la celda no incluye la cota
superior, por lo que el constructor acepta tableros con fichas que superan el
valor ganador. Por lo tanto, `Board.isWinningBoard()` solo devuelve `true` cuando
existe una celda con valor `2048`; nunca considera los valores mayores.

## Soluciones aplicadas a los errores del constructor

Corregimos los tres tipos de error con tests de regresión en `BoardTest` y
verificamos que los 108 tableros de `fails.txt` se rechacen.

### Error tipo 1: fichas mayores que el valor ganador

`parseCellValue` ahora valida, además del formato numérico y del rango de `int`,
que el valor sea `0` o una potencia de dos en `[2, 1024]`, es decir, menor que
`WINNING_VALUE`. De este modo se rechazan `4096`, `65536` y cualquier otra
potencia de dos que supere el valor ganador. Se agregaron los tests
`createBoardFromStringWithTileGreaterThanWinningValue` y
`createBoardFromStringWithTileFarGreaterThanWinningValue`.

### Error tipo 2: ceros con ceros a la izquierda

`parseCellValue` exige que el token esté en forma decimal canónica comparándolo
con `Integer.toString(parsed)`. Así, `"00"`, `"02"` y similares ya no se aceptan
como celdas vacías o valores válidos. Se agregó el test
`createBoardFromStringWithLeadingZeroCellValue`.

### Error tipo 3: espacios alrededor del tablero

`splitInitialBoard` ya no aplica `trim()` al string completo: el tablero debe
empezar con `[` y terminar con `]`. Por eso un tablero con espacios antes de `[`
o después de `]` se rechaza. Se agregó el test
`createBoardFromStringWithSurroundingWhitespace`.

### Verificación

Con los tres cambios, `mvn clean test` pasa completo y los 108 mutantes guardados
en `grammar-based-fuzzer/fails.txt` son rechazados con el mensaje
`Invalid initial board`.

## Modularización del flujo de creación

Después de corregir los errores, reorganizamos la creación de un `Board` desde un
string para separar responsabilidades. El constructor `Board(String)` quedó
reducido a orquestar el proceso:

```java
int[] cellValues = parseInitialBoard(values);
this.size = DEFAULT_SIZE;
this.grid = new Cell[size][size];
this.score = 0;
this.spawner = new AddTileDeterministic();
validateInitialBoard(fillGrid(cellValues));
```

Los métodos privados que participan ahora son:

- `parseInitialBoard(String)` llama a `splitInitialBoard`, valida cada token con
  `parseCellValue` y devuelve los 16 valores como `int[]`.
- `splitInitialBoard(String)` comprueba `null`, corchetes y cantidad de valores, y
  separa los tokens.
- `parseCellValue(String, int)` coordina la conversión y la validación de una
  celda.
- `parseDecimal(String, int)` verifica que el token sea numérico y lo convierte a
  `int`, controlando el desbordamiento.
- `validateCellValue(int, String, int)` exige la forma decimal canónica y que el
  valor sea una ficha válida.
- `isValidTile(int)` concentra la regla `0` o potencia de dos en `[2, 1024]`.
- `fillGrid(int[])` llena el grid en orden fila-columna y devuelve la cantidad de
  celdas ocupadas.
- `validateInitialBoard(int)` conserva las reglas del estado inicial: al menos
  dos fichas y tablero no ganado ni perdido.

Con esto el constructor ya no mezcla parseo, creación de celdas y conteo de
fichas; cada método tiene una única responsabilidad y puede entenderse de forma
aislada. Además, `splitInitialBoard` perdió la variable temporal que solo copiaba
el string, y la validación de una celda se lee como tres pasos: parsear, validar
y construir.

La modularización no cambió el comportamiento: `mvn clean test` sigue pasando y
los 108 casos de `fails.txt` continúan rechazándose.

## Resultado final del fuzzer de mutaciones

Tras aplicar las correcciones y la modularización, volvimos a ejecutar
`mutation_fuzzer.py` con el mismo comando sobre los 10.000 mutantes. El fuzzer ya
no reportó errores: los 10.000 casos terminaron como `PASS` (`FAIL: 0`,
`UNRESOLVED: 0`) y no se registraron fallos en `fails.txt`.



---

# Ejercicio 2: OASIs

Es una tecnica y una herramienta para evaluar que tan bueno es un oraculo y mejorarlo. Basicamente, toma una asercion ya escrita y busca donde falla.

Una aserción puede fallar de dos maneras:

- **Demasiado fuerte (falso positivo):** falla aunque el programa funcione bien.
- **Demasiado débil (falso negativo):** no falla aunque el programa tenga un error.

`oasis.py` es nuestra versión simple de OASIs. Le pasa al LLM el código y la
aserción, y le pide dos cosas: un **test** que demuestre que la aserción es
demasiado fuerte, y un **mutante** (el método con un error metido a propósito)
que demuestre que es demasiado débil. Ese test o ese mutante es el feedback. La
decisión de cambiar la aserción la toma siempre el usuario.

## Cómo usarlo

Necesita una API key gratuita de [OpenRouter](https://openrouter.ai/keys) en la
variable `LLM_API_KEY`. Usamos el modelo gratuito
`nvidia/nemotron-3-ultra-550b-a55b:free`.

```bash
echo 'LLM_API_KEY=sk-or-...' > .env      # .env está en el .gitignore
set -a; source .env; set +a
python3 oasis.py --case 1                # o --case 2, --case 3
```

Sin `--case`, el programa muestra un menú donde también se puede cargar código y
una aserción propios. Con `--max-iterations N` se cambia el máximo de vueltas
(por defecto, 3).

## Cómo funciona

1. **Fase 1:** el LLM busca tests que rompan la aserción con el programa correcto.
2. **Fase 2:** el LLM busca mutantes que la aserción no detecte.
3. Después de cada fase, el usuario elige: aceptar la aserción que sugiere el
   LLM, escribir una propia o quedarse con la actual.
4. Si la aserción cambió, se repiten las dos fases sobre la nueva. Termina cuando
   ya no cambia, cuando el usuario decide cortar o al llegar al máximo.

La repetición importa porque, al reforzar una aserción en la Fase 2, puede quedar
demasiado fuerte, y solo otra Fase 1 lo detecta.

La salida muestra el test o el mutante como código y una línea con el motivo:

```
FALSE POSITIVE: these tests fail on the correct program.

[Test #1] abs(MIN_VALUE) -> MIN_VALUE, fails \result >= 0
    @Test void minValue() {
        assertTrue(abs(Integer.MIN_VALUE) >= 0);
    }
```

Al final muestra cómo fue cambiando la aserción en cada vuelta.

## Casos de estudio

Las salidas completas están en `oasis-output.txt`.

### Caso 1: `abs`

Se corre con `python3 oasis.py --case 1`.

```java
public static int abs(int x) {
    if (x < 0) {
        return -x;
    }
    return x;
}
```

| Paso | Aserción | Qué encontró OASIs |
| --- | --- | --- |
| Inicial | `\result >= 0 && \result >= x` | |
| Fase 1 | | Test: `abs(Integer.MIN_VALUE)` devuelve `MIN_VALUE` por desbordamiento, así que `\result >= 0` falla con el programa correcto. |
| Aceptada | `(\result >= 0 \|\| \result == Integer.MIN_VALUE) && \result >= x` | |
| Fase 2 | | Mutantes que devuelven `0` o `42` para los negativos: la aserción los acepta. |
| Final | `(x >= 0 && \result == x) \|\| (x < 0 && \result == -x)` | |

El LLM también propuso otros dos mutantes: `-x + 1` para los negativos y `x + 1`
para los positivos. Revisándolos, vimos que no sobreviven del todo: la aserción
los detecta con `MIN_VALUE` y con `MAX_VALUE`, respectivamente. Por eso no los
tomamos en cuenta.

#### Corrida con la versión que itera

Volvimos a correr el caso con la versión nueva. En la primera vuelta, la
aserción terminó en `(\result == x && x >= 0) || (\result == -x && x < 0)`. La
segunda vuelta revisó esa aserción y no encontró nada:

```
ITERATION 2  -  assertion: `(\result == x && x >= 0) || (\result == -x && x < 0)`

PHASE 1: False Positive Assessment (Is the assertion too strong?)
No test was found that breaks the assertion on a correct execution.

PHASE 2: False Negative Assessment (Is the assertion too weak?)
No mutant was found that survives the assertion.

The assertion did not change in this iteration: refinement finished.

FINAL ORACLE REFINEMENT RESULT
  Initial: `@ensures \result >= 0 && \result >= x;`
  After iteration 1: `(\result == x && x >= 0) || (\result == -x && x < 0)`
```

- **No hay tests que la rompan:** la aserción ya no es demasiado fuerte.
  Funciona incluso con `MIN_VALUE`, porque ahí `-x` también da `MIN_VALUE`.
- **No hay mutantes que sobrevivan:** ya no es demasiado débil, porque fija el
  resultado exacto para cada `x`.
- **La aserción no cambió en la segunda vuelta**, así que OASIs terminó solo.
  Esta segunda revisión es justamente para lo que sirve iterar.

### Caso 2: `Cell.mergeWith`, con un contrato de Daikon

Se corre con `python3 oasis.py --case 2`.

```java
public Cell mergeWith(Cell other) {
    if (!canMergeWith(other)) {
        throw new IllegalArgumentException(
            "Cannot merge cells: " + this + " and " + other
        );
    }
    return new Cell(this.value * 2);
}
```

La aserción inicial sale de lo que infirió Daikon con nuestros tests manuales
(`return.value one of { 4, 8 }` en `daikon-output-manual.txt`). Esos tests solo
fusionaban 2 + 2 y 4 + 4, y Daikon generalizó de más.

| Paso | Aserción | Qué encontró OASIs |
| --- | --- | --- |
| Inicial | `\result != null && \result.value > this.value && (\result.value == 4 \|\| \result.value == 8)` | |
| Fase 1 | | Test: fusionar 8 + 8 da 16, y la aserción falla aunque el resultado es correcto. |
| Aceptada | `\result != null && \result.value == this.value * 2` | |
| Fase 2 | | Mutantes: uno saca el chequeo `canMergeWith` y otro lanza `RuntimeException` en vez de `IllegalArgumentException`. La aserción no dice nada sobre las excepciones, así que no los detecta. |
| Final | `\result.value == 2 * this.value` cuando se puede fusionar, más `@signals (IllegalArgumentException) !canMergeWith(other)` | |

El LLM también propuso un mutante que modifica `other.value`, pero no compila
porque `value` es `private final`. Por el mismo motivo, las condiciones de
inmutabilidad que sugirió (`\old(...)`) no hacen falta: `Cell` ya es inmutable.

### Caso 3: `Movement.mergeCells`, fusionar una fila

Se corre con `python3 oasis.py --case 3`.

Es el corazón del 2048: recibe las fichas de una fila (sin los vacíos) y fusiona
las vecinas iguales. Por ejemplo, `[2, 2, 4]` queda `[4, 4]` y suma 4 puntos.

```java
private static List<Cell> mergeCells(List<Cell> nonEmpty, int[] scoreDelta) {
    List<Cell> merged = new ArrayList<>();
    int k = 0;
    while (k < nonEmpty.size()) {
        if (k + 1 < nonEmpty.size() && nonEmpty.get(k).canMergeWith(nonEmpty.get(k + 1))) {
            Cell mergedCell = nonEmpty.get(k).mergeWith(nonEmpty.get(k + 1));
            merged.add(mergedCell);
            scoreDelta[0] += mergedCell.getValue();
            k += 2;
        } else {
            merged.add(nonEmpty.get(k));
            k++;
        }
    }
    return merged;
}
```

La aserción inicial es `\result.size() < nonEmpty.size()`: "al mover, siempre se
fusiona algo". Es demasiado fuerte, porque una fila como `[2, 4]` no tiene nada
que fusionar. Y si se la relaja a `<=`, queda demasiado débil: no detecta el
error clásico del 2048, la doble fusión, donde `[2, 2, 4]` termina en `[8]` en
vez de `[4, 4]`.

> Pendiente: completar con la corrida de OASIs.

## Conclusiones

- **Los tests encuentran aserciones demasiado fuertes.** En `mergeWith`, OASIs
  mostró enseguida que el contrato de Daikon estaba sobreajustado a los tests.
- **Los mutantes encuentran aserciones demasiado débiles.** En los dos casos
  llevaron a una aserción que fija el resultado exacto y, en `mergeWith`, también
  la excepción.
- **El LLM se equivoca, y por eso decide el usuario.** Como no ejecuta el código,
  propuso mutantes que no compilan o que la aserción sí detecta. Hay que revisar
  cada propuesta antes de aceptarla.
