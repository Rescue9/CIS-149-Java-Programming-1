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
	
	
	// setup some private variables
	private int[] pickedNumbers = new int[5];
	private int	powerBallNum;
	private int sequenceNumber = 0;
	
	// list all picked numbers
	public void writeOutput(){
		System.out.println();
		System.out.print("Your PowerBall numbers are");
		for (int i = 0; i < this.getPickedNumbers().length; i++){
			System.out.print(" " +this.getPickedNumbers(i));
		}
		System.out.print(" and your PowerBall number is " + powerBallNum +". GOOD LUCK!");

	}
	// get input from the user
	public int readInput(){
		// setup scanner for input
		Scanner keyboard = new Scanner(System.in);
		int inputNum = keyboard.nextInt();
		return inputNum;
	}

	// various getters & setters below
	public int[] getPickedNumbers(){
		return pickedNumbers;
	}
	public int getPickedNumbers(int i) {
		return pickedNumbers[i];
	}

	public int getPowerBallNum() {
		return powerBallNum;
	}

	public void setPowerBallNum(int powerBallNum) {
		this.powerBallNum = powerBallNum;
	}

	public int getSequenceNumber(){
		return sequenceNumber;
	}
	
	public void incSequenceNumber(){
		sequenceNumber++;
	}

	public void setPickedNumbers(int[] pickedNumbers) {
		this.pickedNumbers = pickedNumbers;
	}
	
	// check functions below
	public boolean isNumberOriginal(int holding){
		// setup loop to check array for number originality
		// just check, dont fix! (Had a problem trying to do everything in one method.)
		boolean isOriginal = true;

		for (int i = 0; i <= sequenceNumber; i++){
			if (pickedNumbers[i] == holding){
				System.out.println(pickedNumbers[i] + " was your number " + (i+1) + " pick.");
				System.out.println("You must pick a different number than 1-" + sequenceNumber + ".");
				isOriginal = false;
			}
		}
		return isOriginal;
	}
	
	// verify that the number chosen falls between the specified parameters. 
	public boolean checkNumberQuality(int holding){
		boolean qualityGood = true;
			if (holding < 0){
				System.out.println("Your number " + (sequenceNumber+1) + " must be greater than 0");
				qualityGood = false;
			} 
			if (holding > 60) {
				System.out.println("Your number " + (sequenceNumber+1) + " must be less than 60");
				qualityGood = false;
			}
		return qualityGood;
	}

	// verify that the number chosen falls between the specified parameters. 
	// using this specifically for the powerball number
	public int checkPowerballNumberQuality(int holding){
		do {
			if (holding < 0){
				System.out.println("Your PowerBall number " + (sequenceNumber+1) + " must be greater than 0");
				holding = this.repickNumber();
				
			} else if (holding > 40) {
				System.out.println("Your PowerBall number " + (sequenceNumber+1) + " must be less than 40");
				holding = this.repickNumber();
			}
		} while (holding < 0 || holding > 40);
		int newHolding = holding;
		return newHolding;
	}

	// have user repick the number if it fails one of the check tests. 
	public int repickNumber(){
		// setup scanner for input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("ERROR: Please enter a number that is greater than 0 and less than 60:");
		int newHolding = keyboard.nextInt();
		return newHolding;
	}
	
	// finally assign the number to the array & increase the sequence number.
	public void assignNumber(int holding){
		pickedNumbers[sequenceNumber] = holding;
		sequenceNumber++;
	}

}
