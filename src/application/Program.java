package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch cm1 = new ChessMatch();
		
		UI.printBoard(cm1.getPieces());
		
		
	}

}
