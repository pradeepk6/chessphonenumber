package com.mycompany;

import java.util.ArrayList;
import java.util.List;

public class StandardAlgo implements PossibleMovesGenerator {

    private Piece piece;
    private List<Integer> positionList;
    private int depth;

    public StandardAlgo(Piece piece, List<Integer> positionList, int depth) {
        this.piece = piece;
        this.positionList = positionList;
        this.depth = depth;
    }

    @Override
    public List<Integer> generatePossibleMoves() {
        ArrayList<Integer> possibleMoves = new ArrayList<>();
        //System.out.println("positionList = " + positionList.size());
        if (depth == 0) return positionList;
        depth--;
        for (int currPos : positionList) {
            possibleMoves.add(currPos);
            for (int[] arr : piece.getMoveRules()) {
                int num = Board.getNeighbour(arr[0], arr[1], currPos);
                if (num != -1) {
                    possibleMoves.add(num);
                    // System.out.println("pMoves size : " + possibleMoves.size());
                }
            }
        }
        positionList = possibleMoves;
        return generatePossibleMoves();
    }

}
