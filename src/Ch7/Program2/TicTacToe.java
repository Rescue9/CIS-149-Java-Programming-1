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
	
	// create new object TicTacToe
	private static TicTacToe myGame = new TicTacToe();
	
	public static void main(String[] args){
		
		// create header information and draw initial board
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
					anotherGame();
				}
				xsTurn = false;
			}
			if (!xsTurn){
				takeMyTurn('O');
				if(isBoardFull()){
					System.out.println("Nobody wins.... How about another game?");
					anotherGame();
				}
				xsTurn = true;
			}
		}
	}

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
		
		// check to see if the space is empty, if not notify user to select a new space
		if (board[row-1][col-1] != 'X'){
			if (board[row-1][col-1] != 'O'){
				myGame.addChar(row, col, player);
			}
		}
		else {
			System.out.println("The spot " + row + " " + col + " is not empty.");
			System.out.println("Try a different space....");
			takeMyTurn(player);
		}
		
		// execute checks to see if we have a winner
		System.out.println("the puzzle now is: \n" + myGame.drawBoard());
		if (myGame.checkRow()){
			weHaveAWinner(player);
		}
		if (myGame.checkCol()){
			weHaveAWinner(player);
		}
		if (myGame.checkDiagL2R()){
			weHaveAWinner(player);
		}
		if (myGame.checkDiagR2L()){
			weHaveAWinner(player);
		}
	}
	// check to see if all the spaces are used
	private static boolean isBoardFull(){
		boolean boardFull = true;
		for (int row = 0; row <=2; row++){
			for (int col=0; col<=2; col++){
				boardFull = boardFull && board[row][col]>0;
			}
		}
		return boardFull;
	}
	
	// add a specific character to a specific array
	private void addChar(int row, int col, char value){
		if (row>=0 && row<=3 && col >=0 && col <=3){
			board[row-1][col-1] = value;
		}
	}
	// check each row to see if they were someone won
	private boolean checkRow(){
		for (int row=0; row<=2; row++){
			if (board[row][0] == 'X' && board[row][1] == 'X' && board[row][2] == 'X'){
				weHaveAWinner('X');
				return true;
			}else if (board[row][0] == 'O' && board[row][1] == 'O' && board[row][2] == 'O'){
				weHaveAWinner('O');
				return true;
			}
		}
		return false;
	}
	
	// check each column to see if someone won
	private boolean checkCol(){
		for (int col=0; col<=2; col++){
			if (board[0][col] == 'X' && board[1][col] == 'X' && board[2][col] == 'X'){
				weHaveAWinner('X');
				return true;
			}else if (board[0][col] == 'O' && board[1][col] == 'O' && board[2][col] == 'O'){
				weHaveAWinner('O');
				return true;
			}
		}
		return false;
	}
		
	//check diagonally from left to right to see if someone won
	private boolean checkDiagL2R(){
		if (board[0][0] == 'X' &&  board[1][1] == 'X' && board[2][2] == 'X'){
			weHaveAWinner('X');
			return true;
		} else if (board[0][0] == 'O' &&  board[1][1] == 'O' && board[2][2] == 'O'){
			weHaveAWinner('O');
			return true;
		}
		return false;
	}
	
	// check diagonally from right to left to see if someone won
	private boolean checkDiagR2L(){
		if (board[0][2] == 'X' &&  board[1][1] == 'X' && board[2][0] == 'X'){
			weHaveAWinner('X');
			return true;
		}else if (board[0][2] == 'O' &&  board[1][1] == 'O' && board[2][0] == 'O'){
			weHaveAWinner('O');
			return true;
		}
		return false;
	}
	
	// proclaim a winner
	private static void weHaveAWinner(char who){
		System.out.println(who + " WINS!");
		anotherGame();
	}

	// ask if the user would like to play again
	private static void anotherGame(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Would you like to play again?");
		String answer = keyboard.next();
		if (answer.equalsIgnoreCase("Y")){
			myGame.drawBoard();
		} else {
			System.out.println("How about a nice game of chess? {snicker}");
			System.exit(0);
		}
	}
}
