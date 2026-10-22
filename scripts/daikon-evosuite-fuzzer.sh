#!/usr/bin/env bash
# Combines the EvoSuite trace with traces of random CLI games produced by the
# Assignment 3 fuzzer, and infers invariants with Daikon over all of them.
# EvoSuite adds variety of objects (board sizes, spawners); the fuzzer adds
# variety of values (long games, high cells and scores).
# Requires Java 11+ (Daikon) and python3.
set -euo pipefail
cd "$(dirname "$0")/.."

OUT=daikon-traces
GAMES=5
PATTERN='^ar\.edu\.unrc\.game2048\.(Board|Cell)(\.|:::)'

# 1. EvoSuite trace (also compiles the project).
./scripts/daikon-evosuite.sh

# 2. Fuzzer traces: one random game per seed, fed to the CLI through stdin.
#    fuzzer.py's main() runs the game itself and only prints a summary, so the
#    moves are generated with RandomFuzzer directly. Fixed seeds make the games
#    reproducible (the CLI uses the deterministic tile spawner).
rm -f "$OUT"/fuzzer*.dtrace.gz
for i in $(seq 1 "$GAMES"); do
  python3 -c "import random; random.seed($i)
from fuzzer import RandomFuzzer
print(RandomFuzzer(1000, 3000).fuzz(), end='')" \
  | java -cp "lib/daikon.jar:target/classes" daikon.Chicory \
         --output-dir="$OUT" \
         --dtrace-file="fuzzer$i.dtrace.gz" \
         --ppt-select-pattern="$PATTERN" \
         ar.edu.unrc.game2048.MainCLI > /dev/null
done

# 3. Infer invariants over the EvoSuite trace and all fuzzer traces together.
java -cp lib/daikon.jar daikon.Daikon \
     -o "$OUT/evosuite-fuzzer.inv.gz" \
     "$OUT/evosuite.dtrace.gz" "$OUT"/fuzzer*.dtrace.gz \
     > "$OUT/evosuite-fuzzer-invariants.txt"
echo "Invariants written to $OUT/evosuite-fuzzer-invariants.txt"
