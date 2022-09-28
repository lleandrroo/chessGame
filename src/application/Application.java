package application;

import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;

public class Application {

	public static void main(String[] args) {
		
		Position position = new Position(3,5);
		Board board = new Board(8,8);
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		System.out.println(position);
		System.out.println(board.toString());

	}

}
