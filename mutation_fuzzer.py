"""Generate initial 2048 boards with a grammar and run them through the CLI."""

import argparse
import random
import re
import subprocess
import sys
from pathlib import Path

from board_fuzzer import (
    BOARD_CELLS,
    CELL_VALUES,
    FAIL,
    PASS,
    ROOT,
    UNRESOLVED,
    BoardCLIRunner,
    Fuzzer,
)

# Largest tile accepted by the specification. Adjust it to your project's rules.
MAX_TILE = 2048

# A cell written as decimal digits, optionally surrounded by whitespace.
CELL_PATTERN = re.compile(r"\s*[0-9]+\s*")

# Characters used when inserting or replacing: valid ones (digits, separators,
# brackets) plus others that should never appear in a board.
MUTATION_CHARS = (
    "0123456789"  # dígitos
    + ",,,[[]]"  # estructura, repetida para que salga más seguido
    + "--++"  # signos: -2, +2, --2
    + "  "  # espacios: [2, 4, ...]
    + "..ee"  # decimales y notación científica: 2.0, 2e1
    + "xXbB"  # prefijos hex/binario: 0x2, 0b10
    + "_"  # separadores numéricos: 1_024
    + "abcyzYZ;:!@#"  # basura
)

# Values that are close to valid or typically break parsers.
INTERESTING_CELLS = [
    "-2",
    "-0",
    "-1",
    "3",
    "1",
    "2048",
    "4096",
    "65536",
    "2147483647",
    "2147483648",
    "-2147483648",
    "99999999999999999999",
    "02",
    "+2",
    "2.0",
    "2e1",
    "0x2",
    " 2",
    "2 ",
    "",
    "null",
    "NaN",
]


def is_valid_board(board):
    """Checks whether a string is a well-formed 4x4 board."""
    # The board must be enclosed in brackets and contain 16 comma-separated values.
    if not (board.startswith("[") and board.endswith("]")):
        return False
    # Split the string into values and check that they are all valid cell values.
    values = board[1:-1].split(",")
    return len(values) == BOARD_CELLS and all(v in CELL_VALUES for v in values)


class MutantCLIRunner(BoardCLIRunner):
    """Runs the Java CLI with an invalid board and checks it is rejected cleanly."""

    # Failures of the environment, not of the program under test.
    JVM_ERRORS = (
        "UnsupportedClassVersionError",
        "Could not find or load main class",
        "NoClassDefFoundError",
    )

    def run(self, board: str):
        """Starts the game with the board and returns its result and outcome."""
        try:
            result = subprocess.run(
                BoardCLIRunner.COMMAND + [board],
                input="q\n",
                capture_output=True,
                text=True,
                timeout=BoardCLIRunner.TIMEOUT,
                cwd=ROOT,
                check=False,
            )
        except subprocess.TimeoutExpired:
            return None, UNRESOLVED

        # Errors from the JVM itself are not a verdict about the board.
        if any(error in result.stderr for error in self.JVM_ERRORS):
            return result, UNRESOLVED
        # An uncaught Java exception or failed assertion is a bug.
        if "Exception in thread" in result.stderr or "\tat " in result.stderr:
            return result, FAIL
        # A clean rejection uses exit code 2 and the validation message.
        if result.returncode == 2 and "Invalid initial board" in result.stderr:
            return result, PASS
        # Anything else (accepted board, other exit code) is unexpected.
        return result, FAIL


class Mutator:
    """Applies basic character-level mutations to a string."""

    def __init__(self, seed=None):
        self.random = random.Random(seed)

    def delete_random_character(self, s):
        """Removes one character at a random position."""
        if not s:
            return s
        pos = self.random.randrange(len(s))
        # Remove the character at that position and return the new string.
        return s[:pos] + s[pos + 1 :]

    def insert_random_character(self, s):
        """Inserts a random character at a random position."""
        pos = self.random.randint(0, len(s))
        # Insert a random character from the mutation set at that position.
        return s[:pos] + self.random.choice(MUTATION_CHARS) + s[pos:]

    def change_random_character(self, s):
        """Replaces one character with a different random one."""
        if not s:
            return s
        pos = self.random.randrange(len(s))
        # Choose a random character that is different from the one at that position.
        new = self.random.choice([c for c in MUTATION_CHARS if c != s[pos]])
        return s[:pos] + new + s[pos + 1 :]

    def duplicate_digit(self, s: str):
        """Repeats a digit in place, producing values like 22 or 11024."""
        positions = [i for i, c in enumerate(s) if c.isdigit()]
        if not positions:
            return s
        pos = self.random.choice(positions)
        return s[:pos] + s[pos] + s[pos:]

    def replace_random_cell(self, s: str):
        """Replaces one comma-separated cell with an interesting value."""
        if not (s.startswith("[") and s.endswith("]")):
            return s
        cells = s[1:-1].split(",")
        cells[self.random.randrange(len(cells))] = self.random.choice(INTERESTING_CELLS)
        return "[" + ",".join(cells) + "]"

    def mutate(self, s):
        """Applies one randomly chosen mutation."""
        operation = self.random.choice(
            [
                self.delete_random_character,
                self.insert_random_character,
                self.change_random_character,
                self.duplicate_digit,
                self.replace_random_cell,
            ]
        )
        return operation(s)


class MutationBoardFuzzer(Fuzzer):
    """Reads boards from a corpus file and mutates them into invalid boards."""

    MAX_ATTEMPTS = 100

    def __init__(self, path: Path, mutants=1, max_mutations=3, seed=None):
        # Read one board per line, ignoring blank lines.
        lines = path.read_text(encoding="utf-8").splitlines()
        self.boards = [line.strip() for line in lines if line.strip()]
        if not self.boards:
            raise ValueError(f"empty input file: {path}")
        self.mutants = mutants
        self.max_mutations = max_mutations
        self.mutator = Mutator(seed)
        # Keeps track of the original board of each generated mutant.
        self.originals = []
        # Iterator that goes through the corpus in order, input by input.
        self.pending = self.generate()

    def generate(self):
        """Yields the mutants of each board, following the file order."""
        for original in self.boards:
            for _ in range(self.mutants):
                yield original, self.mutate_invalid(original)

    def mutate_invalid(self, board: str):
        """Mutates a board until the result is invalid."""
        for _ in range(self.MAX_ATTEMPTS):
            mutant = board
            # Apply between 1 and max_mutations mutations in sequence.
            for _ in range(self.mutator.random.randint(1, self.max_mutations)):
                mutant = self.mutator.mutate(mutant)
            # A mutation can accidentally produce a valid board; discard those.
            if not is_valid_board(mutant):
                return mutant
        raise RuntimeError(f"could not generate an invalid mutant of {board}")

    def fuzz(self):
        """Returns the next mutant in the sequence."""
        original, mutant = next(self.pending)
        self.originals.append(original)
        return mutant

    def total(self):
        """Number of mutants that will be generated in total."""
        return len(self.boards) * self.mutants


def parse_board(board: str):
    """Returns the 16 cell values of a board, or None if it is not parseable."""
    if not (board.startswith("[") and board.endswith("]")):
        return None
    cells = board[1:-1].split(",")
    if len(cells) != BOARD_CELLS:
        return None
    if not all(CELL_PATTERN.fullmatch(cell) for cell in cells):
        return None
    return [int(cell) for cell in cells]


def has_valid_values(values):
    """Checks that every value is empty (0) or a power of two up to MAX_TILE."""
    return all(
        value == 0 or (2 <= value <= MAX_TILE and value & (value - 1) == 0)
        for value in values
    )


class MutantCLIRunner(BoardCLIRunner):
    """Runs the CLI with a mutated board and checks the right behavior."""

    # Failures of the environment, not of the program under test.
    JVM_ERRORS = (
        "UnsupportedClassVersionError",
        "Could not find or load main class",
        "NoClassDefFoundError",
    )

    def __init__(self):
        # Short description of the last verdict, used in the failure report.
        self.reason = ""

    def run(self, board: str):
        """Starts the game with the board and returns its result and outcome."""
        try:
            result = subprocess.run(
                self.COMMAND + [board],
                input="q\n",
                capture_output=True,
                text=True,
                timeout=self.TIMEOUT,
                cwd=ROOT,
                check=False,
            )
        except subprocess.TimeoutExpired:
            self.reason = "timeout"
            return None, UNRESOLVED

        # Errors from the JVM itself are not a verdict about the board.
        if any(error in result.stderr for error in self.JVM_ERRORS):
            self.reason = "JVM error"
            return result, UNRESOLVED
        # An uncaught Java exception or failed assertion is a bug.
        if "Exception in thread" in result.stderr or "\tat " in result.stderr:
            self.reason = result.stderr.strip().splitlines()[0]
            return result, FAIL

        values = parse_board(board)
        # A board is acceptable if its values are valid, even if written oddly.
        acceptable = values is not None and has_valid_values(values)

        # Clean rejection: exit code 2 and the validation message.
        if result.returncode == 2 and "Invalid initial board" in result.stderr:
            if is_valid_board(board):
                self.reason = "valid board was rejected"
                return result, FAIL
            return result, PASS

        # Accepted: it must be a valid board and be displayed correctly.
        if result.returncode == 0 and not result.stderr:
            if not acceptable:
                self.reason = "invalid board was accepted"
                return result, FAIL
            # Compare against the canonical form (e.g. "02" -> 2).
            canonical = "[" + ",".join(str(value) for value in values) + "]"
            if self.expected_board(canonical) not in result.stdout:
                self.reason = "displayed board differs from the supplied one"
                return result, FAIL
            return result, PASS

        # Any other exit code or stderr output is unexpected.
        self.reason = f"exit code {result.returncode}: {result.stderr.strip()}"
        return result, FAIL


def parse_arguments():
    """Reads and validates the script's command-line options."""
    parser = argparse.ArgumentParser(description=__doc__)
    # File produced by the grammar-based fuzzer, one valid board per line.
    parser.add_argument(
        "--input",
        type=Path,
        required=True,
        help="file with one valid board per line",
    )
    # Path of the file that will contain one mutated board per line.
    parser.add_argument(
        "--output",
        type=Path,
        default=ROOT / "grammar-based-fuzzer" / "mutated_boards.txt",
        help="file in which to save the mutated boards",
    )
    # File in which every failure (not only the first 10) is saved.
    parser.add_argument(
        "--fails",
        type=Path,
        default=ROOT / "grammar-based-fuzzer" / "fails.txt",
        help="file in which to save all the failing boards",
    )
    # Number of mutants to generate per input board.
    parser.add_argument(
        "--mutants",
        type=int,
        default=1,
        help="mutants generated per input board (default: 1)",
    )
    # Maximum number of mutations applied in sequence to each board.
    parser.add_argument(
        "--max-mutations",
        type=int,
        default=3,
        help="max mutations applied in sequence (default: 3)",
    )
    # Optional seed for reproducing a previously generated corpus.
    parser.add_argument(
        "--seed",
        type=int,
        default=None,
        help="random seed for reproducible mutation",
    )
    args = parser.parse_args()
    if args.mutants <= 0 or args.max_mutations <= 0:
        parser.error("--mutants and --max-mutations must be positive")
    # Writing the output over the input would destroy the original corpus.
    if args.input.resolve() == args.output.resolve():
        parser.error("--output must be different from --input")
    return args


def save_failures(path, failures):
    """Saves every failure to a file, one block per case."""
    path.parent.mkdir(parents=True, exist_ok=True)
    lines = []
    for index, original, board, detail in failures:
        lines.append(f"FAIL #{index}: {board} ({detail})")
        lines.append(f"    original: {original}")
    # Leave the file empty (no trailing newline) when there are no failures.
    path.write_text("\n".join(lines) + ("\n" if lines else ""), encoding="utf-8")


def print_results(board_count, input_path, output_path, fails_path, outcomes, failures):
    """Prints the corpus location and a summary of the runs."""
    print(f"Mutants: {board_count} (from {input_path})")
    print(f"Corpus: {output_path}")
    # Show the number of runs in each outcome category.
    for outcome, count in outcomes.items():
        print(f"{outcome}: {count}/{board_count}")
    # Limit failure details to keep the output manageable.
    for index, original, board, detail in failures[:10]:
        print(f"FAIL #{index}: {board} ({detail})", file=sys.stderr)
        print(f"    original: {original}", file=sys.stderr)
    if len(failures) > 10:
        # Report how many additional failures were left out.
        print(
            f"... and {len(failures) - 10} more failures (see {fails_path})",
            file=sys.stderr,
        )


def main():
    """Coordinates input reading, mutation, saving, execution, and reporting."""
    # Read the options provided by the user.
    args = parse_arguments()

    # The fuzzer only generates strings; the runner is responsible for testing them.
    fuzzer = MutationBoardFuzzer(
        args.input, args.mutants, args.max_mutations, args.seed
    )
    runner = MutantCLIRunner()
    boards = [fuzzer.fuzz() for _ in range(fuzzer.total())]

    # Create the output directory if needed and save one board per line.
    output_path = args.output.resolve()
    output_path.parent.mkdir(parents=True, exist_ok=True)
    output_path.write_text("\n".join(boards) + "\n", encoding="utf-8")

    # Initialize outcome counters and collect information about failed runs.
    outcomes = {PASS: 0, FAIL: 0, UNRESOLVED: 0}
    failures = []
    for index, board in enumerate(boards, start=1):
        # Run the board and increment the corresponding outcome counter.
        result, outcome = runner.run(board)
        outcomes[outcome] += 1
        if outcome != PASS:
            # Store the case number, original, mutant, and failure details.
            if result is None:
                detail = "timeout"
            else:
                detail = runner.reason
            failures.append((index, fuzzer.originals[index - 1], board, detail))

    # Save the failures to a file for later inspection.
    fails_path = args.fails.resolve()
    save_failures(fails_path, failures)

    # Print the summary and return a non-zero exit code if any run failed.
    print_results(len(boards), args.input, output_path, fails_path, outcomes, failures)
    return 1 if failures else 0


if __name__ == "__main__":
    # Allow this file to be run directly as a command-line script.
    sys.exit(main())
