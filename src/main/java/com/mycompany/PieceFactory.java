package com.mycompany;

public class PieceFactory {

    public static Piece getPiece(String pieceName) {
        Piece piece = null;
        pieceName = pieceName.toUpperCase();
        switch (pieceName) {
            case "KNIGHT":
                piece = new Knight();
                break;
            case "PAWN":
                piece = new Pawn();
                break;
            case "QUEEN":
                piece = new Queen();
                break;
        }
        return piece;
    }
}
