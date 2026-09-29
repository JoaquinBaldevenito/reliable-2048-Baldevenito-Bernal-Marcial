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

| Metric | Manual Tests (Phase 2) | Randoop Tests (Phase 3) | Evosuite (Phase 3)
| --- | --- | --- | --- |
| **JaCoCo Line Coverage** | **88%** | **74%** | **86%**
| **JaCoCo Branch Coverage** | **90%** | **65%** | **80%**
| **PIT Mutation Coverage** | **88%** | **63%** | 
| **PIT Test Strength** | **98%** | **84%** |

**Class Breakdown (Randoop Results)**

* **Board:** Line Coverage 93% | Mutation Coverage 70%
* **Cell:** Line Coverage 81% | Mutation Coverage 71%
* **Movement:** Line Coverage 85% | Mutation Coverage 76%

**Class Breakdown (Evosuite)**

* **Board:** Line Coverage 93% | Branch Coverage 83% | Mutation Coverage 
* **Cell:** Line Coverage 97% | Branch Coverage 91% | Mutation Coverage
* **Movement:** Line Coverage 98% | Branch Coverage 95% | Mutation Coverage

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

```

## 2. Code Coverage Comparison

We evaluated the Randoop test suites using JaCoCo and PIT, and compared the results with our manual suite from Phase 2.

**Metrics Comparison**

| Metric | Manual Tests (Phase 2) | Randoop Tests (Phase 3) | Evosuite (Phase 3)
| --- | --- | --- |
| **JaCoCo Line Coverage** | **88%** | **74%** |
| **JaCoCo Branch Coverage** | **90%** | **65%** |
| **PIT Mutation Coverage** | **88%** | **63%** |
| **PIT Test Strength** | **98%** | **84%** |


===============================================================================

# Assignment 3: Automated Test Generation and Fuzzing Report

## Phase 2: Fuzzing

### 1. Fuzzer Implementation (`fuzz()` method)
The fuzzer is designed to dynamically test the application through its external interface (CLI). We implemented the `fuzz()` method inside the `RandomFuzzer` class to generate a valid, random sequence of standard inputs.

**Implementation Details:**
* The length of the sequence is randomly determined per trial, bounded by `min_length` (1000) and `max_length` (50000). This values forces the game to finish so we test the most possibles scenarios.
* A loop randomly selects one of the valid movement keys (`'a'`, `'s'`, `'w'`, `'d'`) and appends it to a string, followed by a newline character (`\n`) to simulate pressing Enter.
* Crucially, the string always concludes with the `'q\n'` command. This ensures the Java process terminates gracefully, preventing infinite loops and timeouts in the `CLIRunner`.

### 2. Execution and Results (Standard Run)
We executed the fuzzer (20 trials) against the compiled `MainCLI` class. 
* **Outcome:** The program did not crash. All trials returned a `PASS` status, and the process exited normally with return code 0. No unhandled exceptions or hangs were detected through standard standard inputs.

### 3. Enhancing Bug-Finding with Invariants (`repOK()`)
To perform deeper dynamic analysis, we integrated our representation invariants (`repOK()`) from Assignment 2 into the application logic:
* We modified the `MainCLI.java` event loop to execute `assert board.repOK();` immediately after every valid movement.
* We updated the `CLIRunner.COMMAND` in the Python script to include the `-ea` (Enable Assertions) JVM flag, allowing the fuzzer to actively trigger these invariants.

### 4. Re-Execution Results (With Assertions Enabled)
We executed the fuzzer again with assertions enabled, simulating massive sequences of random key presses.

* **Outcome:** No crashes or assertion failures were found. All 20 trials successfully yielded a `PASS` result.
* **Diagnosis:** The complete absence of `AssertionError` exceptions confirms that our domain logic (`Board`, `Cell`, `Movement`) is robust.
