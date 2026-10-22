#!/usr/bin/env bash
# Runs the EvoSuite-generated tests through Chicory and infers invariants with Daikon.
# Requires Java 11+ (Daikon). EvoSuite 1.0.6's EvoRunner needs Java 8 (tools.jar),
# so the tests are rewritten as plain JUnit 4 tests before tracing.
set -euo pipefail
cd "$(dirname "$0")/.."

SRC=target/daikon-es-src
CLS=target/daikon-es-classes
OUT=daikon-traces

# 1. Compile main + test code and dump the dependency classpath to a file
#    (`-q -DforceStdout` prints nothing with this Maven setup).
mvn -q test-compile dependency:build-classpath -Dmdep.outputFile=target/cp.txt
CP="$(cat target/cp.txt)"

# 2. Rewrite the EvoSuite tests: drop EvoRunner and the scaffolding, and remove
#    tests that build huge boards (e.g. new Board(2789)): they time out and a
#    timed-out test keeps writing to the trace, corrupting it.
rm -rf "$SRC" "$CLS"
mkdir -p "$SRC" "$CLS" "$OUT"
for c in Cell Board; do
  perl -0pe '
    s/^\@RunWith\(EvoRunner\.class\).*\n//m;
    s/ extends \w+_ESTest_scaffolding//;
    s/  \@Test\(timeout = \d+\)\n  public void \w+\(\)[^{]*\{(?:(?!\n  \}\n).)*?new Board\(\d{3,}.*?\n  \}\n//gs;
  ' "src/test/java/ar/edu/unrc/game2048/${c}_ESTest.java" > "$SRC/${c}_ESTest.java"
done
javac -d "$CLS" -cp "target/classes:$CP" "$SRC"/*.java

# 3. Collect the trace, instrumenting only Board and Cell (not EvoSuite/JUnit), with
#    the same pattern as the manual-test trace so both traces can be combined.
rm -f "$OUT/evosuite.dtrace.gz"
java -cp "lib/daikon.jar:target/classes:$CLS:$CP" \
     daikon.Chicory \
     --output-dir="$OUT" \
     --dtrace-file=evosuite.dtrace.gz \
     --ppt-select-pattern='^ar\.edu\.unrc\.game2048\.(Board|Cell)(\.|:::)' \
     --ppt-omit-pattern='_ESTest' \
     org.junit.runner.JUnitCore \
     ar.edu.unrc.game2048.Cell_ESTest ar.edu.unrc.game2048.Board_ESTest \
     2> >(grep -v 'classfile version' >&2)

# 4. Infer invariants.
java -cp lib/daikon.jar daikon.Daikon \
     -o "$OUT/evosuite.inv.gz" "$OUT/evosuite.dtrace.gz" > "$OUT/evosuite-invariants.txt"
echo "Invariants written to $OUT/evosuite-invariants.txt"
