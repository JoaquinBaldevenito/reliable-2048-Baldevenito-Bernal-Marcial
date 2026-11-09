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

# Ejercicio 2 OASIs


Se detallan los resultados obtenidos al aplicar la herramienta **OASIs** (*Oracle Assessment and Improvement System*) a dos casos de estudio en Java: un método aritmético (`Math.abs`) y un método sacado del juego 2048 probado en assigments anteriores (`Cell.mergeWith`).

Los outputs originales estan en **`oasis-output.txt`**

---

## 1. Caso de Estudio 1: `Math.abs(int x)`


* **Código a analizar:**
```java
public static int abs(int x) {
    if (x < 0) {
        return -x;
    }
    return x;
}

```


* **Aserción Inicial (Oráculo Débil):**
`@ensures \result >= 0 && \result >= x;`

---

### Fase 1: Evaluación de Falsos Positivos (Demasiado Fuerte)

* **Diagnóstico de OASIs:** La aserción falla de forma espuria en el caso límite de desbordamiento de enteros de 32 bits (`Integer.MIN_VALUE = -2147483648`). En Java, `-Integer.MIN_VALUE` no se puede representar como entero positivo y retorna `-2147483648`, violando `\result >= 0`.
* **Caso de Prueba Violatorio Generado:**
* **Entrada:** `x = -2147483648`
* **Salida del método:** `-2147483648`
* **Causa del fallo espurio:** El valor retornado es negativo debido al desbordamiento en complemento a dos, violando la cláusula `\result >= 0` a pesar de ser la ejecución correcta según la especificación de Java.


* **Sugerencia del LLM (Adoptada por el usuario):**
`@ensures (\result >= 0 || \result == Integer.MIN_VALUE) && \result >= x;`

---

### Fase 2: Evaluación de Falsos Negativos (Demasiado Débil)

* **Diagnóstico de OASIs:** La aserción refinada en la Fase 1 exige que la salida sea no-negativa (o el valor mínimo) y mayor/igual a la entrada, pero no impone que el resultado sea exactamente la magnitud absoluta del número.
* **Mutantes Sobrevivientes Generados:**

| ID | Mutación Introducida | Fragmento del Mutante | Razón de Supervivencia |
| --- | --- | --- | --- |
| **M1** | Retorna 0 para entradas negativas | `if (x < 0) return 0;` | `0 >= 0` y `0 >= x` (con $x < 0$). Cumple la aserción sin calcular el valor absoluto. |
| **M2** | Retorna constante positiva (42) | `if (x < 0) return 42;` | `42 >= 0` y `42 >= x` para todo $x$ negativo. |
| **M3** | Error de *off-by-one* en negativos | `if (x < 0) return -x + 1;` | `-x + 1` es positivo y mayor a $x$, pero incrementa el resultado en 1. |
| **M4** | Incremento arbitrario en no-negativos | `return x + 1;` (para $x \ge 0$) | `x + 1 >= 0` y `x + 1 >= x`. Satisface la aserción sin retornar el valor exacto. |

* **Sugerencia de Refinamiento Final (Adoptada por el usuario):**
`@ensures (x >= 0 && \result == x) || (x < 0 && \result == -x);`

---

## 2. Caso de Estudio 2: `Cell.mergeWith(Cell other)`


* **Código a analizar:**
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


* **Aserción Inicial (inferido Daikon test manuales):**
`@ensures \result != null && \result.value > this.value && (\result.value == 4 || \result.value == 8);`

---

### Fase 1: Evaluación de Falsos Positivos (Demasiado Fuerte)

* **Diagnóstico de OASIs:** La aserción fue generada por sobre-adaptación (*overfitting*) a una traza de ejecución acotada donde solo se observaron fichas de valor 2 y 4. El método implementa duplicación genérica para cualquier valor de celda válido.
* **Casos de Prueba Violatorios Generados:**
* **Test #1:** `this.value = 8`, `other.value = 8` $\rightarrow$ Salida esperada: `Cell(16)`. Fallo: $16 \notin \{4, 8\}$.
* **Test #2:** `this.value = 16`, `other.value = 16` $\rightarrow$ Salida esperada: `Cell(32)`. Fallo: $32 \notin \{4, 8\}$.
* **Test #3:** `this.value = 32`, `other.value = 32` $\rightarrow$ Salida esperada: `Cell(64)`. Fallo: $64 \notin \{4, 8\}$.


* **Sugerencia del LLM (Adoptada por el usuario):**
`@ensures \result != null && \result.value == this.value * 2;`

---

### Fase 2: Evaluación de Falsos Negativos (Demasiado Débil)

* **Diagnóstico de OASIs:** La aserción intermedia solo valida la salida del camino feliz. No especifica el comportamiento ante entradas inválidas (`!canMergeWith`), no restringe el tipo de excepción lanzada (`@signals`), no exige la creación de una instancia nueva (frescura de alias) ni garantiza la inmutabilidad de los objetos de entrada (`\old`).
* **Mutantes Sobrevivientes Generados:**

| ID | Mutación Introducida | Fragmento del Mutante | Razón de Supervivencia |
| --- | --- | --- | --- |
| **M1** | Eliminación de la validación de entrada | `public Cell mergeWith(Cell other) { return new Cell(this.value * 2); }` | En ejecuciones no válidas retorna una celda duplicada en lugar de lanzar una excepción. La aserción no especifica casos excepcionales. |
| **M2** | Tipo de excepción incorrecto | `throw new RuntimeException(...)` en lugar de `IllegalArgumentException` | La postcondición `@ensures` no se evalúa al lanzar excepciones y falta la cláusula `@signals` específica. |
| **M3** | Mutación de estado y aliasing | `other.value = this.value * 2; return other;` | Modifica `other` y lo retorna en lugar de instanciar un nuevo objeto. La aserción no valida alias (`\result != other`) ni inmutabilidad. |

* **Sugerencia de Refinamiento Final (Adoptada por el usuario):**
```jml
@ensures canMergeWith(other) ==> (
    \result != null && 
    \result != this && 
    \result != other && 
    \result.value == 2 * \old(this.value) && 
    this.value == \old(this.value) && 
    (other == null || other.value == \old(other.value))
);
@ensures !canMergeWith(other) ==> false;
@signals (IllegalArgumentException) !canMergeWith(other);
```



---

## 3. Matriz Comparativa de Resultados

| Caso de Estudio | Oráculo Inicial | Defecto Detectado en FP | Defecto Detectado en FN | Oráculo Refinado Final (JML) |
| --- | --- | --- | --- | --- |
| **`Math.abs`** | `\result >= 0 && \result >= x` | Desbordamiento de entero en `Integer.MIN_VALUE`. | No exige exactitud de valor absoluto (retornos arbitrarios o con offset pasan). | `(x >= 0 && \result == x) || (x < 0 && \result == -x)` |
| **`Cell.mergeWith`** | `\result.value == 4 || \result.value == 8` | *Overfitting* a datos de prueba (falla para fichas $> 4$). | Falta de precondiciones, excepciones, inmutabilidad y control de alias. | `canMergeWith(other) ==> (\result != null && \result != this && \result != other && \result.value == 2*\old(this.value) ...) @signals (IllegalArgumentException)` |

---

## 4. Evaluación Global del Desempeño de OASIs

La combinación de **generación de casos de prueba** (para Falsos Positivos) y **generación de mutantes** (para Falsos Negativos) permitió corregir las deficiencias típicas de los oráculos de software:

1. **Eliminación del Overfitting:** OASIs detectó que las restricciones constantes (como las inferidas por Daikon en `Cell.mergeWith`) rompen ejecuciones válidas y generó los tests precisos que lo demuestran.
2. **Fortalecimiento Formal:** Mediante el análisis de mutantes sobrevivientes, la herramienta guio al desarrollador desde aserciones débiles de ordenamiento hacia contratos de especificación completos en JML (incluyendo cláusulas `@signals`, `\old` y condiciones de aliasing).
3. **Control del Desarrollador:** En ambos casos de estudio, la estructura interactiva permitió al usuario evaluar el diagnóstico de cada fase antes de aplicar las modificaciones propuestas.