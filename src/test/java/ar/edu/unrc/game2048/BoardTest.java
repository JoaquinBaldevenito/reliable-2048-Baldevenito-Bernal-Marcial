package ar.edu.unrc.game2048;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class BoardTest {

    @Test
    public void createDefaultBoard() {
        // Arrange & Act
        Board board = new Board();

        // Assert
        assertEquals(4, board.getSize());
        assertEquals(0, board.getScore());

        // Default size = 4, board = 4x4 = 16, 2 random tiles added, 14 empty positions
        assertEquals(14, board.getEmptyPositions().size());
    }

    @Test
    public void createValidBoardSize() {
        // Arrange
        int value = 6;

        // Act
        Board board = new Board(value);

        // Assert
        assertEquals(value, board.getSize());
        assertEquals(0, board.getScore());

        // Board = Value x Value, 2 random tiles added, (Value x Value) - 2 empty
        // positions
        assertEquals((value * value) - 2, board.getEmptyPositions().size());
    }

    @Test
    public void createValidBoardMinSize() {
        // Arrange
        int value = 1;

        // Act
        Board board = new Board(value);

        // Assert
        assertEquals(value, board.getSize());
        assertEquals(0, board.getScore());
    }

    @Test
    public void createInvalidBoardSize() {
        // Arrange
        int value = -1;

        // Act
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Board(value));

        // Assert
        assertTrue(exception.getMessage().contains("Board size must be positive: "));
    }

    @Test
    public void createMinInvalidBoardSize() {
        // Arrange
        int value = 0;

        // Act
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Board(value));

        // Assert
        assertTrue(exception.getMessage().contains("Board size must be positive: "));
    }

    @Test
    public void createBoardOther() {
        // Arrange
        int value = 6;
        Board other = new Board(value);

        // Act
        Board board = new Board(other);

        // Assert
        assertEquals(other.getSize(), board.getSize());
        assertEquals(other.getScore(), board.getScore());
        assertEquals(other, board);

        // Act (Modify original board)
        other.setCell(1, 1, new Cell(32));

        // Assert (The copy should remain unchanged)
        assertNotEquals(other, board);
    }

    @Test
    public void getSizeBoard() {
        // Arrange
        int value = 4;
        Board board = new Board(value);

        // Act
        int currentSize = board.getSize();

        // Assert
        assertEquals(value, currentSize);
    }

    @Test
    public void getScoreBoard() {
        // Arrange
        int value = 4;
        Board board = new Board(value);

        // Act
        int currentScore = board.getScore();

        // Assert
        assertEquals(0, currentScore);
    }

    @Test
    public void getValidCellBoard() {
        // Arrange
        int row = 0;
        int col = 0;
        Board board = new Board();

        // Act & Assert (Does not throw)
        assertDoesNotThrow(() -> board.getCell(row, col));

        // Act
        int cellValue = board.getCell(row, col).getValue();

        // Assert
        assertTrue(cellValue == 0 || cellValue == 2 || cellValue == 4);
    }

    @Test
    public void getInvalidCellBoardRowOutOfBounds() {
        // Arrange
        int row = -1;
        int col = 2;
        int size = 4;
        Board board = new Board(size);

        // Act
        IndexOutOfBoundsException exception = assertThrows(
                IndexOutOfBoundsException.class,
                () -> board.getCell(row, col));

        // Assert
        assertTrue(exception.getMessage().contains("is out of bounds for board size"));
    }

    @Test
    public void getInvalidCellBoardColOutOfBounds() {
        // Arrange
        int row = 1;
        int col = 6;
        int size = 4;
        Board board = new Board(size);

        // Act
        IndexOutOfBoundsException exception = assertThrows(
                IndexOutOfBoundsException.class,
                () -> board.getCell(row, col));

        // Assert
        assertTrue(exception.getMessage().contains("is out of bounds for board size"));

    }

    @Test
    public void setValidCellBoard() {
        // Arrange
        Cell cell = new Cell(2);
        int row = 2;
        int col = 2;
        int size = 4;
        Board board = new Board(size);

        // Act
        board.setCell(row, col, cell);
        Cell retrievedCell = board.getCell(row, col);

        // Assert
        assertEquals(cell, retrievedCell);
    }

    @Test
    public void setInvalidCellBoardNullCell() {
        // Arrange
        Cell cell = null;
        int row = 1;
        int col = 1;
        int size = 4;
        Board board = new Board(size);

        // Act
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> board.setCell(row, col, cell));

        // Assert
        assertTrue(exception.getMessage().contains("Cell cannot be null"));
    }

    @Test
    public void setInvalidCellBoardOutOfBounds() {
        // Arrange
        Cell cell = null; // Even if it's null, OutOfBounds is thrown first due to logic order
        int row = -1;
        int col = 6;
        int size = 4;
        Board board = new Board(size);

        // Act
        IndexOutOfBoundsException exception = assertThrows(
                IndexOutOfBoundsException.class,
                () -> board.setCell(row, col, cell));

        // Assert
        assertTrue(exception.getMessage().contains("is out of bounds for board size"));
    }

    // Helper method to clean the board
    private Board createEmptyBoard() {
        Board board = new Board();

        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                board.setCell(i, j, Cell.EMPTY);
            }
        }

        return board;
    }

    @Test
    public void testMoveLeftMergeWithoutSpaces() {
        Board board = createEmptyBoard();

        // Arrange
        board.setCell(0, 1, new Cell(2));
        board.setCell(0, 2, new Cell(2));

        // Act
        board.moveLeft();

        // Assert
        assertEquals(new Cell(4), board.getCell(0, 0));
    }

    @Test
    public void testMoveLeftNotMerge() {
        Board board = createEmptyBoard();
        // Arrange
        board.setCell(1, 1, new Cell(2));
        board.setCell(2, 1, new Cell(2));
        // Act
        board.moveLeft();
        // Assert
        assertEquals(new Cell(2), board.getCell(1, 0));
        assertEquals(new Cell(2), board.getCell(2, 0));
    }

    @Test
    public void testMoveLeftNotMove() {
        Board board = createEmptyBoard();
        // Arrange
        board.setCell(0, 0, new Cell(2));
        board.setCell(1, 0, new Cell(4));
        board.setCell(2, 0, new Cell(8));
        board.setCell(3, 0, new Cell(8));
        board.setCell(1, 1, new Cell(2));
        board.setCell(2, 1, new Cell(2));
        board.setCell(3, 1, new Cell(4));
        board.setCell(1, 2, new Cell(8));
        board.setCell(1, 3, new Cell(4));

        boolean moved = board.moveLeft();

        assertFalse(moved);
    }

    @Test
    public void testMoveLeftMergeWithSpaces() {
        Board board = createEmptyBoard();
        // Arrange
        board.setCell(0, 1, new Cell(2));
        board.setCell(0, 3, new Cell(2));
        // Act
        board.moveLeft();
        // Assert
        assertEquals(new Cell(4), board.getCell(0, 0));
    }

    @Test
    public void testMoveLeftTwoMergesDifferentResults() {
        Board board = createEmptyBoard();
        // Arrange
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));
        board.setCell(0, 2, new Cell(4));
        board.setCell(0, 3, new Cell(4));
        // Act
        board.moveLeft();
        // Assert
        assertEquals(new Cell(4), board.getCell(0, 0));
        assertEquals(new Cell(8), board.getCell(0, 1));
        assertEquals(12, board.getScore());
    }

    @Test
    public void testMoveLeftTwoMergesSameResults() {
        Board board = createEmptyBoard();
        // Arrange
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));
        board.setCell(0, 2, new Cell(2));
        board.setCell(0, 3, new Cell(2));
        // Act
        board.moveLeft();
        // Assert
        assertEquals(new Cell(4), board.getCell(0, 0));
        assertEquals(new Cell(4), board.getCell(0, 1));
    }

    @Test
    public void testMoveLeftCheckScore() {
        Board board = createEmptyBoard();
        // Arrange
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));
        // Act
        board.moveLeft();
        // Assert
        assertEquals(4, board.getScore());
    }

    @Test
    public void testMoveRightMergeWithoutSpaces() {
        Board board = createEmptyBoard();
        // Arrange
        board.setCell(0, 1, new Cell(2));
        board.setCell(0, 2, new Cell(2));
        // Act
        board.moveRight();
        // Assert
        assertEquals(new Cell(4), board.getCell(0, 3));
    }

    @Test
    public void testMoveRightNotMerge() {
        Board board = createEmptyBoard();
        // Arrange
        board.setCell(0, 1, new Cell(2));
        board.setCell(0, 2, new Cell(4));
        // Act
        board.moveRight();
        // Assert
        assertEquals(new Cell(2), board.getCell(0, 2));
        assertEquals(new Cell(4), board.getCell(0, 3));
    }

    @Test
    public void testMoveRightMergeWithSpaces() {
        Board board = createEmptyBoard();
        // Arrange
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 2, new Cell(2));
        // Act
        board.moveRight();
        // Assert
        assertEquals(new Cell(4), board.getCell(0, 3));
    }

    @Test
    public void testMoveRightNotMove() {
        Board board = createEmptyBoard();
        // Arrange
        board.setCell(0, 3, new Cell(2));
        // Act
        boolean moved = board.moveRight();
        // Assert
        assertFalse(moved);
    }

    @Test
    public void testMoveRightTwoMergesDifferentResults() {
        Board board = createEmptyBoard();
        // Arrange
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));
        board.setCell(0, 2, new Cell(4));
        board.setCell(0, 3, new Cell(4));
        // Act
        board.moveRight();
        // Assert
        assertEquals(new Cell(4), board.getCell(0, 2));
        assertEquals(new Cell(8), board.getCell(0, 3));
        assertEquals(12, board.getScore());
    }

    @Test
    public void testMoveRightTwoMergesSameResults() {
        Board board = createEmptyBoard();
        // Arrange
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));
        board.setCell(0, 2, new Cell(2));
        board.setCell(0, 3, new Cell(2));
        // Act
        board.moveRight();
        // Assert
        assertEquals(new Cell(4), board.getCell(0, 2));
        assertEquals(new Cell(4), board.getCell(0, 3));
    }

    @Test
    public void testMoveRightCheckScore() {
        Board board = createEmptyBoard();
        // Arrange
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));
        // Act
        board.moveRight();
        // Assert
        assertEquals(4, board.getScore());
    }

    @Test
    public void testEmptyBoardEquals() {
        Board board = createEmptyBoard();
        Board board1 = createEmptyBoard();
        assertTrue(board.equals(board1));
        assertTrue(board1.equals(board));
    }

    @Test
    public void testNotEqualsBoardsWithDifferentCells() {
        Board board = createEmptyBoard();
        Board board1 = createEmptyBoard();
        board.setCell(0, 0, new Cell(2));
        board1.setCell(0, 0, new Cell(4));
        assertFalse(board.equals(board1));
        assertFalse(board1.equals(board));
    }

    @Test
    public void testEqualsBoardsWithCells() {
        Board board = createEmptyBoard();
        Board board1 = createEmptyBoard();
        board.setCell(0, 0, new Cell(2));
        board1.setCell(0, 0, new Cell(2));
        assertTrue(board.equals(board1));
        assertTrue(board1.equals(board));
    }

    @Test
    public void testBoardEqualsItself() {
        Board board = createEmptyBoard();
        assertTrue(board.equals(board));
    }

    @Test
    public void testBoardNotEqualsNull() {
        Board board = createEmptyBoard();
        assertFalse(board.equals(null));
    }

    @Test
    public void testBoardNotEqualsDifferentClass() {
        Board board = createEmptyBoard();
        assertFalse(board.equals(new Cell(2)));
    }

    @Test
    public void testBoardsWithDifferentSizesAreNotEqual() {
        Board board = createEmptyBoard();
        Board board1 = new Board(3);
        assertFalse(board.equals(board1));
        assertFalse(board1.equals(board));
    }

    @Test
    public void testEqualBoardsHaveSameHashCode() {
        Board board = createEmptyBoard();
        Board board1 = createEmptyBoard();

        assertEquals(board, board1);
        assertEquals(board.hashCode(), board1.hashCode());
    }

    @Test
    public void testBoardToStringEmpty() {
        Board board = createEmptyBoard();

        String expected = "Score: 0\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n";

        assertEquals(expected, board.toString());
    }

    @Test
    public void testBoardToStringWithValues() {
        Board board = createEmptyBoard();

        board.setCell(0, 0, new Cell(2));
        board.setCell(1, 2, new Cell(16));

        String result = board.toString();

        // Dejo estos espacios pq en el toString los valores se muestran con espacios
        assertTrue(result.contains("    2"));
        assertTrue(result.contains("   16"));
        assertTrue(result.startsWith("Score: 0"));
    }

    @Test
    public void testPositionEquals() {
        Board.Position position = new Board.Position(1, 2);
        Board.Position position1 = new Board.Position(1, 2);

        assertTrue(position.equals(position1));
        assertTrue(position1.equals(position));
    }

    @Test
    public void testPositionNotEquals() {
        Board.Position position = new Board.Position(1, 2);
        Board.Position position1 = new Board.Position(2, 1);

        assertFalse(position.equals(position1));
        assertFalse(position1.equals(position));
    }

    @Test
    public void testPositionEqualsItself() {
        Board.Position position = new Board.Position(1, 2);

        assertTrue(position.equals(position));
    }

    @Test
    public void testPositionNotEqualsNull() {
        Board.Position position = new Board.Position(1, 2);

        assertFalse(position.equals(null));
    }

    @Test
    public void testPositionNotEqualsDifferentClass() {
        Board.Position position = new Board.Position(1, 2);

        assertFalse(position.equals("Position"));
    }

    @Test
    public void testEqualPositionsHaveSameHashCode() {
        Board.Position position = new Board.Position(1, 2);
        Board.Position position1 = new Board.Position(1, 2);

        assertEquals(position.hashCode(), position1.hashCode());
    }

    @Test
    public void testPositionToString() {
        Board.Position position = new Board.Position(1, 2);

        assertEquals("(1, 2)", position.toString());
    }

    @Test
    public void notHaveEmptyPositionsInBoard() {
        Board grid = new Board(4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid.setCell(i, j, new Cell(4));
            }
        }

        assertEquals(0, grid.getEmptyPositions().size());
    }

    @Test
    public void haveEmptyPositionsInBoard() {
        Board grid = new Board(4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid.setCell(i, j, Cell.EMPTY);
            }
        }
        assertEquals(16, grid.getEmptyPositions().size());
    }

    @Test
    public void correctAmountEmptyPositionsInBoard() {
        Board grid = new Board(4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid.setCell(i, j, Cell.EMPTY);
            }
        }

        int amounCellEmptys = 16;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid.setCell(i, j, new Cell(4));
                amounCellEmptys--;
                assertEquals(amounCellEmptys, grid.getEmptyPositions().size());
            }
        }
    }

    @Test
    public void notHaveEmptyCells() {
        Board grid = new Board(4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid.setCell(i, j, new Cell(4));
            }
        }

        assertFalse(grid.hasEmptyCells());
    }

    @Test
    public void haveEmptyCells() {
        Board grid = new Board(4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid.setCell(i, j, Cell.EMPTY);
            }
        }

        assertTrue(grid.hasEmptyCells());
    }

    @Test
    public void isWinningBoard() {
        Board grid = new Board(4);
        for (int i = 0; i < grid.getSize(); i++) {
            for (int j = 0; j < 4; j++) {
                grid.setCell(i, j, new Cell(2048));
                assertTrue(grid.isWinningBoard());
                grid.setCell((i), (j), Cell.EMPTY);
            }
        }
    }

    @Test
    public void notIsWinningBoard() {
        Board grid = new Board(4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid.setCell(i, j, Cell.EMPTY);
            }
        }
        assertFalse(grid.isWinningBoard());
    }

    @Test
    public void isLosingBoardFalseWhenRightmostPairCanMerge() {
        Board grid = createEmptyBoard();
        // Único merge posible: (0,2) y (0,3)
        grid.setCell(0, 0, new Cell(8));
        grid.setCell(0, 1, new Cell(4));
        grid.setCell(0, 2, new Cell(2));
        grid.setCell(0, 3, new Cell(2));

        grid.setCell(1, 0, new Cell(4));
        grid.setCell(1, 1, new Cell(8));
        grid.setCell(1, 2, new Cell(4));
        grid.setCell(1, 3, new Cell(8));

        grid.setCell(2, 0, new Cell(2));
        grid.setCell(2, 1, new Cell(4));
        grid.setCell(2, 2, new Cell(8));
        grid.setCell(2, 3, new Cell(4));

        grid.setCell(3, 0, new Cell(4));
        grid.setCell(3, 1, new Cell(2));
        grid.setCell(3, 2, new Cell(4));
        grid.setCell(3, 3, new Cell(8));

        assertFalse(grid.isLosingBoard());
    }

    @Test
    public void testIsLosingBoard() {
        // Arrange
        Board grid = createEmptyBoard();
        grid.setCell(0, 0, new Cell(2));
        grid.setCell(1, 0, new Cell(4));
        grid.setCell(2, 0, new Cell(8));
        grid.setCell(3, 0, new Cell(16));

        grid.setCell(0, 1, new Cell(16));
        grid.setCell(1, 1, new Cell(8));
        grid.setCell(2, 1, new Cell(4));
        grid.setCell(3, 1, new Cell(2));

        grid.setCell(0, 2, new Cell(2));
        grid.setCell(1, 2, new Cell(4));
        grid.setCell(2, 2, new Cell(8));
        grid.setCell(3, 2, new Cell(16));

        grid.setCell(0, 3, new Cell(16));
        grid.setCell(1, 3, new Cell(8));
        grid.setCell(2, 3, new Cell(4));
        grid.setCell(3, 3, new Cell(2));

        // Act & Assert
        assertTrue(grid.isLosingBoard());
    }

    @Test
    public void notIsLosingBoard() {
        Board grid = new Board(4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid.setCell(i, j, Cell.EMPTY);
            }
        }
        assertFalse(grid.isLosingBoard());
    }

    @Test
    public void notIsLosingBoardBecauseCanMerge() {
        Board grid = new Board(4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid.setCell(i, j, new Cell(4));
            }
        }
        assertFalse(grid.isLosingBoard());
    }

    @Test
    public void notIsLosingBoardBecauseCanMergePositinPerPosition() {
        Board grid = new Board(4);
        for (int i = 0; i < grid.getSize(); i++) {
            for (int j = 0; j < grid.getSize(); j++) {
                grid.setCell(i, j, new Cell(2));
            }
        }

        for (int i = 0; i < grid.getSize(); i++) {
            for (int j = 0; j < grid.getSize(); j++) {
                grid.setCell(i, j, new Cell(4));
                if (j + 1 < grid.getSize()) {
                    grid.setCell(i, (j + 1), new Cell(4));
                    assertTrue(grid.getCell(i, j).canMergeWith(grid.getCell(i, (j + 1))));
                    assertFalse(grid.isLosingBoard());
                    grid.setCell(i, (j + 1), new Cell(2));
                }
                // Check down neighbor
                if (i + 1 < grid.getSize()) {
                    grid.setCell((i + 1), j, new Cell(4));
                    assertTrue(grid.getCell(i, j).canMergeWith(grid.getCell((i + 1), j)));
                    assertFalse(grid.isLosingBoard());
                    grid.setCell((i + 1), j, new Cell(2));
                }
                grid.setCell(i, j, new Cell(2));
            }
        }
    }

    @Test
    public void haveIsFull() {
        Board grid = new Board(4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid.setCell(i, j, new Cell(4));
            }
        }

        assertTrue(grid.isFull());
    }

    @Test
    public void notHaveIsFull() {
        Board grid = new Board(4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid.setCell(i, j, Cell.EMPTY);
            }
        }

        assertFalse(grid.isFull());
    }

    @Test
    public void haveMoveUp() {
        Board grid = new Board(4);
        for (int i = 0; i < grid.getSize(); i++) {
            for (int j = 0; j < grid.getSize(); j++) {
                grid.setCell(i, j, Cell.EMPTY);
            }
        }

        for (int j = 0; j < 4; j++) {
            grid.setCell(0, j, new Cell(4));
        }

        grid.setCell(1, 1, new Cell(2));
        grid.setCell(1, 3, new Cell(2));
        grid.setCell(2, 1, new Cell(2));

        Board previous = new Board(grid);
        assertTrue(grid.moveUp());
        assertFalse(grid.equals(previous));
        assertNotEquals(grid.getScore(), previous.getScore());
        assertEquals(previous.getScore() + 4, grid.getScore());
    }

    @Test
    public void dontHaveMoveUp() {
        Board grid = new Board(4);

        for (int i = 0; i < grid.getSize(); i++) {
            for (int j = 0; j < grid.getSize(); j++) {
                grid.setCell(i, j, Cell.EMPTY);
            }
        }

        for (int j = 0; j < grid.getSize(); j++) {
            grid.setCell(0, j, new Cell(4));
        }

        for (int j = 0; j <= (grid.getSize() - 1); j++) {
            grid.setCell(1, j, new Cell(2));
        }

        for (int j = 0; j <= (grid.getSize() - 2); j++) {
            grid.setCell(2, j, new Cell(4));
        }

        grid.setCell(3, 0, new Cell(2));

        Board previous = new Board(grid);
        assertFalse(grid.moveUp());
        assertTrue(grid.equals(previous));
        assertEquals(grid.getScore(), previous.getScore());
    }

    @Test
    public void haveMoveDown() {
        Board grid = new Board(4);
        for (int i = 0; i < grid.getSize(); i++) {
            for (int j = 0; j < grid.getSize(); j++) {
                grid.setCell(i, j, Cell.EMPTY);
            }
        }

        for (int j = 0; j < 4; j++) {
            grid.setCell(0, j, new Cell(2));
        }

        grid.setCell(1, 1, new Cell(2));
        grid.setCell(1, 3, new Cell(4));
        grid.setCell(2, 1, new Cell(8));

        Board previous = new Board(grid);
        assertTrue(grid.moveDown());
        assertFalse(grid.equals(previous));
        assertNotEquals(grid.getScore(), previous.getScore());
        assertEquals(previous.getScore() + 4, grid.getScore());
    }

    @Test
    public void dontHaveMoveDown() {
        Board grid = new Board(4);
        for (int i = 0; i < grid.getSize(); i++) {
            for (int j = 0; j < grid.getSize(); j++) {
                grid.setCell(i, j, Cell.EMPTY);
            }
        }

        grid.setCell(0, 0, new Cell(4));
        grid.setCell(1, 0, new Cell(2));
        grid.setCell(2, 0, new Cell(4));
        grid.setCell(3, 0, new Cell(8));

        Board previous = new Board(grid);
        assertFalse(grid.moveDown());
        assertTrue(grid.equals(previous));
        assertEquals(previous.getScore(), grid.getScore());
    }

    @Test
    public void moveLeftReturnsTrueWhenBoardChanges() {
        Board board = createEmptyBoard();
        board.setCell(0, 1, new Cell(2));
        board.setCell(0, 2, new Cell(2));
        assertTrue(board.moveLeft());
    }

    @Test
    public void moveRightReturnsTrueWhenBoardChanges() {
        Board board = createEmptyBoard();
        board.setCell(0, 1, new Cell(2));
        board.setCell(0, 2, new Cell(2));
        assertTrue(board.moveRight());
    }

    @Test
    public void validatePosition() {
        Board board = new Board(4);

        Exception e1 = assertThrows(IndexOutOfBoundsException.class, () -> board.getCell(-1, 0));
        assertEquals("Position (-1, 0) is out of bounds for board size 4", e1.getMessage());

        Exception e2 = assertThrows(IndexOutOfBoundsException.class, () -> board.getCell(0, -1));
        assertEquals("Position (0, -1) is out of bounds for board size 4", e2.getMessage());

        Exception e3 = assertThrows(IndexOutOfBoundsException.class, () -> board.getCell(4, 0));
        assertEquals("Position (4, 0) is out of bounds for board size 4", e3.getMessage());

        Exception e4 = assertThrows(IndexOutOfBoundsException.class, () -> board.getCell(0, 4));
        assertEquals("Position (0, 4) is out of bounds for board size 4", e4.getMessage());
    }

    @Test
    public void validPositionsAtBoundaries() {
        Board board = new Board(4);

        // Si estos fallan o tiran excepción, el test se romperá, matando al mutante que
        // cambia "<" por "<="
        assertNotNull(board.getCell(0, 0));
        assertNotNull(board.getCell(3, 3));
        assertNotNull(board.getCell(3, 0));
        assertNotNull(board.getCell(0, 3));
    }

    @Test
    public void addRandomTileReturnsFalseWhenBoardIsFull() throws Exception {
        Board board = new Board(4);
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                board.setCell(i, j, new Cell(2));
        Method m = Board.class.getDeclaredMethod("addRandomTile");
        m.setAccessible(true);
        assertFalse((Boolean) m.invoke(board));
    }

    @Test
    public void addRandomTileReturnsTrueWhenBoardHasEmptyCells() throws Exception {
        Board board = new Board(4);
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                board.setCell(i, j, Cell.EMPTY);
        Method m = Board.class.getDeclaredMethod("addRandomTile");
        m.setAccessible(true);
        assertTrue((Boolean) m.invoke(board));
    }

    @Test
    public void testDifferentBoardsHaveDifferentHashCodes() {
        Board board = createEmptyBoard();
        board.setCell(0, 0, new Cell(2));

        Board board1 = createEmptyBoard();
        board1.setCell(0, 0, new Cell(4));

        assertNotEquals(board.hashCode(), board1.hashCode());
    }

    @Test
    public void testDifferentPositionsHaveDifferentHashCodes() {
        Board.Position pos1 = new Board.Position(1, 2);
        Board.Position pos2 = new Board.Position(2, 1);

        assertNotEquals(pos1.hashCode(), pos2.hashCode());
    }
}
