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
	private char[][] board;
	
	// initialize board multidimensional array to 3 rows & columns
	public TicTacToe(){
		board = new char[3][3];
	}
	
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

	private void checkWin(){
		
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
			
			
			
			myGame.checkWin();
			
			while(!win){
				System.out.println("O's turn");
				System.out.println("Where do you want O placed?");
				System.out.println("Please enter row number and column number seperated by a space");

				myGame.checkWin();
				win = true; // TODO Stub
			}
		}
	}

}
