package ar.edu.unrc.game2048;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovementTest {

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
    public void testMoveLeft() {
        Board board = createEmptyBoard();
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));
        board.setCell(0, 2, new Cell(4));
        board.setCell(0, 3, new Cell(4));

        Movement.MoveResult result = Movement.move(board, Board.Direction.LEFT);

        assertEquals(12, result.scoreDelta);
        assertEquals(new Cell(4), result.board.getCell(0, 0));
        assertEquals(new Cell(8), result.board.getCell(0, 1));
        assertEquals(Cell.EMPTY, result.board.getCell(0, 2));
        assertEquals(Cell.EMPTY, result.board.getCell(0, 3));
    }

    @Test
    public void testMoveRight() {
        Board board = createEmptyBoard();
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));
        board.setCell(0, 2, new Cell(4));
        board.setCell(0, 3, new Cell(4));

        Movement.MoveResult result = Movement.move(board, Board.Direction.RIGHT);

        assertEquals(12, result.scoreDelta);
        assertEquals(Cell.EMPTY, result.board.getCell(0, 0));
        assertEquals(Cell.EMPTY, result.board.getCell(0, 1));
        assertEquals(new Cell(4), result.board.getCell(0, 2));
        assertEquals(new Cell(8), result.board.getCell(0, 3));
    }

    @Test
    public void testMoveDown() {
        Board board = createEmptyBoard();
        board.setCell(0, 0, new Cell(2));
        board.setCell(1, 0, new Cell(2));
        board.setCell(2, 0, new Cell(4));
        board.setCell(3, 0, new Cell(4));

        Movement.MoveResult result = Movement.move(board, Board.Direction.DOWN);

        assertEquals(12, result.scoreDelta);
        assertEquals(Cell.EMPTY, result.board.getCell(0, 0));
        assertEquals(Cell.EMPTY, result.board.getCell(1, 0));
        assertEquals(new Cell(4), result.board.getCell(2, 0));
        assertEquals(new Cell(8), result.board.getCell(3, 0));
    }

    @Test
    public void testMoveUp() {
        Board board = createEmptyBoard();
        board.setCell(0, 0, new Cell(2));
        board.setCell(1, 0, new Cell(2));
        board.setCell(2, 0, new Cell(4));
        board.setCell(3, 0, new Cell(4));

        Movement.MoveResult result = Movement.move(board, Board.Direction.UP);

        assertEquals(12, result.scoreDelta);
        assertEquals(new Cell(4), result.board.getCell(0, 0));
        assertEquals(new Cell(8), result.board.getCell(1, 0));
        assertEquals(Cell.EMPTY, result.board.getCell(2, 0));
        assertEquals(Cell.EMPTY, result.board.getCell(3, 0));
    }
}
