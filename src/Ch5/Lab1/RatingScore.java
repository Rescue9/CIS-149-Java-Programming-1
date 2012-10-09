/*
 * Program: RatingScore.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 8, 2012
 * Purpose: Rate a movie & restaurant
*/

package Ch5.Lab1;

import java.util.Scanner;

public class RatingScore {

	private String description;
	private int maximumRating;
	private int theRating;
	
	public void initialize(String desc, int max){
		
		description = desc;
		maximumRating = max;
		theRating = -1;
	}
	
	public void inputRating(){
		
		System.out.println("What is your rating for " + description + "?");
		System.out.println("Please enter and integer from 0 to " + maximumRating);
		
		Scanner keyboard = new Scanner(System.in);
		
		int data = -1;
		boolean needTheRating = true;
		
		while (needTheRating){
			
			data = keyboard.nextInt();
			
			if(data>=0 && data <=maximumRating){
				
				needTheRating = false;
			} else {
				
				System.out.println("Sorry, that rating is out of range.");
				System.out.println("Please enter and integer from 0 to " + maximumRating);
			}
		}
		theRating = data;
	}
	
	public int getMaxRating(){
		
		return maximumRating;
	}
	
	public int getRating(){
		
		return theRating;
	}
	
	public String getRatingString(){
		
		return "The rating is " + theRating + "/" + maximumRating;
	} 
	
	public static void main(String[] args){
		
		RatingScore movieRating = new RatingScore();
		RatingScore restaurantRating = new RatingScore();
		
		movieRating.initialize("Joe's excellent movie", 5);
		restaurantRating.initialize("Food quality", 10);
		
		movieRating.inputRating();
		
		System.out.println("Displaying the attributes for the movie rating.");
		System.out.println("The rating is " + movieRating.getRating() + " out of " + movieRating.getMaxRating());
		System.out.println();
		
		restaurantRating.inputRating();
		
		System.out.println("Displaying the rating for the restaurant.");
		System.out.println(restaurantRating.getRatingString());
		
	}
}
