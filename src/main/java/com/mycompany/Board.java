package com.mycompany;

import java.awt.*;

public class Board {

    public static final char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'},
    };
    private int currMove;

    public static int getNeighbour(int row, int col, int val) {
        Point currPos = getCoordinates(val);
        Point p = new Point(currPos.x + row, currPos.y + col);
        int n = -1;
        if (p.x < 0 || p.x > 3 || p.y < 0 || p.y > 2) {
            return -1;
        }
        if (Character.isDigit(board[p.x][p.y]))
            n = Character.getNumericValue(board[p.x][p.y]);
        //System.out.println("n = " + n);
        return n;
    }

    public static Point getCoordinates(int n) {
        Point p = null;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (Character.getNumericValue(board[i][j]) == n) {
                    p = new Point(i, j);
                    break;
                }
            }
        }
        return p;
    }

    public int getCurrMove() {
        return currMove;
    }

    public void setCurrMove(int currMove) {
        this.currMove = currMove;
    }

}
