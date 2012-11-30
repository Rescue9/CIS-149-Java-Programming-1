/*
 * Program: PowerballTest.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Nov 29, 2012
 * Purpose: FINAL PROJECT: To create a lotto number picker that chooses non-repeating numbers & a single powerball number between a specific range.

*/


package Final;

import java.util.Scanner;

public class PowerballTest {
	
	public static void main(String[] args){
		// setup scanner for input
		Scanner keyboard = new Scanner(System.in);
		
		//setup Powerball object
		Powerball powerballObj = new Powerball();
		
		do {
			System.out.println("Please enter a number that is greater than 0 and less than 60:");
	
			int holding = keyboard.nextInt();
		
			// pass holding number off to powerballObj
			powerballObj.setNewNumber(holding);
		
			// check number for originality
			powerballObj.checkNumberQuality();
		
			// check originality
			powerballObj.checkNumberOriginality();
			
			// list all picked numbers
			for (int i = 0; i < powerballObj.getPickedNumbers().length; i++){
				System.out.println(powerballObj.getPickedNumbers(i));
			}
		} while (powerballObj.getSequenceNumber() < powerballObj.getPickedNumbers().length + 1); // repeat loop until ready to pick powerball number
		
		System.out.println("GOT THIS FAR");
	}
	

}
