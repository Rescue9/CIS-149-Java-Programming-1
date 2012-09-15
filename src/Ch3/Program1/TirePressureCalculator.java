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
		
		String type;
		int frontRight;
		int frontLeft;
		int rearRight;
		int rearLeft;
		
		// find out what type of vehcile our user is driving
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please describe vehicle type / use: \n1) Normal \n2) Hauling \n3) Rugged");
		 type = input.next();
		 
		 while ((type.equalsIgnoreCase("Normal")) || (type.equalsIgnoreCase("Hauling")) || (type.equalsIgnoreCase("Rugged"))){
			 
			// get user's current tire pressure
			System.out.println("Please enter the current tire pressure as it's requested:");
			System.out.println("Front Right: "); frontRight = input.nextInt();
			System.out.println("Front Left: "); frontLeft = input.nextInt();
			System.out.println("Rear Right: "); rearRight = input.nextInt();
			System.out.println("Rear left: "); rearLeft = input.nextInt();
			
			if(type.equalsIgnoreCase("Normal")){
				normalType(frontRight, frontLeft, rearRight, rearLeft);
			} else if (type.equalsIgnoreCase("Hauling")){
				haulingType(frontRight, frontLeft, rearRight, rearLeft);
			} else {
				ruggedType(frontRight, frontLeft, rearRight, rearLeft);
			}	
			 
		}
		
		System.out.println("Please enter a valid response: Normal, Hauling, Rugged");
		System.out.println("Please describe vehicle type / use: \n1) Normal \n2) Hauling \n3) Rugged");
		type = input.next();
		
		}
	
	public static void normalType(int frontRight, int frontLeft, int rearRight, int rearLeft){
		
		int deltaAmount = 0;
		// set increase statements
		if (frontRight < 33){deltaAmount = 33 - frontRight; System.out.println("Increase air by " + deltaAmount + "psi in the Front Right tire.");} 
		if (frontLeft < 33){deltaAmount = 33 - frontLeft; System.out.println("Increase air by " + deltaAmount + "psi in the Front Right tire.");} 
		if (rearRight < 33){deltaAmount = 33 - rearRight; System.out.println("Increase air by " + deltaAmount + "psi in the Front Right tire.");} 
		if (rearLeft < 33){deltaAmount = 33 - rearLeft; System.out.println("Increase air by " + deltaAmount + "psi in the Front Right tire.");} 
		// set decrease statements
		if (frontRight > 43){deltaAmount = frontRight - 43; System.out.println("Decrease air by " + deltaAmount + "psi in the Front Right tire.");} 
		if (frontLeft > 43){deltaAmount = frontLeft - 43; System.out.println("Decrease air by " + deltaAmount + "psi in the Front Right tire.");} 
		if (rearRight > 43){deltaAmount = rearRight - 43; System.out.println("Decrease air by " + deltaAmount + "psi in the Front Right tire.");} 
		if (rearLeft > 43){deltaAmount = rearLeft - 43; System.out.println("Decrease air by " + deltaAmount + "psi in the Front Right tire.");} 
		
	}
	
	public static void haulingType(int frontRight, int frontLeft, int rearRight, int rearLeft){
		
		
		
	}
	
	public static void ruggedType(int frontRight, int frontLeft, int rearRight, int rearLeft){
		
		
		
	}



}
