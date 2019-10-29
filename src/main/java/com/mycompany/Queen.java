package com.mycompany;

public class Queen extends Piece {

    private int[][] moveRules = {
                    {1, 0},{0, 1}, {-1, 0}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1},
                    {2, 0},{0, 2}, {-2, 0}, {0, -2}, {2, 2}, {2, -2}, {-2, 2}, {-2, -2},
                    {3, 0},{0, 3}, {-3, 0}, {0, -3}, {3, 3}, {3, -3}, {-3, 3}, {-3, -3},
    };

    public Queen() {
        super.setMoveRules(this.moveRules);
    }
}
