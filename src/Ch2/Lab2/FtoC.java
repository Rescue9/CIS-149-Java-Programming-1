package Ch2.Lab2;
/*
 * Program: FtoC.class
 * Class: CIS 149
 * Date: August 27, 2012
 * Programmer: Andrew Buskov
 * Purpose: To take a Fahrenheit temperature value and convert it to a Celsius value.
 */

import java.util.*;

public class FtoC {

	public static void main(String[] args) {

		int degreesF;
		double degreesC;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a remperature (integer number, no fractional part)" + "in degrees Fahrenheit.");
		degreesF = keyboard.nextInt();
		
		degreesC = 5 * (double)(degreesF -32)/9;
		
		System.out.println(degreesF + " degrees Fahrenheit " + "=" +degreesC + "degrees Celsius.");
		
	}

}
