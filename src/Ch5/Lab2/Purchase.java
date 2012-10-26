/*
 * Program: Purchase.Java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 8, 2012
 * Purpose: A helper class for the total program GroceryBill.java
*/

package Ch5.Lab2;

import java.util.Scanner;

public class Purchase {
	
	private String name;
	private int groupCount;
	private double groupPrice;
	private int numberBought; //Total number being purchased.
	
	Scanner keyboard = new Scanner(System.in);
	
	public void setName(String newName){
		
		name = newName;
	}
	
	public void setPrice(int count, double costForCount){
		
		if ((count <=0) || (costForCount <=0)){
			
			System.out.println("Error: Bad parameter in setPrice.");
			System.exit(0);
		}
		else {
			
			groupCount = count;
			groupPrice = costForCount;
		}
	}
	
	public void setNumberBought(int number){
		
		if (number <=0){
			
			System.out.println("Error: Badparameter in setNumberBought.");
			System.exit(0);
		}
		else {
			
			numberBought = number;
		}
	}
	
	public void readInput(){
		
		System.out.println("Enter name of the item you are purchasing:");
		name = keyboard.next();
		
		System.out.println("Enter price of item on two lines.");
		System.out.println("For example, 3 for $2.99 is entered as");
		System.out.println("3");
		System.out.println("2.99");
		System.out.println("Enter price of item on two lines, now:");
		groupCount = keyboard.nextInt();
		groupPrice = keyboard.nextDouble();
		
		while ((groupCount <=0) || (groupPrice <=0)){
			
			//Try again:
			System.out.println("Both numbers must be positive. Try again.");
			System.out.println("Enter price of item on two lines.");
			
			System.out.println("For example, 3 for $2.99 is entered as");
			System.out.println("3");
			System.out.println("2.99");
			
			System.out.println("Enter price of item on two lines, now:");
			groupCount = keyboard.nextInt();
			groupPrice = keyboard.nextDouble();
			
		}
		
		System.out.println("Enter number of items purchased:");
		numberBought = keyboard.nextInt();
		
		while (numberBought <=0){
			
			//Try again:
			System.out.println("Number must be positiove. Try again.");
			System.out.println("Enter number of items purchased:");
			numberBought = keyboard.nextInt();
		}
	}
		
	public void writeOutput(){
			
		System.out.println(numberBought + " " + name);
		System.out.println("at " + groupCount + " for $" + groupPrice);
	}
	
	public String getName(){
		
		return name;
	}
	
	public double getTotalCost(){
		
		return ((groupPrice/groupCount)*numberBought);
	}
	
	public double getUnitCost(){
		
		return (groupPrice/groupCount);
	}
	
	public int getNumberBought(){
		
		return numberBought;
	}

}
