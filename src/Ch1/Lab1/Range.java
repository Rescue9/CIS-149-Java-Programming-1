package Ch1.Lab1;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		System.out.println("Greetings.");
		int min, max;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a minimum and maximum value, leaving a space getweent the two numbers");
		
		min = keyboard.nextInt();
		max = keyboard.nextInt();
		
		System.out.println("The number of values in the range from " + min + " to " + max + " is ");
		System.out.println(max-min+1);

	}

}
