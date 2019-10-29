package com.mycompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneNumberCalculator {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of a chess piece (King, Queen, Bishop, Knight, Rook, Pawn)");
        String pieceName = scanner.nextLine();  // Read user input
        // todo do more validation
        if (pieceName.trim().isEmpty()) {
            System.out.println("Enter valid chess piece name");
            System.exit(0);
        }
        System.out.println("Enter a starting position from 0 to 9");
        int startingPos = Integer.parseInt(scanner.nextLine());  // Read user input
        //todo validate input

        Piece piece = PieceFactory.getPiece(pieceName);
        List<Integer> numberList = new ArrayList<>();
        numberList.add(startingPos);
        int depth = 9;
        PossibleMovesGenerator algo;
        if (piece instanceof Pawn) {
            algo = new PawnAlgo((Pawn) piece, numberList, depth);
        } else {
            algo = new StandardAlgo(piece, numberList, depth);
        }
        PhoneNumberCalculator phoneNumberCalculator = new PhoneNumberCalculator();
        List<Integer> possiblePhoneNumbersList = phoneNumberCalculator.calculate(algo);
        System.out.println("Number of possible 10 digit phone numbers :  " + possiblePhoneNumbersList.size());

    }

    public List<Integer> calculate(PossibleMovesGenerator gen) {
        return gen.generatePossibleMoves();
    }
}
