/*
 * Program: Characteristic.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 31, 2012
 * Purpose: To determine how compatable two people are.
*/

package Ch6.Program1;

import java.util.Scanner;

public class Characteristic {
	
	private int input = -1;
	private String likesSports = "likes sports";
	private int sportsRating = 0;
	private String likesBeaches = "likes beaches";
	private int beachesRating = 0;
	
	public int isValid(int rating){
		
		if (rating < 1 | rating > 10){
			
			System.out.println("Your input is not valid.");
			makeValidInput();
		} 
		return input;
		
	}
	
	public String getDescription(int question){
		
		switch (question){
		
		case 1: return likesSports;
		case 2: return likesBeaches;	
		default: return null;
		}
	}
	
	public int getRating(int question){
		
		switch (question){
		
		case 1: return sportsRating;
		case 2: return beachesRating;
		default: return 0;
		}
	}
	
	private void getCompatability(){
		
		
	}		
	
	public void setRating(int question, int rating){
		
		switch (question){
		
		case 1: sportsRating = rating;
				break;
		case 2: beachesRating = rating;
				break;			
		}
	}
	
	public int setInput(){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an integer from 1 to 10");
		input = keyboard.nextInt();
		return input;
	}
	
	private void makeValidInput(){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an integer from 1 to 10");
		input = keyboard.nextInt();
		isValid(input);
	}
}