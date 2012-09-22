package Ch4.Lab1;
/*
 * Program: Bounce.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Sep 22, 2012
 * Purpose: To determine the height of a bouncing ball, stopping at the 5th bounce.
*/

import java.util.Scanner;

public class Bounce {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// declare and initialize variables (except velocity)
		double height = 0.0, velocity;
		int time = 0, bounce = 0;
		
		// ask user for information
		System.out.println("Enter the initial velocity of the ball");
		velocity = keyboard.nextDouble();
		
		// begin our do / while loop to count bounces
		do {
			System.out.println("Time: " + time + "Height: " + height);
			height = height + velocity;
			velocity = velocity - 32;
			time = time + 1;
			
			if (height < 0){
				height = -0.5 * height;
				velocity = -0.5 * velocity;
				bounce = bounce + 1;
				System.out.println("Bounce!");
			}
		}
		
		while (bounce < 5);
	}

}
