package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		
		//imprimir peças do tabuleiro
		UI.printBoard(chessMatch.getPieces());
		
	    
	}

}
