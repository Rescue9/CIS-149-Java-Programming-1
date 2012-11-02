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
	
	public Characteristic(String interest){
		setDescription(interest);
		rating = 0;
	}
	
	public boolean isValid(int input){
		if (input >= 1 && input <= 10){
			setRating(input);
			return true;
		} else {
		return false;}
	}
	
	public int setRating(int input){
		rating = input;
		return rating;
	}

	public void setDescription(String interest) {
		description = interest;
	}

	public int setRating(){
		System.out.println("What is your rating for likes " + description + "?");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an integer from 1 to 10");
		int input = keyboard.nextInt();
		// System.out.println(input); // used for testing
		if (!isValid(input)){
			setRating();
		} 
		return input;
	}
	
	public void toAString(){
		System.out.println("Displaying the rating we got: likes " + description + " is rated as " + rating);
	}
	
	public double getCompatability(Characteristic otherRating){
		if (!isMatch(otherRating)){
			// System.out.println("I made it this far at least!"); // used for testing.
			return 0.0; 
		} else {
			// System.out.println(getCompatabilityMeasure(otherRating));  // used for testing
		return getCompatabilityMeasure(otherRating);
		}
	}

	public boolean isMatch(Characteristic otherRating){
		// System.out.println(description.equals(otherRating.getDescription())); // used for testing
		return description.equals(otherRating.getDescription());
		
	}
	
	public double getCompatabilityMeasure(Characteristic otherRating){
		int r1 = rating;
		int r2 = otherRating.getRating();
		
		if(r1 == 0 || r2 == 0){
			return 0.0;
		}else {
			return (1.0 - (r1 - r2)*(r1 - r2)/81.0);
		}
	}
		
	public String getDescription() {
		return description;
	}
	
	public int getRating(){
		return rating;
	}
}