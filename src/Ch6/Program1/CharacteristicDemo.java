/*
 * Program: Characteristic Demo
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 31, 2012
 * Purpose: To demonstrate the characteristic class.
*/
package Ch6.Program1;

public class CharacteristicDemo {
	
	public static void main(String[] args){
		
		// first set
		Characteristic sports1 = new Characteristic("sports");
		Characteristic beaches2 = new Characteristic("beaches");

		sports1.setRating();
		sports1.toAString();
		
		beaches2.setRating();
		beaches2.toAString();

		
		// second set
		Characteristic beaches1 = new Characteristic("beaches");
		Characteristic sports2 = new Characteristic("sports");

		sports2.setRating(8);
		sports2.toAString();

		beaches1.setRating(2);
		beaches1.toAString();

		// third set
		
		

		
		// get compatability
		
		System.out.println("The compatability measure should be 1");
		System.out.println(sports1.getCompatability(beaches1));
		System.out.println("The compatability measure should be 0");
		System.out.println(sports2.getCompatability(beaches2));
		System.out.println("The compatability should be 0.209");
		
		
	}
}
