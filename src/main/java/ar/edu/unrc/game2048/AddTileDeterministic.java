package ar.edu.unrc.game2048;

import java.util.Set;

public class AddTileDeterministic implements AddTileStrategy{
    @Override
    public boolean addTile(Cell[][] grid, Set<Board.Position> emptyPositions) {
        if (emptyPositions.isEmpty()) {
            return false;
        }
        // Always choose the first position and return a 2
        Board.Position pos = emptyPositions.iterator().next();
        grid[pos.row][pos.col] = new Cell(2);
        return true;
    }
}
