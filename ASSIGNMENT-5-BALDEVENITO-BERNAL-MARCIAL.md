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
--mutants 10 --max-mutations 2 --seed 2048
```

Esta corrida es contra la versión del constructor anterior a las correcciones
(commit `63220ac`). Con `--seed 2048` se puede repetir y da siempre los mismos
mutantes. Los tableros que fallaron quedaron en `grammar-based-fuzzer/fails.txt`.

```bash
Mutants: 10000 (from grammar-based-fuzzer/fuzzed_boards.txt)
Corpus: grammar-based-fuzzer/mutated_boards.txt
PASS: 9900/10000
FAIL: 100/10000
UNRESOLVED: 0/10000

# Ejemplos de caso 1
FAIL #83: [8,1024,0,8,32,2,0,128,512,0,8,65536,2,4,4,4] (invalid board was accepted)
    original: [8,1024,0,8,32,2,0,128,512,0,8,512,2,4,4,4]
FAIL #141: [1024,1024,0,4,4,32,65536,256,512,4,128,64,2,0,8,2] (invalid board was accepted)
    original: [1024,1024,0,4,4,32,256,256,512,4,128,64,2,0,8,2]
FAIL #322: [32,512,0,1024,32,0,32,32,512,8,8,4,0,64,64,4096] (invalid board was accepted)
    original: [32,512,0,1024,32,0,32,32,512,8,8,4,0,64,64,8]

# Ejemplos de caso 2
FAIL #1317: [4,64,0,4096,16,256,2,32,0,4,8,00,16,512,64,4] (invalid board was accepted)
    original: [4,64,0,8,16,256,2,32,0,4,8,0,16,512,64,4]
FAIL #5736: [128,256,0,02,0,512,256,8,1024,4,16,8,4,65536,64,8] (invalid board was accepted)
    original: [128,256,0,0,0,512,256,8,1024,4,16,8,4,512,64,8]

# Ejemplos de caso 3 (el mutante tiene un espacio al principio)
FAIL #3926:  [256,256,0,0,8,128,512,8,32,8,0,2,8,256,256,256] (invalid board was accepted)
    original: [256,256,0,0,8,128,512,8,32,8,0,2,8,256,256,256]
```

## Errores encontrados en el constructor

De los 10.000 mutantes, 100 fueron aceptados aunque el fuzzer los considera
inválidos (`FAIL`, todos con el detalle `invalid board was accepted`). Al revisar
los casos de `fails.txt` se distinguen tres problemas en el constructor
`Board(String)`:

1. **No se valida el valor máximo de una celda.** 98 de los 100 fallos contienen
   una ficha mayor que 2048: 56 casos con `65536` y 42 con `4096`.
   `parseCellValue` solo comprueba que el token sea `\d+` y que entre en un `int`;
   `Cell` rechaza valores negativos, `1` y no potencias de dos, pero no impone un
   tope. `validateInitialBoard` solo busca exactamente `2048`, por lo que `4096`
   o `65536` (potencias de dos) se aceptan. Debería rechazarse todo valor distinto
   de `0` que no sea una potencia de dos en `[2, 1024]`, es decir que cumpla
   `2 <= value && value < WINNING_VALUE && (value & (value - 1)) == 0`.

2. **Se aceptan ceros con ceros a la izquierda.** El token `"00"` pasa `\d+` e
   `Integer.parseInt("00")` devuelve `0`, así que se acepta como celda vacía. Lo
   mismo pasa con `"02"`, que se lee como `2`. Aparece en 4 fallos (#1317,
   #1990, #5736 y #7012), siempre junto con una ficha mayor que 2048. Si se exige la forma
   decimal canónica, habría que comparar `token.equals(String.valueOf(parsed))`.

3. **Se aceptan espacios alrededor del tablero.** `splitInitialBoard` aplica
   `trim()` al string completo, por lo que un mutante con un espacio al principio
   (casos #3926 y #8990) se acepta aunque `is_valid_board` del fuzzer lo marque como inválido.
   Es una decisión de tolerancia, pero conviene dejarla explícita.

El fallo principal es el primero: la validación de la celda no incluye la cota
superior, por lo que el constructor acepta tableros con fichas que superan el
valor ganador. Por lo tanto, `Board.isWinningBoard()` solo devuelve `true` cuando
existe una celda con valor `2048`; nunca considera los valores mayores.

## Soluciones aplicadas a los errores del constructor

Corregimos los tres tipos de error con tests de regresión en `BoardTest` y
verificamos que los 100 tableros de `fails.txt` se rechacen.

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

Con los tres cambios, `mvn clean test` pasa completo y los 100 mutantes guardados
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
los 100 casos de `fails.txt` continúan rechazándose.

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
(por defecto, 3). Con `--debug` se ven además los prompts que arma oasis.py, las respuestas
crudas del LLM (JSON tal cual llega antes de que oasis.py lo procese y lo muestre), el tiempo y tokens de esa consulta (por stderr, así no se mezclan con la salida
normal).

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

Las salidas completas están en `oasis-output.txt` (caso 1), `oasis-output-case2.txt`
y `oasis-output-case3.txt`.

En el caso 1 decidimos nosotros en cada paso, como lo haría un usuario. En los
casos 2 y 3 aceptamos **todas** las sugerencias del LLM y lo dejamos
iterar 3 veces, para ver hasta dónde llegaba solo. Después revisamos cada
propuesta y marcamos cuáles aceptaría un usuario (✅) y cuáles no (❌). En la
tercera vuelta de los dos casos, la Fase 1 falló porque el modelo gratuito no
respondió a tiempo.

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

| Vuelta | Qué encontró OASIs | ¿Sirve? |
| --- | --- | --- |
| 1, Fase 1 | Test: `abs(Integer.MIN_VALUE)` devuelve `MIN_VALUE` por desbordamiento, así que `\result >= 0` falla con el programa correcto. | ✅ |
| 1, aceptada | `\result >= x && (x != Integer.MIN_VALUE ==> \result >= 0)` | ✅ |
| 1, Fase 2 | Mutantes: los negativos devuelven `0`, los negativos devuelven `-x + 1` y los positivos devuelven `x + 1`. | ✅ Los dos primeros sobreviven. El tercero no del todo: la aserción lo detecta con `MAX_VALUE`. |
| 1, aceptada | `\result == (x < 0 ? -x : x)` | ✅ Fija el resultado exacto. |
| 2, Fase 1 | No encontró tests que la rompan. Funciona incluso con `MIN_VALUE`, porque ahí `-x` también da `MIN_VALUE`. | ✅ |
| 2, Fase 2 | No encontró mutantes que sobrevivan. | ✅ |

La aserción no cambió en la segunda vuelta, así que OASIs terminó solo. Para eso
sirve iterar: la segunda revisión confirma que el refinamiento no se pasó de
fuerte.

El mutante `-x + 1` es interesante. Con la aserción inicial no sobrevivía, porque
`MIN_VALUE` lo detectaba. Pero sí sobrevive después de relajar la aserción para
`MIN_VALUE` en la Fase 1. Arreglar el falso positivo abrió un falso negativo, y la
Fase 2 lo encontró.

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

| Vuelta | Qué encontró OASIs | ¿Sirve? |
| --- | --- | --- |
| 1, Fase 1 | Tests: 8 + 8 da 16, y la aserción falla aunque el resultado es correcto. También 1 + 1 y 3 + 3. | ✅ 8 + 8. ❌ 1 + 1 y 3 + 3: `Cell` no acepta 1 ni valores que no sean potencia de 2. |
| 1, Fase 2 | Mutantes que sacan o invierten el chequeo `canMergeWith`: fusionan celdas distintas en vez de lanzar la excepción. | ✅ La aserción no dice nada de las excepciones. |
| 1, aceptada | `canMergeWith(other) ==> \result.value == this.value * 2`, y si no se puede fusionar, `\signals (IllegalArgumentException)` | ✅ **Esta es la buena.** |
| 2, Fase 2 | Mutantes que hacen `this.value = 0` antes de devolver. | ❌ No compilan: `value` es `private final`. |
| 2, aceptada | Lo mismo, pero con `\old(this.value)` | ❌ No hace falta: `Cell` es inmutable. |
| 3, Fase 2 | Mutantes que cambian `this.value` u `other.value`, y uno que cambia el texto del mensaje de error. | ❌ Los dos primeros no compilan. El tercero es válido, pero no importa. |
| 3, aceptada | Agrega `assignable \nothing`, `\fresh(\result)` y que el mensaje sea exactamente `"Cannot merge cells: ..."` | ❌ Sobreajustada: se rompe si alguien cambia el mensaje. |

Un usuario se quedaría con la aserción de la vuelta 1 y rechazaría las
siguientes. Casi todos los errores del LLM tienen la misma causa: **solo ve el
método, no la clase `Cell`**, así que no sabe que `value` es `private final` ni qué
valores acepta el constructor.

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

| Vuelta | Qué encontró OASIs | ¿Sirve? |
| --- | --- | --- |
| 1, Fase 1 | Tests `[2]`, `[2, 4]` y `[2, 4, 8]`: no hay nada que fusionar y la aserción falla. | ✅ |
| 1, aceptada | `\result.size() <= nonEmpty.size()` | ✅ |
| 1, Fase 2 | Mutantes: uno nunca fusiona (`[2, 2]` queda `[2, 2]`), uno duplica una ficha (`[2, 2]` → `[4, 2]`) y uno pierde la ficha fusionada (`[2, 2]` → `[]`). | ✅ Todos sobreviven con `<=`. |
| 1, aceptada | `<=`, "no quedan dos vecinas que se puedan fusionar" y "la suma de los valores se conserva" | ❌ Parece buena, pero es demasiado fuerte (ver la vuelta 2). |
| 2, Fase 1 | **Test: `[2, 2, 4]` da `[4, 4]`**, y lo mismo `[2, 2, 2, 2]`. En el 2048, una ficha recién fusionada no se vuelve a fusionar, así que quedan vecinas iguales. | ✅ **La segunda vuelta corrigió un error de la primera.** |
| 2, aceptada | `<=` y "la suma se conserva" | ✅ |
| 2, Fase 2 | Mutantes: uno nunca fusiona (`[2, 2, 4]` queda igual) y otro fusiona de derecha a izquierda (`[2, 2, 2]` → `[2, 4]` en vez de `[4, 2]`). | ✅ El segundo es un error real del 2048. |
| 2, aceptada | Además, `\result.equals(mergeCellsSpec(nonEmpty))` | ❌ `mergeCellsSpec` no existe: es "comparar contra otra copia del algoritmo". |
| 3, Fase 2 | Mutantes que suman mal el puntaje: no suman nada, suman el doble o suman sin fusionar. | ✅ Ninguna aserción revisaba `scoreDelta`. |
| 3, aceptada | Además, `scoreDelta[0] == \old(scoreDelta[0]) + mergeScoreSpec(nonEmpty)` | ❌ Mismo problema: `mergeScoreSpec` no existe. |

Es el caso que mejor muestra para qué sirve OASIs:

- **La iteración vale la pena.** La vuelta 1 aceptó una aserción que sonaba bien,
  y la vuelta 2 encontró un test que la rompía con el programa correcto.
- **Los mutantes fueron todos válidos** y apuntaron a errores reales: no
  fusionar, fusionar al revés y calcular mal el puntaje.
- **Las sugerencias finales no sirven.** Cuando la aserción tiene que fijar el
  resultado exacto, el LLM propone "compará con una función que hace lo mismo".
  Un usuario se quedaría con la aserción de la vuelta 2 y le agregaría a mano el
  chequeo del puntaje: `scoreDelta[0]` aumenta en la suma de las fichas nuevas.
- **No apareció el mutante de la doble fusión.** `[2, 2, 4]` → `[8]` conserva la
  suma y achica la fila, así que la aserción de la vuelta 2 tampoco lo detecta.
  OASIs ayuda, pero no garantiza encontrar todos los mutantes.

## Conclusiones

- **Los tests encuentran aserciones demasiado fuertes.** En `mergeWith`, OASIs
  mostró enseguida que el contrato de Daikon estaba sobreajustado a los tests.
- **Los mutantes encuentran aserciones demasiado débiles.** En `abs` llevaron a
  una aserción que fija el resultado exacto, en `mergeWith` a una que incluye la
  excepción y en `mergeCells` mostraron que el puntaje no se revisaba.
- **Iterar sirve.** En `abs`, la segunda vuelta confirmó que la aserción estaba
  bien. En `mergeCells`, encontró que el refinamiento de la primera era
  demasiado fuerte.
- **El LLM se equivoca, y por eso decide el usuario.** Como no ejecuta el código
  ni ve el resto de las clases, propuso tests con valores inválidos, mutantes
  que no compilan y aserciones sobreajustadas o circulares. Si aceptábamos todo,
  en los casos 2 y 3 terminábamos con una aserción peor que la de las primeras
  vueltas.
- **Posible mejora:** pasarle al LLM, junto con el método, las partes de `Cell`
  que necesita (el campo `private final int value` y qué valores acepta el
  constructor).
