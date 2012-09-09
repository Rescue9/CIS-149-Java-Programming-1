package Ch3.Lab3;

/*
 * Program: CheckDate.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: September 8, 2012
 * Purpose: To determwine the valid date.
 */

import java.util.Scanner;
 
public class TemperatureConversion {
 
 public static void main(String[] args){
	 
	 double degrees, convertedDegrees;
	 char units;
	 
	 Scanner keyboard = new Scanner(System.in);
	 
	 System.out.println();
	 System.out.println();
	 System.out.println("Enter a temperature in degrees (for example 29.6): ");
	 degrees = keyboard.nextDouble();
	 
	 System.out.println();
	 System.out.println("Enter 'F' (or 'f') for Fahrenheit or " + "'C' (or 'c')  for Celsius: ");
	 units = keyboard.next().charAt(0);
	 System.out.println();
	 
	 switch(units)
	 {
		 case 'F': case 'f':
			convertedDegrees = 5 * (degrees -32/9);
			System.out.println(degrees + " degrees F = " + convertedDegrees + " degrees Celsius.");
			break;
			
		case 'C': case 'c':
			convertedDegrees = degrees * 9/5 + 32;
			System.out.println(degrees + " degrees C = " + convertedDegrees + " degrees Fahrenheit.");
			break;
		
		default:
			System.out.println("Unknown units -");
			System.out.println(" cannot do calculation -");
			System.out.println(" next time enter either " + "'F' for Fahrenheit or 'C' for Celsius.");
			
	 } //end switch
	
 }

}
