/*
 * Program: PercentOfSum.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Nov 5, 2012
 * Purpose: To display a sum of numbers and the percentage the individual number makes of the sum
*/

package Ch7.Lab4;

import java.util.Scanner;

public class PercentOfSum {
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		int thisMany, index, sum, percent; // percent is not used, but is in the lab docs so I will leave it.
		int[] theList;
		
		System.out.println("How many number wil you enter?");
		thisMany = keyboard.nextInt();
		
		theList = new int[thisMany];
		
		System.out.println("\nEnter " + thisMany + " numbers,");
		System.out.println("one per line");
		
		for (index = 0; index < thisMany; index++){
			System.out.println("Enter number " + (index + 1) + ": ");
			theList[index] = keyboard.nextInt();
		}
		
		System.out.println();
		System.out.println("You have filled the array with ");
		System.out.println(thisMany + " numbers.");
		System.out.println();
		
		sum = addUpValues(theList, thisMany);
		
		System.out.println();
		System.out.println("The sum of the numbers = " + sum);
		System.out.println();
		
		System.out.println("Here are the numbers and their ");
		System.out.println("percent contribution to the sum.");
		System.out.println();
		
		for (index = 0; index < thisMany; index++){
			System.out.println(theList[index] + " is " + (int) (((double)theList[index]/sum)*100 + 0.5) + " % of the sum.");
			System.out.println();
		}
	}
	
	public static int addUpValues(int[] listOfValues, int listLength){
		int total = 0;
		for (int i=0; i < listLength; i++){
			total = total + listOfValues[i];
		}
		return (total);
	}
}
