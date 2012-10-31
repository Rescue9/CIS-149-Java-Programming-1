/*
 * Program: Characteristic Demo
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 31, 2012
 * Purpose: To demonstrate the characteristic class.
*/
package Ch6.Program1;

public class ChaaracteristicDemo {
	
	public static void main(String[] args){
		// SPORTS
		System.out.println("What is your rating for likes sports?");
		Characteristic sports = new Characteristic();
		int sportInput = sports.setRating();
		
		while (!sports.isValid(sportInput)){
			sportInput = sports.setRating();
		}
		System.out.println("Displaying the rating we got: likes sports is rated as " + sports.getRating());
		
		
		// BEACHES
		System.out.println("What is your rating for likes beaches?");
		Characteristic beaches = new Characteristic();
		int beachInput = beaches.setRating();
		
		while (!beaches.isValid(beachInput)){
			beachInput = beaches.setRating();
		}
		System.out.println("Displaying the rating we got: likes beaches is rated as " + beaches.getRating());

		
	}
}
