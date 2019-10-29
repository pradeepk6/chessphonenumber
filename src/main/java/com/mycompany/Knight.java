package com.mycompany;

public class Knight extends Piece {
    private int[][] moveRules = {
            {-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}
    };

    public Knight() {
        super.setMoveRules(this.moveRules);
    }

}
