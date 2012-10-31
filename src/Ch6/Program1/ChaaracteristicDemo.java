/*
 * Program: Characteristic Demo
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 31, 2012
 * Purpose: To demonstrate the characteristic class.
*/
package Ch6.Program1;


import java.util.Scanner;

public class ChaaracteristicDemo {
	
	static Characteristic myTraits = new Characteristic();
	Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args){
		
		for (int i = 1; i <= 2; i++){
			
			System.out.println("What is your rating for " + myTraits.getDescription(i));
			int myInput = myTraits.setInput();
			while (!myTraits.isValid(myInput)){
				myInput = myTraits.setInput();
			}
			myTraits.setRating(i, myInput);
			System.out.println();
			System.out.println("Displaying the rating we got: " + myTraits.getDescription(i) + " is rated as " + myTraits.getRating(i));
		}
	}
}
