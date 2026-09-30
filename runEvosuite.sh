#!/bin/bash
# generate_evosuite_tests.sh

EVOSUITE_JAR="evosuite-1.0.6.jar"
EVOSUITE_URL="https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar"
TARGET_CLASS="ar.edu.unrc.game2048.Board"
TARGET_CLASS1="ar.edu.unrc.game2048.Cell"
TARGET_CLASS2="ar.edu.unrc.game2048.Movement"
SEARCH_BUDGET=60

# Download EvoSuite if not exists
if [ ! -f "$EVOSUITE_JAR" ]; then
    echo "Downloading EvoSuite..."
    wget "$EVOSUITE_URL" || curl -L -o "$EVOSUITE_JAR" "$EVOSUITE_URL"
fi

# Build project first
mvn clean compile

CLASS_PATH=$(pwd)/target/classes

# Generate tests
echo ""\n" Generating EvoSuite tests Board..."
java -jar "$EVOSUITE_JAR" -projectCP "$CLASS_PATH" -class $TARGET_CLASS \
    -Dsearch_budget=$SEARCH_BUDGET -Dtest_dir=src/test/java -Duse_separate_classloader=false

echo ""\n" Generating EvoSuite tests Cell..."
java -jar "$EVOSUITE_JAR" -projectCP "$CLASS_PATH" -class $TARGET_CLASS1 \
    -Dsearch_budget=$SEARCH_BUDGET -Dtest_dir=src/test/java -Duse_separate_classloader=false


echo ""\n" Generating EvoSuite tests Movement..."
java -jar "$EVOSUITE_JAR" -projectCP "$CLASS_PATH" -class $TARGET_CLASS2 \
    -Dsearch_budget=$SEARCH_BUDGET -Dtest_dir=src/test/java -Duse_separate_classloader=false
# Run tests
mvn test -Pevosuite
