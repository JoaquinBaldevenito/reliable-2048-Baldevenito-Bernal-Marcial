# Comprehensive Testing Report: 2048 Game

---

## Phase 1: Initial Testing

### Initial Results in General
* **JaCoCo**
  * Line Coverage: 88%
  * Branch Coverage: 85%
* **PIT**
  * Line Coverage: 82%
  * Mutation Coverage: 78%
  * Test Strength: 87%

### Initial Results by Class
* **JaCoCo**
  * Board: 99%
  * Cell: 100%
  * Movement: 97%
  * MainCLI: 0%
* **PIT**
  * Board: Line Coverage: 99% | Mutation Coverage: 80% | Test Strength: 81%
  * Cell: Line Coverage: 100% | Mutation Coverage: 100% | Test Strength: 100%
  * Movement: Line Coverage: 96% | Mutation Coverage: 100% | Test Strength: 100%
  * MainCLI: Line Coverage: 0% | Mutation Coverage: 0% | Test Strength: 100%

---
## Phase 2: Improve Test Quality

### 1. Improved General Results
* **JaCoCo**
  * Line Coverage: 88%
  * Branch Coverage: 90% *(Target Achieved)*
* **PITest**
  * Line Coverage: 83%
  * Mutation Coverage: 88%
  * Test Strength: 98% *(Target Achieved)*

### 2. Improved Results by Class
* **JaCoCo**
  * Board: Line Coverage: 100% | Branch Coverage: 100%
  * Cell: Line Coverage: 100% | Branch Coverage: 100%
  * Movement: Line Coverage: 98% | Branch Coverage: 95%
  * MainCLI: Line Coverage: 0% | Branch Coverage: 0%
* **PITest**
  * Board: Line Coverage: 100% | Mutation Coverage: 97% | Test Strength: 97%
  * Cell: Line Coverage: 100% | Mutation Coverage: 100% | Test Strength: 100%
  * Movement: Line Coverage: 98% | Mutation Coverage: 100% | Test Strength: 100%
  * MainCLI: Line Coverage: 0% | Mutation Coverage: 0% | Test Strength: 100%

*Note on Targets:* Branch coverage successfully reached the 90% target, and the Test Strength reached an outstanding 98%. The overall Mutation Score reached 88%, which is excellent considering the 0% coverage in the `MainCLI` class. The core domain logic (`Cell`, `Board`, `Movement`) is effectively operating at near 100% mutation coverage.

---

# Phase 3: Automated Test Generation with Randoop

## 1. Initial Randoop Execution

We ran Randoop to generate tests for our core domain classes (`Cell`, `Board`, and `Movement`), skipping the console interface (`MainCLI`).

**Command used:**

```bash
java -cp "lib/randoop-all-4.3.4.jar:target/classes" randoop.main.Main gentests \
  --testclass=ar.edu.unrc.game2048.Cell \
  --testclass=ar.edu.unrc.game2048.Board \
  --testclass=ar.edu.unrc.game2048.Movement \
  --time-limit=10 \
  --junit-output-dir=src/test/java \
  --junit-package-name=randoopTests

```

## 2. Code Coverage Comparison

We evaluated the Randoop test suites using JaCoCo and PIT, and compared the results with our manual suite from Phase 2.

**Metrics Comparison**

| Metric | Manual Tests (Phase 2) | Randoop Tests (Phase 3) |
| --- | --- | --- |
| **JaCoCo Line Coverage** | **88%** | **74%** |
| **JaCoCo Branch Coverage** | **90%** | **65%** |
| **PIT Mutation Coverage** | **88%** | **63%** |
| **PIT Test Strength** | **98%** | **84%** |

**Class Breakdown (Randoop Results)**

* **Board:** Line Coverage 93% | Mutation Coverage 70%
* **Cell:** Line Coverage 81% | Mutation Coverage 71%
* **Movement:** Line Coverage 85% | Mutation Coverage 76%

**Analysis:**
As expected, Randoop's automated tests scored lower across the board compared to our manual suite. While it managed to cover a solid amount of lines (74%), its branch and mutation coverage dropped significantly. This happens because Randoop generates method sequences blindly, but it doesn't actually understand the game's logic.

## 3. Bugs Found & Refactoring

* **The Problem (Flaky Tests):** During the first runs, we ran into an issue with flaky tests. Randoop generated strict assertions that would fail randomly because the `Board` class used `Math.random()` to spawn new tiles.
* **The Solution (Strategy Pattern):** To fix the non-determinism, we refactored the code using the Strategy pattern. We abstracted the tile generation into a `AddTileStrategy` interface, keeping the original `AddRandomTile` for the actual game and creating a `AddTileDeterministic` just for testing. By injecting the predictable strategy, we stabilized the board and allowed Randoop and PIT to run properly without false positives.

## 4. Implementing `repOK()` Invariants

To help Randoop generate better tests and catch invalid states, we implemented representation invariants:

* **`Cell.repOK()`:** Ensures the cell's value is never negative, is not equal to 1, and is strictly a power of 2 (using bitwise validation).
* **`Board.repOK()`:** Checks that the grid matrix isn't null, matches the correct `size x size` dimensions, contains no null references, and that every single cell passes its own `repOK()` validation.

## 5 & 6. Second Randoop Execution and Results

We ran Randoop one final time. It automatically picked up the `repOK()` methods by naming convention and injected them as assertions into the generated code.

* **Results:** Randoop didn't find any code sequences that broke the invariants or possibles bugs.