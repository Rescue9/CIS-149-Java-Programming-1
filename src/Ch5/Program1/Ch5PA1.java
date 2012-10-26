/*
 * Program: Ch5PA1
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 24, 2012
 * Purpose: Driver for SpeciesWithDensity program.
*/

package Ch5.Program1;

public class Ch5PA1 {

	
	
	public static void main(String[] args){
		
		// create new object SpeciesWithDensith
		SpeciesWithDensity animal = new SpeciesWithDensity();
		
		// allow user to input data
		animal.readInput();
		
		// run loop until target density is reached
		int years = 1;
		while (animal.predictPopulation(years) / animal.getArea() < animal.getDensity()){
			years++;
			// System.out.println(years); // used for testing
		}
		
		System.out.println("Species " + animal.getName() + " will reach " + animal.getDensity() + " per square mile in " + years + " years.");
	}
}
