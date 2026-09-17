package ar.edu.unrc.game2048;

import java.util.Set;

public interface  AddTileStrategy {
    boolean addTile(Cell[][] grid, Set<Board.Position> emptyPositions);
}
