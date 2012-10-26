/**
File name: DoubleOutDriver.java
Until the user says not to repeat:
Read in a floating point number (type double).
Call all three writeln methods to display the number
(using 5 for the number of digits to the right of the
decimal point when you need to specify such a number).
*/

package Ch6.Lab1;

import java.util.*;

public class DoubleOutDriver {
	
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		double value;
		char ans;
		
		System.out.println("Testing all 3 DoubleOut writeln methods");
		
		do {
			System.out.println("Enter a value of type double:");
			value = keyboard.nextDouble();
			System.out.println();
			
			// Use writeln method to output in dollars format
			// vollowed by a new line.
			
			DoubleOut.writeln(value);
			System.out.println();
			
			// Use the writeln method to output with a specified
			// number of decimal places(5 for this test)
			// folowed by a new line.
			
			DoubleOut.writeln(value, 5);
			System.out.println();
			
			// Use the scienceWriteln method to output in scientific
			// notation followed by a new line.
			
			DoubleOut.scienceWriteln(value, 5);
			System.out.println();
			
			System.out.println("Test again? (y/n)");
			ans = keyboard.next().charAt(0);
			System.out.println();
		} while ((ans == 'y' || ans == 'Y'));
		
		System.out.println("End of test.");
		
		}
}