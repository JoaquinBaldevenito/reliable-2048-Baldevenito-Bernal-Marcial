package ar.edu.unrc.game2048;

import java.util.Set;

public class AddRandomTile implements AddTileStrategy {
    @Override
    public boolean addTile(Cell[][] grid, Set<Board.Position> emptyPositions) {
        if (emptyPositions.isEmpty()) {
            return false;
        }
        int randomIndex = (int) (Math.random() * emptyPositions.size());
        Board.Position pos = emptyPositions.stream().skip(randomIndex).findFirst().get();
        int value = Math.random() < 0.9 ? 2 : 4;
        grid[pos.row][pos.col] = new Cell(value);
        return true;
    }
}