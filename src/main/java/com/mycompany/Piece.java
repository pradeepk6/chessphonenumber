package com.mycompany;

public abstract class Piece {

    private int[][] moveRules;

    public int[][] getMoveRules() {
        return moveRules;
    }

    public void setMoveRules(int[][] moveRules) {
        this.moveRules = moveRules;
    }
}
