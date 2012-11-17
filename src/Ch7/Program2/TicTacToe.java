/*
 * Program: TicTacToe.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Nov 15, 2012
 * Purpose: To create a working TicTacToe game.
*/

package Ch7.Program2;

import java.util.Scanner;

public class TicTacToe {
	// declare character multidimensional array board
	private static char[][] board;
	
	// initialize board multidimensional array to 3 rows & columns
	public TicTacToe(){
		board = new char[3][3];
	}
	
	//create new object TicTacToe
	private static TicTacToe myGame = new TicTacToe();

	
	// draw the board initially & redraw the board as needed for guess
	public String drawBoard(){
		String boardString = "\n\n    Row/Col\n\n";
		boardString = boardString + "    1  2  3\n";
		boardString = boardString + "   --------\n";
		for (int i=0; i<3; i++){
			boardString = boardString + (i+1) + " |";
			for (int j=0; j<3; j++){
				if (board[i][j] == 0)
					boardString = boardString + " .|";
				else
					boardString = boardString + " " + board[i][j] + "|";
			}
			boardString = boardString + "\n";
			boardString = boardString + "  |__|__|__|\n";
		}
		return boardString;
	}
	
	// add a specific character to a specific array
	private void addChar(int row, int col, char value){
		if (row>=0 && row<=3 && col >=0 && col <=3){
			board[row-1][col-1] = value;
		}
	}

	private boolean checkHoriz(){
		boolean win = true;
		int row = 0;
		for (row=0; row<=2; row++){
			//System.out.println(row + " row check"); // used for testing
			if (board[row][0] != board[row][1]){
				win = false;
			}else if (board[row][0] != board[row][2]){
				win = false;
			}
		}
		return win;
	}

	private boolean checkVert(){
		boolean win = true;
		int col=0;
		for (col=0; col<=2; col++){
			// System.out.println(col + " col check"); // used for testing
			if (board[0][col] != board[1][col]){
				win = false;
			}else if (board[1][col] != board[2][col]){
				win = false;
			}
		}
		return win;
		}
		
	private boolean checkDiagL2R(){
		boolean win = true;
		if (board[0][0] != board[1][1] || board[1][1] != board[2][2]){
			win = false;
		} else if (board[1][1] != 'O' && board[1][1] != 'X'){
			win = false;
		}
		return win;
	}
	
	private boolean checkDiagR2L(){
		boolean win = true;
		if (board[0][2] != board[1][1] || board[1][1] != board[2][0]){
			win = false;
		}else if (board[1][1] != 'O' && board[1][1] != 'X'){
			win = false;
		}
		return win;
	}
	
	private static void weHaveAWinner(char who){
		System.out.println(who + " WINS!"); //TODO determine who actually won
		System.exit(0);
	}

	private static boolean isBoardFull(){
		boolean boardFull = true;
		for (int row = 0; row <=2; row++){
			for (int col=0; col<=2; col++){
				boardFull = boardFull && board[row][col]>0;
			}
		}
		return boardFull;
	}
	
	public static void main(String[] args){
		
		
		System.out.println("\tTicTacToe Game:");
		System.out.println();
		System.out.println("The puzzle is:" + myGame.drawBoard());
		boolean win = false;
		boolean xsTurn = true;
		while (!win){
			if (xsTurn){
				takeMyTurn('X');
				if(isBoardFull()){
					System.out.println("Nobody wins.... How about another game?");
					System.exit(0);
				}
				xsTurn = false;
			}
			if (!xsTurn){
				takeMyTurn('O');
				if(isBoardFull()){
					System.out.println("Nobody wins.... How about another game?");
					System.exit(0);
				}
				xsTurn = true;
			}
		}
	}
		

	private static void takeMyTurn(char who){
		Scanner keyboard = new Scanner(System.in);
		System.out.println(who + "'s turn");
		System.out.println("Where do you want " + who +" placed?");
		System.out.println("Please enter row number and column number seperated by a space");
		int row = keyboard.nextInt();
		int col = keyboard.nextInt();
		char player = who;
		
		String boardPosition = board[row-1][col-1] + " is placed here.";
		System.out.println(boardPosition);
		
		// check to see if the space is empty
		if (board[row-1][col-1] != 'X'){
			if (board[row-1][col-1] != 'O'){
				myGame.addChar(row, col, player);
			}
		}
		else {
			System.out.println("The spot " + row + " " + col + " is not empty.");
			System.out.println("Try a different space....");
			//System.out.println(myGame.drawBoard());
			takeMyTurn(player);
		}
		
		System.out.println("the puzzle now is: \n" + myGame.drawBoard());
		
		boolean didIWin = myGame.checkVert();
		if (didIWin){
			weHaveAWinner(player);
		}
		didIWin = myGame.checkHoriz();
		if (didIWin){
			weHaveAWinner(player);
		}
		didIWin = myGame.checkDiagL2R();
		if (didIWin){
			weHaveAWinner(player);
		}
		didIWin = myGame.checkDiagR2L();
		if (didIWin){
			weHaveAWinner(player);
		}
	}
}
