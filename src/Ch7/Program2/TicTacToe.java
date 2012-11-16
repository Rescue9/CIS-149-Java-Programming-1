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

	private boolean checkWin(int case){ // CHECK VALIDITY OF THIS SWITCH STATEMENT
		boolean win = true;
		
		switch (nextCase) {
			case 1: win = win && checkHoriz();
					return win;
					break;
					
			case 2: win = win && checkVert();
					return win;
					break;
					
			case 3: win = win && checkDiagL2R();
					return win;
					break;
					
			case 4: win = win && checkDiagR2L();
					return win;
					break;
		}
		return null;
	}
	
	private boolean checkHoriz(int row){
		boolean win = true;
		int i=0;
		if (board[row][i] != board[row][i+1]){
			win = false;
			}
		if (board[row][i] != board[row][i+2]){
			win = false;
			}
		return win;
		}

	private boolean checkVert(int col){
		boolean win = true;
		int i=0;
		if (board[i][col] != board[i+1][col]){
			win = false;
			}
		if (board[i][col] != board[i+2][col]){
			win = false;
			}
		return win;
		}
		
	private boolean checkDiagL2R(){
		boolean win = true;
		if (board[0][0] != board[1][1]{
			win = false;
		}
		if (board[0][0] != board[2][2]{
			win = false;
		}
		return win;
	}

	
	public static void main(String[] args){
		
		TicTacToe myGame = new TicTacToe();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\tTicTacToe Game:");
		System.out.println();
		System.out.println("The puzzle is:" + myGame.drawBoard());
		boolean win = false;
		
		while(!win){
			System.out.println("X's turn");
			System.out.println("Where do you want X placed?");
			System.out.println("Please enter row number and column number seperated by a space");
			int row = keyboard.nextInt();
			int col = keyboard.nextInt();
			char player = 'X';
			myGame.addChar(row, col, player);
			System.out.println(board[row-1][col-1]); // TODO Stub
			System.out.println(player);
			System.out.println("the puzzle now is: \n" + myGame.drawBoard());
			
			for (int i = 0; i < 2; i++){
				while(!boolean myGame.checkWin){
					myGame.checkWin(i);
					didIWin = myGame.checkWin();
					System.out.println(didIWin);
			};
			System.out.println(didIWin);
			
			//win = true; // TODO Stub
			
		/*	while(!win){
				System.out.println("O's turn");
				System.out.println("Where do you want O placed?");
				System.out.println("Please enter row number and column number seperated by a space");

				myGame.checkWin();
				win = true; // TODO Stub
			}*/
		}
	}

}
