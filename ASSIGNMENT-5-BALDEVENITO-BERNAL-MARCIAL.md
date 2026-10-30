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
