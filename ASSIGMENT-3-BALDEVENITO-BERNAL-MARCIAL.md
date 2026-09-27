## Metricas de cobertura Randoop vs. EvoSuite

//Codigos para correr despues borrar
mvn clean compile
java -cp "lib/randoop-all-4.3.4.jar:target/classes" randoop.main.Main gentests --testclass=ar.edu.unrc.game2048.Cell --testclass=ar.edu.unrc.game2048.Board --time-limit=10 --junit-output-dir=src/test/java --junit-package-name=randoopTests (para correr las dos clases)

### Randoop (--time-limit=30)
| Clase                  | Line Coverage | Mutation Coverage | Test Strength     |
|------------------------|:-------------:|:------------------:|:------------------:|
| Board                  | 80%           | 62%                | 92%                |
| Cell                   | 77%           | 71%                | 100%               |
| Movement               | 94%           | 100%               | 100%               |
| MainCLI                | 0%            | 0%                 | 100%               |
| AddRandomTile          | 0%            | 0%                 | 100%               |
| AddTileDeterministic   | 100%          | 33%                | 33%                |

**Global:** Line Coverage 69% | Mutation Coverage 62% | Test Strength 94%

### EvoSuite


## Respuestas a la inspeccion de EvoSuite

## Fuzz function implementation
The function `def fuzz(self) -> str:` returns a string with a sequence of movements for the 2048 game.

The function use parameters (`self.min_length` and `self.max_length`) to define how many movements to generate and pick keys randomly from the KEYS list.

The function starts with a empty string and using the random library we use `random.randrange(self.min_length, self.max_length)` to generate a random length for the string.

The function then uses a loop to pick random keys from the KEYS list and append them to the string until the desired length is reached. Finally, the function return the string with a QUIT key.

## Resultados de integrar repOk con -ea

## Reflexiones sobre que tecnica funciono mejor
