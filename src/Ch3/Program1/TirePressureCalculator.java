package Ch3.Program1;

/*
 * Program: TirePressureCalculator.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: September 12, 2012
 * Purpose: To indicate proper tire pressures based upon vehicle use
 */

import java.util.*;

public class TirePressureCalculator {
	
	public static void main(String[] args){
		
		int type;
		int frontRight;
		int frontLeft;
		int rearRight;
		int rearLeft;
		
		// find out what type of vehicle our user is driving
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please describe vehicle type / use by inputting its corresponding number: \n1) Normal \n2) Hauling \n3) Rugged");
		 type = input.nextInt();
	 
		 
		// get user's current tire pressure
		System.out.println("Please enter the current tire pressure as it's requested:");
		System.out.println("Front Right: "); frontRight = input.nextInt();
		System.out.println("Front Left: "); frontLeft = input.nextInt();
		System.out.println("Rear Right: "); rearRight = input.nextInt();
		System.out.println("Rear left: "); rearLeft = input.nextInt();
		
	
		switch (type){
		
		case 1: frontTires(frontRight, frontLeft); normalType(rearRight, rearLeft); break;
		case 2: frontTires(frontRight, frontLeft); haulingType(rearRight, rearLeft); break;
		case 3: frontTires(frontRight, frontLeft); ruggedType(rearRight, rearLeft); break;
		default: System.out.println("It appears you didn't indicate 1, 2, or 3. As such, I will calculate based upon a Normal vehicle"); frontTires(frontRight, frontLeft); normalType(rearRight, rearLeft); break;
		}
	}
		
	public static void frontTires(int frontRight, int frontLeft){
		
		int deltaAmount = 0;
		// set increase statements
		if (frontRight < 33){deltaAmount = 33 - frontRight; System.out.println("Increase air by " + deltaAmount + "psi in the Front Right tire.");} 
		if (frontLeft < 33){deltaAmount = 33 - frontLeft; System.out.println("Increase air by " + deltaAmount + "psi in the Front Left tire.");} 
		
		// set decrease statements
		if (frontRight > 43){deltaAmount = frontRight - 43; System.out.println("Decrease air by " + deltaAmount + "psi in the Front Right tire.");} 
		if (frontLeft > 43){deltaAmount = frontLeft - 43; System.out.println("Decrease air by " + deltaAmount + "psi in the Front Left tire.");} 
				
	}
	
	public static void normalType(int rearRight, int rearLeft){
		
		int deltaAmount = 0;
		// set increase statements
		if (rearRight < 33){deltaAmount = 33 - rearRight; System.out.println("Increase air by " + deltaAmount + "psi in the Rear Right tire.");} 
		if (rearLeft < 33){deltaAmount = 33 - rearLeft; System.out.println("Increase air by " + deltaAmount + "psi in the Rear Left tire.");} 
		// set decrease statements
		if (rearRight > 43){deltaAmount = rearRight - 43; System.out.println("Decrease air by " + deltaAmount + "psi in the Rear Right tire.");} 
		if (rearLeft > 43){deltaAmount = rearLeft - 43; System.out.println("Decrease air by " + deltaAmount + "psi in the Rear Left tire.");} 
		
	}
	
	public static void haulingType(int rearRight, int rearLeft){
		
		int deltaAmount = 0;
		// set increase statements
		if (rearRight < 36){deltaAmount = 36 - rearRight; System.out.println("Increase air by " + deltaAmount + "psi in the Rear Right tire.");} 
		if (rearLeft < 36){deltaAmount = 36 - rearLeft; System.out.println("Increase air by " + deltaAmount + "psi in the Rear Left tire.");} 
		// set decrease statements
		if (rearRight > 47){deltaAmount = rearRight - 47; System.out.println("Decrease air by " + deltaAmount + "psi in the Rear Right tire.");} 
		if (rearLeft > 47){deltaAmount = rearLeft - 47; System.out.println("Decrease air by " + deltaAmount + "psi in the Rear Left tire.");} 
		
	}
	
	public static void ruggedType(int rearRight, int rearLeft){
		
		int deltaAmount = 0;
		// set increase statements
		if (rearRight < 38){deltaAmount = 38 - rearRight; System.out.println("Increase air by " + deltaAmount + "psi in the Rear Right tire.");} 
		if (rearLeft < 38){deltaAmount = 38 - rearLeft; System.out.println("Increase air by " + deltaAmount + "psi in the Rear Left tire.");} 
		// set decrease statements
		if (rearRight > 50){deltaAmount = rearRight - 50; System.out.println("Decrease air by " + deltaAmount + "psi in the Rear Right tire.");} 
		if (rearLeft > 50){deltaAmount = rearLeft - 50; System.out.println("Decrease air by " + deltaAmount + "psi in the Rear Left tire.");} 
		
	}



}
