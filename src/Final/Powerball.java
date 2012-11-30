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
	private int newNumber;
	private int sequenceNumber = 1;
	private int currentNumber = 0; 
	
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

	public int getNewNumber() {
		return newNumber;
	}
	
	public int getSequenceNumber(){
		return sequenceNumber;
	}

	public void setNewNumber(int newNumber) {
		this.newNumber = newNumber;
	}
	
	public void setPickedNumbers(int[] pickedNumbers) {
		this.pickedNumbers = pickedNumbers;
	}
	
	public void checkNumberOriginality(){
		// setup loop to check array for number originality
		do {
			//System.out.println(newNumber + " " + pickedNumbers[currentNumber]);
			for (int i = 0; i < sequenceNumber; i++){
					while (newNumber == pickedNumbers[i]){
						System.out.println("Number " + sequenceNumber + " must be different from the other numbers.");
						this.repickNumber();
					} 
					pickedNumbers[currentNumber] = newNumber;
					currentNumber++;
					
			}
		} while (currentNumber < sequenceNumber);
		sequenceNumber++;
	}
	
	// verify that the number chosen falls between the specified parameters. DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public void checkNumberQuality(){
		do {
			if (newNumber < 0){
				System.out.println("Number " + sequenceNumber + " must be greater than 0");
				this.repickNumber();
			} else if (newNumber > 60) {
				System.out.println("Number " + sequenceNumber + " must be less than 60");
				this.repickNumber();
			}
		} while (newNumber < 0 || newNumber > 60);
	}
	// have user repick the number if it fails one of the check tests. DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	private void repickNumber(){
		// setup scanner for input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a number that is greater than 0 and less than 60:");
		newNumber = keyboard.nextInt();
		
	}
}
