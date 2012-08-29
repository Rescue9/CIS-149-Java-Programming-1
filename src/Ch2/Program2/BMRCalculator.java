package Ch2.Program2;

/** Project: BMR Calculator
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: August 29, 2012
 * Purpose: To display the number of candy bars a person should eat to maintain current weight
 */

import java.util.*;

public class BMRCalculator {
	
	public static void main (String[] args){
		
		/* BMR Formula
		 * Women: BMR = 655 + (4.3 * weight in pounds) + (4.7 * height in inches) - (4.7 * age in years)
		 * Men:   BMR = 66 + (6.3 * weight in pounds) + (12.9 * height in inches) - (6.8 * age in years)
		 */
		
		//declare variables
		int weight;
		int height;
		int age;
		double totalBMR_men;
		double totalBMR_women;
		int candyBarCalories = 230;
		
		// display purpose
		System.out.println("This program will calculate the number of 230 calorie \ncandy bars to eat to maintain your weight");
		
		// get user information
		System.out.println("What is your age in years?");
		Scanner keyboard = new Scanner(System.in);
		age = keyboard.nextInt();
		
		System.out.println("What is your total height in inches?");
		height = keyboard.nextInt();
		
		System.out.println("What is your weight in pounds?");
		weight = keyboard.nextInt();
		
		// perform our calculation
		totalBMR_women =  	655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		totalBMR_men = 		65 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		
		
		// display results
		System.out.println("A female with those measurements should eat " + (totalBMR_women / candyBarCalories) + " candy bars per day to maintain her weight.");
		System.out.println("A male with those measurements should eat " + (totalBMR_men / candyBarCalories) + " candy bars per day to maintain his weight.");
		
		
		
		
	}
}
