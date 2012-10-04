/*
 * Program: HeadsOrTails.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 4, 2012
 * Purpose: To determine the percentage of heads versus tails in an eight throw coin toss
*/

package Ch4.Program2;

import java.util.*;

public class HeadsOrTails {

	public static void main(String[] args){
		
		// declare & initialize some variables
		int numHeads = 0;
		int numTails = 0;
		double percentageHeads;
		double percentageTails;
		
		// get user input & start
		System.out.println("For each coin toss, enter either 'h' for heads or 't' for tails.");
		
		for (int i=1; i<=8 ; i++){
			// toss loop
			System.out.println("Toss " + i);
			Scanner tossEntry = new Scanner(System.in);
			String readToss = tossEntry.next();
			if (readToss.equalsIgnoreCase("h")){
				numHeads += 1;
			} else if(readToss.equalsIgnoreCase("t")){
				numTails += 1;
			} else {
				System.out.println("It appears that you did not answer with 't' or 'h' as indicated. Please repeat the toss and follow directions."); i--;
			}
		}
		
		// calculate the percentage of heads vs tails for the throws
		percentageHeads = (double)numHeads/8;
		percentageTails = (double)numTails/8;
		
		// print the results
		System.out.println("Percent heads: " + percentageHeads * 100);
		System.out.println("Percent tails: " + percentageTails * 100);
	}
}
