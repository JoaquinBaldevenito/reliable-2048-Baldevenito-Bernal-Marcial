package ar.edu.unrc.game2048;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    @Test
    public void createValidCell() {
        // Arrange & Act & Assert
        assertDoesNotThrow(() -> new Cell(0));
        assertDoesNotThrow(() -> new Cell(2));
        assertDoesNotThrow(() -> new Cell(4));
        assertDoesNotThrow(() -> new Cell(64));
        assertDoesNotThrow(() -> new Cell(128));
        assertDoesNotThrow(() -> new Cell(1024));
    }

    @Test
    public void createInvalidCell1() {
        // Arrange
        int invalidValue = 1;

        // Act
        assertThrows(
                IllegalArgumentException.class,
                () -> new Cell(invalidValue));
    }

    @Test
    public void createInvalidNegativeCell() {
        // Arrange
        int invalidValue = -2;

        // Act
        assertThrows(
                IllegalArgumentException.class,
                () -> new Cell(invalidValue));
    }

    @Test
    public void createInvalidNotPowCell() {
        // Arrange
        int invalidValue = 7;

        // Act
        assertThrows(
                IllegalArgumentException.class,
                () -> new Cell(invalidValue));
    }

    @Test
    public void cellSingleton() {
        // Arrange & Act
        Cell emptyCell = Cell.EMPTY;

        // Assert
        assertNotNull(emptyCell);
        assertEquals(0, emptyCell.getValue());
    }

    @Test
    public void cellcanMergeWith() {
        // Arrange
        Cell cellA = new Cell(2);
        Cell cellB = new Cell(2);

        // Act & Assert
        assertTrue(cellA.canMergeWith(cellB));
    }

    @Test
    public void cellcanMergeWithEquals() {
        // Arrange
        Cell cellA = new Cell(2);

        // Act & Assert
        assertFalse(cellA.canMergeWith(cellA));
    }

    @Test
    public void cellcanMergeWithNull() {
        // Arrange
        Cell cellA = new Cell(2);

        // Act & Assert
        assertFalse(cellA.canMergeWith(null));
    }

    @Test
    public void cellcanNotMergeWithDifferentValue() {
        // Arrange
        Cell cellA = new Cell(2);
        Cell cellB = new Cell(4);

        // Act & Assert
        assertFalse(cellA.canMergeWith(cellB));
    }

    @Test
    public void cellCanNotMergeWithBothEmpty() {
        // Arrange
        Cell cellA = new Cell(0);
        Cell cellB = new Cell(0);

        // Act & Assert
        assertFalse(cellA.canMergeWith(cellB));
    }

    @Test
    public void cellCanNotMergeWithOneEmptyOneWithValue() {
        // Arrange
        Cell cellA = new Cell(0);
        Cell cellB = new Cell(2);

        // Act & Assert
        assertFalse(cellA.canMergeWith(cellB));
    }

    @Test
    public void cellMergeWith() {
        // Arrange
        Cell cellA = new Cell(2);
        Cell cellB = new Cell(2);

        // Act
        Cell mergedCell = cellA.mergeWith(cellB);

        // Assert
        assertEquals(4, mergedCell.getValue());
    }

    @Test
    public void cellInvalidMergeWith() {
        // Arrange
        Cell cellA = new Cell(0);
        Cell cellB = new Cell(2);

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> cellA.mergeWith(cellB));

        assertTrue(exception.getMessage().contains("Cannot merge cells:"));
    }

    @Test
    public void cellInvalidMergeWithDifferentValue() {
        // Arrange
        Cell cellA = new Cell(4);
        Cell cellB = new Cell(2);

        // Act
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> cellA.mergeWith(cellB));

        // Assert
        assertTrue(exception.getMessage().contains("Cannot merge cells:"));
    }

    @Test
    public void notMergeCellsEmptys() {
        // Arrange
        Cell cell = new Cell(0);
        Cell cell1 = new Cell(0);

        // Act
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> cell.mergeWith(cell1));

        // Assert
        assertTrue(exception.getMessage().contains("Cannot merge cells:"));
    }

    @Test
    public void cellNotEquals() {
        // Arrange
        Cell cellA = new Cell(0);
        Cell cellB = new Cell(2);

        // Act & Assert
        assertFalse(cellA.equals(cellB));
    }

    @Test
    public void cellNotEqualsNull() {
        // Arrange
        Cell cellA = new Cell(0);
        Object nullObject = null;

        // Act & Assert
        assertFalse(cellA.equals(nullObject));
    }

    @Test
    public void cellNotEqualsObject() {
        // Arrange
        Cell cellA = new Cell(0);
        Object s = "Sample Text";

        // Act & Assert
        assertFalse(cellA.equals(s));
    }

    @Test
    public void cellsEquals() {
        // Arrange
        Cell cell = new Cell(0);
        Cell cell1 = new Cell(0);

        // Act
        boolean equalsSelf = cell.equals(cell);
        boolean equalsOther = cell.equals(cell1);

        // Assert
        assertTrue(equalsSelf);
        assertTrue(equalsOther);
    }

    @Test
    public void cellIsEmpty() {
        // Arrange
        Cell cell = new Cell(0);

        // Act
        boolean result = cell.isEmpty();

        // Assert
        assertTrue(result);
    }

    @Test
    public void cellIsNotEmpty() {
        // Arrange
        Cell cell = new Cell(4);

        // Act
        boolean result = cell.isEmpty();

        // Assert
        assertFalse(result);

    }

    @Test
    public void CellgetValue() {
        // Arrange
        Cell cell = new Cell(4);

        // Act
        int value = cell.getValue();

        // Assert
        assertEquals(4, value);
    }

    @Test
    public void notEqualsHashcode() {
        // Arrange
        Cell cell = new Cell(0);
        Cell cell1 = new Cell(2);

        // Act
        int hashCell = cell.hashCode();
        int hashCell1 = cell1.hashCode();

        // Assert
        assertNotEquals(hashCell, hashCell1);
    }

    @Test
    public void equalsHashcode() {
        // Arrange
        Cell cell = new Cell(0);

        // Act
        int hashCell = cell.hashCode();
        int hashCell1 = cell.hashCode();

        // Assert
        assertEquals(hashCell, hashCell1);
    }

    @Test
    public void toStringCell() {
        // Arrange
        Cell cellEmpty = new Cell(0);
        Cell cellWithValue = new Cell(2);

        // Act
        String strEmpty = cellEmpty.toString();
        String strWithValue = cellWithValue.toString();

        // Assert
        assertEquals(".", strEmpty);
        assertEquals("2", strWithValue);
    }
}
