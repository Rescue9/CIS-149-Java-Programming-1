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
		Characteristic sports2 = new Characteristic("sports");
		Characteristic beaches1 = new Characteristic("beaches");
		Characteristic beaches2 = new Characteristic("beaches");

		sports1.setRating();
		sports1.toAString();
		
		beaches1.setRating();
		//beaches1.toAString();

		sports2.setRating(10);
		//sports2.toAString();

		beaches2.setRating(2);
		//beaches2.toAString();
		
		// get compatibility
		
		System.out.println("The compatability measure should be 1");
		System.out.println(sports1.getCompatability(sports1));
		System.out.println("The compatability measure should be 0");
		System.out.println(sports1.getCompatability(beaches2));
		
		// change the variables again
		
		sports1.setRating(2);
		beaches1.setRating(9);
		
		// get compatibility again
		
		System.out.println("The compatability measure should be 0.209");
		System.out.println(sports1.getCompatability(sports2));
		System.out.println("The compatability measure should be 0.395");
		System.out.println(beaches1.getCompatability(beaches2));
	}
}
