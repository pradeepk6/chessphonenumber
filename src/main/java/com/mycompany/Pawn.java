package com.mycompany;

public class Pawn extends Piece {

    private int[][] moveRulesAtBottomRow = {
            {-1, 0}, {-2, 0},
    };

    private int[][] moveRules = {
            {-1, 0},
    };

    private int[][] queenRules = new Queen().getMoveRules();

    private boolean becameQueen;

    public Pawn() {
        super.setMoveRules(this.moveRules);
    }

    public boolean isBecameQueen() {
        return becameQueen;
    }

    public void setQueenMoveRules(boolean becameQueen) {
        super.setMoveRules(new Queen().getMoveRules());
        this.becameQueen = becameQueen;
    }

    public void setMoveRulesForBottomRow(boolean becameQueen) {
        super.setMoveRules(moveRulesAtBottomRow);
    }

    public int[][] getMoveRules(int currPos) {
        int[][] mRules;
        if(isBecameQueen()) {
            mRules = queenRules;
        }else {
            if(currPos == 0) {
                mRules = moveRulesAtBottomRow;
            } else if(currPos>0 && currPos<4) {
                mRules = queenRules;
                setQueenMoveRules(true);
            } else mRules = moveRules;
        }
       // System.out.println("currPos = " + currPos + mRules.length);
        return mRules;
    }
}
