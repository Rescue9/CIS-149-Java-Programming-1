package Ch2.Program1;

/*
 * Program: CalculateWellWater.java
 * Class: CIS 149
 * Date: August 27, 2012
 * Programmer Andrew Buskov
 * Purpose: To calculate the amount of usable water in a well with given dimensions.
 * 
 * Added method to round numbers to a more usable format.
 */
 
import java.text.DecimalFormat;
import java.util.*;

public class CalculateWellWater {
 
 public static final double PI = 3.14159;
 public static final double CU_FT_H2O = 7.48;

	public static void main(String[] args) {
		
		// let's declare our variables first
		double radius;
		double height;
		double heightInFeet;
		double totalCubicFt;
		double totalGalonage;
		
		Scanner keyboard;
		
		// get our variables from the user
		System.out.println("Please enter the radius of the well for which you are calculating water volume: ");
		keyboard = new Scanner(System.in);
		radius = keyboard.nextDouble();
		
		System.out.println("Please enter the height of the well: ");
		height = keyboard.nextDouble();
		heightInFeet = height / 144;
		
		// perform our calculations and respond to the user
		totalCubicFt = PI * (radius * radius) * heightInFeet;
		System.out.println("The total Cu. Ft. of the well is: " + roundMyAnswer(totalCubicFt));
		
		totalGalonage = totalCubicFt * CU_FT_H2O;
		System.out.println("The total number of gallons in the well is: " + roundMyAnswer(totalGalonage));
		
	}
	
	// lets round this stuff..... it's nasty as a double!
	
	public static Double roundMyAnswer(double num) {
		DecimalFormat twoPlaces = new DecimalFormat("#.##");
		return Double.valueOf(twoPlaces.format(num));
	}

}
