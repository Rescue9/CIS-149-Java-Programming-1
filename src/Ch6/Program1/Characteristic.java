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
	
	private String description;
	private int rating;
	private int input;
	
	public Characteristic(){
		setDescription("No Description");
		setaRating(0);
	}
	
	public Characteristic(String interest){
		setDescription(interest);
		rating = 0;
	}
	
	public Characteristic(String interest, int input){
		setDescription(interest);
		setaRating(input);
	}
	
	private void setDescription(String interest) {
		description = interest;
	}

	public int setRating(){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an integer from 1 to 10");
		input = keyboard.nextInt();
		// System.out.println(input); // used for testing
		return input;
	}
	
	public int setaRating(int input){
		rating = input;
		return rating;
	}
	
	public boolean isValid(int rating){
		
		if (rating >= 1 && rating <= 10){
			setaRating(rating);
			return true;
		} else {
		return false;}
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getRating(){
		return rating;
	}
}