package Ch4.Lab3;

/*
 * Program: TriangleOfAsterisks.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Sep 22, 2012
 * Purpose: To display a triangle of asterisks in the console
*/

import java.util.Scanner;

public class TriangleOfAsterisks {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		// declare variables
		int number, lineCount, asteriskCount;
		
		System.out.println("Enter an integer from 1 to 50: ");
		number = keyboard.nextInt();
		System.out.println();
		
		if (number < 1)
			System.out.println("Invalid number: must be at least one.");
		
		else if (number > 50)
			System.out.println("Invalid number: cannot exceed 50.");
		
		else {
		for (lineCount = 1; lineCount <= number; lineCount++) {
			
			for (asteriskCount = 1; asteriskCount <= lineCount; asteriskCount++){
				
				System.out.print("*");
				
			}
			System.out.println();
		}// end first half
		
		for (lineCount = number - 1; lineCount > 0; lineCount--){
			
			for (asteriskCount = 1; asteriskCount <= lineCount; asteriskCount++){
				
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}

}
