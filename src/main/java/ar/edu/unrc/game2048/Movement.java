package ar.edu.unrc.game2048;

import java.util.ArrayList;
import java.util.List;

/**
 * The Movement class provides functionality to perform moves on the 2048 game
 * board.
 */
public class Movement {

    /**
     * Represents the result of a move operation, including the new board state and
     * the score delta.
     */
    public static final class MoveResult {

        /**
         * The resulting board after the move.
         */
        public final Board board;

        /**
         * The change in score resulting from the move.
         */
        public final int scoreDelta;

        /**
         * Constructs a MoveResult with the specified board and score delta.
         * 
         * @param board      The resulting board after the move.
         * @param scoreDelta The change in score resulting from the move.
         */
        MoveResult(Board board, int scoreDelta) {
            this.board = board;
            this.scoreDelta = scoreDelta;
        }
    }

    /**
     * Moves the board in the specified direction and returns the resulting board
     * and the score delta.
     * 
     * @param board The current board state.
     * @param dir   The direction to move (UP, DOWN, LEFT, RIGHT).
     * @return A MoveResult containing the new board state and the score delta.
     */
    public static MoveResult move(Board board, Board.Direction dir) {
        Board result = new Board(board);
        // This use a array for send parameter by reference, because java is pass by
        // value, and we need to update the scoreDelta in mergeCells method.
        int[] scoreDelta = new int[1];
        int size = board.getSize();
        for (int i = 0; i < size; i++) {
            List<Cell> nonEmpty = getNonEmptyCells(board, i, dir);
            List<Cell> merged = mergeCells(nonEmpty, scoreDelta);
            padWithEmptyCells(merged, size);
            putCells(result, merged, i, dir);
        }
        return new MoveResult(result, scoreDelta[0]);
    }

    /**
     * @param board The current board state.
     * @param i     The index of the row or column to retrieve.
     * @param dir   The direction of movement (UP, DOWN, LEFT, RIGHT).
     * @return A list of non-empty cells from the specified row or column.
     *         Retrieves the non-empty cells from the specified row or column of the
     *         board based on the direction.
     */
    private static List<Cell> getNonEmptyCells(Board board, int i, Board.Direction dir) {
        int size = board.getSize();
        Board.Position pos = getInitialPosition(i, dir, size);
        List<Cell> nonEmpty = new ArrayList<>();
        int row = pos.row;
        int col = pos.col;
        for (int step = 0; step < size; step++) {
            Cell cell = board.getCell(row, col);
            if (!cell.isEmpty()) {
                nonEmpty.add(cell);
            }
            row += dir.dRow;
            col += dir.dCol;
        }
        return nonEmpty;
    }

    /**
     * Merges adjacent cells in the list of non-empty cells and updates the score
     * delta.
     * 
     * @param nonEmpty   List of non-empty cells to be merged.
     * @param scoreDelta An array of size 1 to hold the score delta resulting from
     *                   the merges.
     * @return A list of merged cells after processing the non-empty cells.
     */
    private static List<Cell> mergeCells(List<Cell> nonEmpty, int[] scoreDelta) {
        List<Cell> merged = new ArrayList<>();
        int k = 0;
        while (k < nonEmpty.size()) {
            if (k + 1 < nonEmpty.size() && nonEmpty.get(k).canMergeWith(nonEmpty.get(k + 1))) {
                Cell mergedCell = nonEmpty.get(k).mergeWith(nonEmpty.get(k + 1));
                merged.add(mergedCell);
                scoreDelta[0] += mergedCell.getValue();
                k += 2;
            } else {
                merged.add(nonEmpty.get(k));
                k++;
            }
        }
        return merged;
    }

    /**
     * Pads the list of merged cells with empty cells until it reaches the specified
     * size.
     * 
     * @param merged List of merged cells to be padded with empty cells.
     * @param size   The desired size of the list after padding.
     */
    private static void padWithEmptyCells(List<Cell> merged, int size) {
        while (merged.size() < size) {
            merged.add(Cell.EMPTY);
        }
    }

    /**
     * Puts the merged cells into the result board at the specified row or column
     * based on the direction.
     * 
     * @param result The resulting board after the move.
     * @param merged List of merged cells to be placed in the result board.
     * @param i      The index of the row or column where the merged cells should be
     *               placed.
     * @param dir    The direction of movement (UP, DOWN, LEFT, RIGHT) indicating
     *               where to place the merged cells.
     */
    private static void putCells(Board result, List<Cell> merged, int i, Board.Direction dir) {
        Board.Position pos = getInitialPosition(i, dir, result.getSize());
        int row = pos.row;
        int col = pos.col;
        for (Cell cell : merged) {
            result.setCell(row, col, cell);
            row += dir.dRow;
            col += dir.dCol;
        }
    }

    /**
     * Returns the initial position (row, column) for the specified row or column
     * index and direction.
     * 
     * @param i    The index of the row or column.
     * @param dir  The direction of movement (UP, DOWN, LEFT, RIGHT).
     * @param size The size of the board.
     * @return A Board.Position object representing the initial position for the
     *         specified row or column and direction.
     */
    private static Board.Position getInitialPosition(int i, Board.Direction dir, int size) {
        switch (dir) {
            case LEFT:
                return new Board.Position(i, 0);
            case RIGHT:
                return new Board.Position(i, size - 1);
            case UP:
                return new Board.Position(0, i);
            case DOWN:
                return new Board.Position(size - 1, i);
            default:
                throw new IllegalArgumentException();
        }
    }
}