/*
 * Program: Powerball.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Nov 29, 2012
 * Purpose: FINAL PROJECT: To create a lotto number picker that chooses non-repeating numbers & a single powerball number between a specific range.
*/

package Final;

import java.util.Scanner;

public class Powerball {
	
	private int[] pickedNumbers = new int[5];
	private int sequenceNumber = 0;
	
	public void writeOutput(){
		
	}
	
	public void readInput(){
		
	}

	public int[] getPickedNumbers(){
		return pickedNumbers;
	}
	public int getPickedNumbers(int i) {
		return pickedNumbers[i];
	}

	public int getSequenceNumber(){
		return sequenceNumber;
	}

	public void setPickedNumbers(int[] pickedNumbers) {
		this.pickedNumbers = pickedNumbers;
	}
	
	public void isNumberInArray(int holding){
		// setup loop to check array for number originality
		for (int i = 0; i < sequenceNumber; i++){
			if (pickedNumbers[i] != holding){
				repickNumber();
			} else {
				System.out.println("Got HERE");
				pickedNumbers[i] = holding;
				sequenceNumber++;
			}
		}
	}
	
	// verify that the number chosen falls between the specified parameters. DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public void checkNumberQuality(int holding){
		do {
			if (holding < 0){
				System.out.println("Number " + sequenceNumber + " must be greater than 0");
				holding = this.repickNumber();
				
			} else if (holding > 60) {
				System.out.println("Number " + sequenceNumber + " must be less than 60");
				holding = this.repickNumber();
			}
		} while (holding < 0 || holding > 60);
	}

	// have user repick the number if it fails one of the check tests. DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	private int repickNumber(){
		// setup scanner for input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("ERROR: Please enter a number that is greater than 0 and less than 60:");
		int newHolding = keyboard.nextInt();
		return newHolding;
	}
	
	public void numberVerification(int holding){
		checkNumberQuality(holding);
		isNumberInArray(holding);
	}
}
