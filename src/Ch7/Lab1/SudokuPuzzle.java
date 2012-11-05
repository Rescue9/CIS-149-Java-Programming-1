/*
 * Program: SudokuPuzzle.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Nov 5, 2012
 * Purpose: To create a program for the game Sudoku
*/

package Ch7.Lab1;

import java.util.Scanner;

public class SudokuPuzzle {
	
	private int board [][];
	private int start[][];
	
	public SudokuPuzzle(){
		start = new int [9][9];
		board = new int [9][9];
	}
	
	public String toString(){
		String puzzleString = "Row/Col\n    1  2  3  4  5  6  7  8  9\n";
		puzzleString = puzzleString+ "   --------------------------\n";
		
		for (int i=0; i<9; i++){
			puzzleString = puzzleString + (i+1) + " |";
			for (int j=0; j<9; j++){
				if (board [i][j] == 0)
					puzzleString = puzzleString + " " + ".|";
				else
					puzzleString = puzzleString + " " +board [i][j] + "|";
			}
			puzzleString = puzzleString + "\n";
			puzzleString = puzzleString + "  |__|__|__|__|__|__|__|__|__|\n";
			}
		
		return puzzleString;
	}
	
	public void addInitial(int row, int col, int value){
		if (row>=0 && row<=9 && col >=0 && col <=9 && value >=1 && value <=9){
			start [row][col] = value;
			board [row][col] = value;
		}
	}
	
	public void addGuess(int row, int col, int value){
		// only set the value if the start is 0
		if (row>=0 && row<=9 && col >=0 && col <=9 && value >=1 && value <=9 && start [row][col] == 0){
			board [row][col]= value;
		}
	}
	
	public int getValueIn(int row, int col){
		return board[row][col];
	}
	
	public void reset(){
		for (int i=0;i<9;i++)
			for( int j=0;j<9;j++)
				board[i][j] = start[i][j];
	}
	
	public boolean isFull(){
		boolean allFilled = true;
		for (int i=0;i<9;i++)
			for( int j=0;j<9;j++)
				allFilled = allFilled && board[i][j]>0;
		return allFilled;
	}
	
	public boolean[] getAllowedValues(int row, int col){
		// save the value at the location, thren try all 9 values
		int savedValue = board[row][col];
		boolean result[] = new boolean[9];
		for (int value = 1; value <=9; value++){
			board [row][col] = value;
			result[value-1] = checkPuzzle();
		}
		board [row][col] = savedValue;
		return result;
	}
	
	public boolean checkPuzzle(){
		boolean looksGood = true;
		for (int i=0;i<9;i++){
			looksGood = looksGood && checkRow(i);
			looksGood = looksGood && checkCol(i);
			looksGood = looksGood && checkSub(i);
		}
		return looksGood;
	}
	
	public boolean checkRow(int row){
		int count[]= new int[10];
		for (int col=0;col<9;col++){
			count[board[row][col]]++;
		}
		boolean countIsOk = true;
		
		for(int i=1; i<=9; i++)
			countIsOk = countIsOk && (count[i]<=1);
		return countIsOk;
		
	}
	
	public boolean checkCol(int col){
		int count[] = new int[10];
		for(int row=0; row<9; row++){
			count[board[row][col]]++;
		}
		boolean countIsOk = true;
		for(int i=1; i<=9; i++)
			countIsOk = countIsOk && (count[i]<=1);
		return countIsOk;
	}
	
	public boolean checkSub(int sub){
		int count[] = new int[10];
		int rowBase = (sub/3) *3;

		// The above will give 0, 3, or 6 because of integer division
		int colBase = (sub%3) *3;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				count[board[rowBase+i][colBase+j]]++;
			}
		}

		boolean countIsOk = true;
		for(int i=1; i<=9; i++)
			countIsOk = countIsOk && (count[i]<=1);
		return countIsOk;
	}
	
	public static void initializePuzzle(SudokuPuzzle p){
	p.addInitial(0,0,1);
	p.addInitial(0,1,2);
	p.addInitial(0,2,3);
	p.addInitial(0,3,4);
	p.addInitial(0,4,9);
	p.addInitial(0,5,7);
	p.addInitial(0,6,8);
	p.addInitial(0,7,6);
	p.addInitial(0,8,5);
	p.addInitial(1,0,4);
	p.addInitial(1,1,5);
	p.addInitial(1,2,9);
	p.addInitial(2,0,6);
	p.addInitial(2,1,7);
	p.addInitial(2,2,8);
	p.addInitial(3,0,3);
	p.addInitial(3,4,1);
	p.addInitial(4,0,2);
	p.addInitial(5,0,9);
	p.addInitial(5,5,5);
	p.addInitial(6,0,8);
	p.addInitial(7,0,7);
	p.addInitial(8,0,5);
	p.addInitial(8,3,9);
	}
	
	@SuppressWarnings("static-access") // eclipse complains
	public static void main(String[] args){
	
		Scanner reader = new Scanner(System.in);
		System.out.println("Sudoku Game: ");
		SudokuPuzzle puzzle = new SudokuPuzzle();
		puzzle.initializePuzzle(puzzle);
		System.out.print("The puzzle is: \n" + puzzle);
		boolean done = false;
		while(!done){
			System.out.println("What would you like to do? \n" + "Clear puzzle(C) Set a square (S) Get possible values (G) Quit (Q)");
			String response = reader.next();
			response = response.toLowerCase();
			if(response.equals("q")){
				System.out.println("Thanks for playing.");
				done = true;
			}
			else if(response.equals("s")){
				System.out.println("Which row (1-9) and column (1-9) do you want to change?");
				int row = reader.nextInt()-1;
				int col = reader.nextInt()-1;
				System.out.println("What should the value (1-9) be?");
				int value = reader.nextInt();
				puzzle.addGuess(row, col, value);
				}
			else if(response.equals("g")){
				System.out.println("Which row (1-9) and column (1-9) do you	want to get values for?");
				int row = reader.nextInt()-1;
				int col = reader.nextInt()-1;
			
				boolean valid[] = puzzle.getAllowedValues(row, col);
				System.out.print("Allowed values are: ");
				for(int i=0; i<9; i++){
					if(valid[i])
						System.out.print((i+1)+ " ");
					}
					System.out.println();
					} 
			else if(response.equals("c")){
						puzzle.reset();
					}
			System.out.print("The puzzle is now: \n" + puzzle);
			if(!puzzle.checkPuzzle())
					System.out.println("You have made an error in the puzzle.");
				else if(puzzle.isFull())
					System.out.println("Congratulations, you have completed the puzzle.");
		}
	}

}
