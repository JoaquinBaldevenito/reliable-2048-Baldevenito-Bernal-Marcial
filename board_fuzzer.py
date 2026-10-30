"""Generate initial 2048 boards with a grammar and run them through the CLI."""

import argparse
import random
import re
import subprocess
import sys
from pathlib import Path

# Project directory, used to locate Java classes and save results.
ROOT = Path(__file__).resolve().parent
# The board is a 4-by-4 grid, so it has 16 cells.
BOARD_SIZE = 4
BOARD_CELLS = BOARD_SIZE * BOARD_SIZE

# Possible outcomes for each program run.
PASS = "PASS"
FAIL = "FAIL"
UNRESOLVED = "UNRESOLVED"

# Valid tile values. 2048 is omitted so generated boards do not start in a
# winning state.
TILE_VALUES = ["2", "4", "8", "16", "32", "64", "128", "256", "512", "1024"]
# A cell can be empty (0) or contain a valid tile.
CELL_VALUES = ["0"] + TILE_VALUES


class Runner:
    """Base interface for running an input and classifying its outcome."""

    def run(self, board: str):
        # Concrete runners must implement the execution.
        raise NotImplementedError


class BoardCLIRunner(Runner):
    """Runs the Java CLI and checks that it loads the supplied board."""

    # Command that starts the game with assertions enabled.
    COMMAND = [
        "java", "-ea", "-cp", str(ROOT / "target/classes"),
        "ar.edu.unrc.game2048.MainCLI",
    ]
    # A longer run is considered inconclusive.
    TIMEOUT = 5

    @staticmethod
    def expected_board(board: str):
        """Builds the text expected when the initial board is displayed."""
        # Remove the brackets and convert the cell values to integers.
        values = [int(value) for value in board[1:-1].split(",")]
        # The CLI displays the score and a border around each row.
        border = "+" + "-----+" * BOARD_SIZE
        lines = ["Score: 0", border]
        for row in range(BOARD_SIZE):
            # Select the four cells that make up this row.
            cells = values[row * BOARD_SIZE:(row + 1) * BOARD_SIZE]
            # Empty cells are displayed as spaces; other cells show their value.
            lines.append("|" + "".join(
                "     |" if value == 0 else f"{value:5d}|"
                for value in cells
            ))
            lines.append(border)
        # Add the final newline to match Java's output.
        return "\n".join(lines) + "\n"

    def run(self, board: str):
        """Starts the game with the board and returns its result and outcome."""
        try:
            # Pass the board as an argument and send 'q' on stdin to quit after display.
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
            # The game did not respond in time, so this is not a confirmed failure.
            return None, UNRESOLVED

        # A non-zero exit code or stderr output indicates a failed run.
        if result.returncode != 0 or result.stderr:
            return result, FAIL
        # Also fail if the displayed board differs from the generated board.
        if self.expected_board(board) not in result.stdout:
            return result, FAIL
        # The run passed if it exited successfully and displayed the expected board.
        return result, PASS


class Fuzzer:
    """Base interface for fuzzers that generate one input at a time."""

    def fuzz(self):
        # Each concrete fuzzer defines how to generate an input.
        raise NotImplementedError

    def run(self, runner: Runner):
        # Generate an input and pass it to the runner.
        return runner.run(self.fuzz())

    def runs(self, runner: Runner, trials: int = 10):
        # Generate and run inputs the requested number of times.
        return [self.run(runner) for _ in range(trials)]


class GrammarBasedBoardFuzzer(Fuzzer):
    """Expands a grammar to generate strings representing valid 4x4 boards."""

    # Each key is a grammar symbol replaced by one of its alternatives.
    # Two tiles and one zero ensure that the board is non-empty and non-winning.
    GRAMMAR = {
        "<board>": ["[<initial-tile>,<initial-tile>,0,<remaining-cells>]"],
        "<initial-tile>": TILE_VALUES,
        # Fill the remaining 13 cells by choosing values individually.
        "<remaining-cells>": [",".join(["<cell>"] * (BOARD_CELLS - 3))],
        "<cell>": CELL_VALUES,
    }

    def __init__(self, seed = None):
        # A fixed seed makes the pseudo-random sequence reproducible.
        self.random = random.Random(seed)

    def fuzz(self):
        """Generates and returns a string with 16 comma-separated values."""
        board = "<board>"
        while True:
            # Find the first grammar symbol that still needs expansion.
            match = re.search(r"<[^<>]+>", board)
            if match is None:
                # With no symbols left, the string is the completed board.
                return board
            # Replace the symbol with a randomly selected alternative.
            replacement = self.random.choice(self.GRAMMAR[match.group()])
            board = board[:match.start()] + replacement + board[match.end():]


def parse_arguments():
    """Reads and validates the script's command-line options."""
    parser = argparse.ArgumentParser(description=__doc__)
    # Number of boards to generate and test with the CLI.
    parser.add_argument(
        "--count",
        type=int,
        default=1000,
        help="number of boards to generate and run (default: 1000)",
    )
    # Optional seed for reproducing a previously generated corpus.
    parser.add_argument(
        "--seed",
        type=int,
        default=None,
        help="random seed for reproducible generation",
    )
    # Path of the file that will contain one generated board per line.
    parser.add_argument(
        "--output",
        type=Path,
        default=ROOT / "grammar-based-fuzzer" / "fuzzed_boards.txt",
        help="file in which to save generated boards",
    )
    args = parser.parse_args()
    # An empty or negative batch size is not valid.
    if args.count <= 0:
        parser.error("--count must be a positive integer")
    return args


def print_results(board_count, output_path, outcomes, failures):
    """Prints the corpus location and a summary of the runs."""
    print(f"Generated: {board_count} boards")
    print(f"Corpus: {output_path}")
    # Show the number of runs in each outcome category.
    for outcome, count in outcomes.items():
        print(f"{outcome}: {count}/{board_count}")
    # Limit failure details to keep the output manageable.
    for index, board, detail in failures[:10]:
        print(f"FAIL #{index}: {board} ({detail})", file=sys.stderr)
    if len(failures) > 10:
        # Report how many additional failures were left out.
        print(f"... and {len(failures) - 10} more failures", file=sys.stderr)


def main():
    """Coordinates input generation, saving, execution, and reporting."""
    # Read the options provided by the user.
    args = parse_arguments()

    # The fuzzer only generates strings; the runner is responsible for testing them.
    fuzzer = GrammarBasedBoardFuzzer(seed=args.seed)
    runner = BoardCLIRunner()
    boards = [fuzzer.fuzz() for _ in range(args.count)]

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
            # Store the case number, board, and failure details.
            detail = "timeout" if result is None else result.stderr.strip()
            failures.append((index, board, detail or "unexpected CLI output"))

    # Print the summary and return a non-zero exit code if any run failed.
    print_results(len(boards), output_path, outcomes, failures)
    return 1 if failures else 0


if __name__ == "__main__":
    # Allow this file to be run directly as a command-line script.
    sys.exit(main())
