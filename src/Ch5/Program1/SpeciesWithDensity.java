/*
 * Program: SpeciesWithDensity.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 24, 2012
 * Purpose: Worker program to determine species population over a given timeperiod.
*/

package Ch5.Program1;

import java.util.Scanner;

/**
 * Class for data on endangered species.
 */
public class SpeciesWithDensity {
	
	private String name;
	private int population;
	private double growthRate;
	private double area;
	private double targetDensity;
	
	public void readInput(){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the species' name?");
		name = keyboard.nextLine();
		
		System.out.println("What is the population of the species?");
		population = keyboard.nextInt();
		while (population < 0){
			
			System.out.println("Population cannot be negative.");
			System.out.println("Reenter population:");
			population = keyboard.nextInt();
		}
		
		System.out.println("Enter growth rate (% increase per year):");
		growthRate = keyboard.nextDouble();
		while (growthRate < 0){
			
			System.out.println("Growth Rate cannot be negative.");
			System.out.println("Reenter growth rate:");
			growthRate = keyboard.nextInt();
		}
		
		System.out.println("Enter the area (in square miles):");
		area = keyboard.nextDouble();
		while (area < 0){
			
			System.out.println("Area cannot be negative.");
			System.out.println("Reenter Area:");
			area = keyboard.nextInt();
		}
		
		System.out.println("Enter the target density:");
		targetDensity = keyboard.nextDouble();
		while (targetDensity < 0){
			
			System.out.println("Target Density cannot be negative.");
			System.out.println("Reenter target density:");
			targetDensity = keyboard.nextInt();
		}
	}
	
	public void writeOutput(){
		
		System.out.println("Name = " + name);
		System.out.println("Population = " + population);
		System.out.println("Growth rate = " + growthRate + "%");
	}
	
	/**
	 * Precondition: years is a nonnegative number.
	 * Returns the projected population of the receiving object
	 * after the specified number of years.
	 */
	public int predictPopulation(int years){
		
		int result = 0;
		double populationAmount = population;
		int count = years;
		while ((count > 0) && (populationAmount > 0)){
			
			populationAmount = (populationAmount + (growthRate /100) * populationAmount);
			count --;
		}
		
		if (populationAmount > 0)
			result = (int) populationAmount;
		return result;
	}
	
	public void setSpecies(String newName, int newPopulation, double newGrowthRate){
		
		name = newName;
		if (newPopulation >= 0)
			population = newPopulation;
		else {
			System.out.println("ERROR: using a negative population");
			System.exit(0);
		}
		growthRate = newGrowthRate;
	}
	
	public double getDensity(){
		return targetDensity; 		
	}
	
	public String getName(){
		return name;
	}
	
	public int getPopulation(){
		return population;
	}
	
	public double getGrowthRate(){
		return growthRate;
	}
	
	public boolean equals(SpeciesWithDensity otherObject){
		return (name.equalsIgnoreCase(otherObject.name)) &&
				(population == otherObject.population) &&
				(growthRate == otherObject.growthRate);
	}
}
