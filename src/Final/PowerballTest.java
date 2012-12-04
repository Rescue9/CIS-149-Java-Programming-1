/*
 * Program: PowerballTest.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Nov 29, 2012
 * Purpose: FINAL PROJECT: To create a lotto number picker that chooses non-repeating numbers & a single powerball number between a specific range.

*/


package Final;

public class PowerballTest {
	
	public static void main(String[] args){
		// setup local variable
		int holding;
		
		//setup Powerball object
		Powerball powerballObj = new Powerball();
		
		// this do statement will execure until the array is full.
		do {
			System.out.println("Please enter a number that is greater than 0 and less than 60:");
	
			holding = powerballObj.readInput();

			// pass holding number off to powerballObj
			// verify number
			// tricky if then statements... pay attention to detail.
			boolean goodNumber;
			do {
				goodNumber = true;
				goodNumber = powerballObj.checkNumberQuality(holding);
				if (goodNumber == true){
					goodNumber = powerballObj.isNumberOriginal(holding);
					if (goodNumber == false){
						holding = powerballObj.repickNumber();
					}
				} else {
					holding = powerballObj.repickNumber();
				}
			}while (goodNumber == false);
			
			// assign number to array
			powerballObj.assignNumber(holding);
			
		} while (powerballObj.getSequenceNumber() < powerballObj.getPickedNumbers().length); // repeat loop until ready to pick powerball number
		
		System.out.println();
		System.out.println("Please enter a number that is greater than 0 and less than 40 for your PowerBall number: ");
		
		holding = powerballObj.readInput();
		
		// check the quality of the powerball number
		// because of the way we checked the number, we can't need to use another variable
		// to set the final PB number
		int pbNum = powerballObj.checkPowerballNumberQuality(holding);
		powerballObj.setPowerBallNum(pbNum);
		System.out.println();
		
		// write all final output to the screen.
		powerballObj.writeOutput();

	}
}
