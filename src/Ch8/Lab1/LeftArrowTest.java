package Ch8.Lab1;

import java.util.*;

public class LeftArrowTest {
	
	public static void main(String[] args){
	
		char repeat;
		Scanner keyboard = new Scanner(System.in);
	
		do { // repeat if user says 'yes'
			// test the three constructors ( uses writeValues method)
			LeftArrow a1 = new LeftArrow();
			System.out.println("Using tdefault constructor:");
			a1.writeOutput();
			System.out.println();
			System.out.println("===============================");
		
			LeftArrow a2 = new LeftArrow(3,5,7);
			System.out.println("Using fully specified constructor:");
			a2.writeOutput();
			System.out.println();
			System.out.println("===============================");
			
			LeftArrow a3 = new LeftArrow(9,11);
			System.out.println("Constructor with just tail & base:");
			a3.writeOutput();
			System.out.println();
			System.out.println("===============================");

			// test the methods to change, return, and write values
			System.out.println("Changing value of offset from 0 to 1:");
			System.out.println();
			System.out.println("Before:");
			a1.writeOutput();
			System.out.println();
			a1.setOffset(1);
			System.out.println("After:");
			a1.writeOutput();
			System.out.println();
			System.out.println("===============================");

			System.out.println("Changing value of base from 3 to 10;");
			System.out.println("It should automatically be changed to 11"
					+ " to make it odd.");
			System.out.println();
			System.out.println("Before:");
			a1.writeOutput();
			System.out.println();
			a1.setBase(10);
			System.out.println("After:");
			a1.writeOutput();
			System.out.println("===============================");
			
			System.out.println();
			System.out.println("Testing write offset.");
			a1.writeOffset();
			System.out.println();
			System.out.println("Testing returnOffset:");
			System.out.println("The offset returned = " + a1.getOffset());
			System.out.println();
			System.out.println("===============================");

			System.out.println();
			System.out.println("Testing write tail:");
			a1.writeTail();
			System.out.println();
			System.out.println("Testing return Tail:");
			System.out.println("The tail returned = " + a1.getTail());
			System.out.println();
			System.out.println("===============================");

			System.out.println();
			System.out.println("Testing write base:");
			a1.writeBase();
			System.out.println();
			System.out.println("Testing returnBase:");
			System.out.println("The base returned = " + a1.getBase());
			System.out.println();
			System.out.println("===============================");

			// test the acutal drawing of left arrows
			// using the drawHere method
		
			System.out.println();
			System.out.println("RESET to");
			System.out.println("Offset = 0, tail = 3, base = 5:");
			// Note: the base should be changed automatically to 7
			// to make it odd.
			a1.set(0, 3, 5);
			a1.writeOutput();
			System.out.println();
			a1.drawHere();
			System.out.println();
			System.out.println("===============================");

			System.out.println();
			System.out.println("RESET to");
			System.out.println("Offset = 1, tail = 4, base = 7:");
			a1.set(1, 4, 7);
			a1.writeOutput();
			System.out.println();
			a1.drawHere();
			System.out.println();
			System.out.println("===============================");

			System.out.println();
			System.out.println("RESET to");
			System.out.println("Offset = 3, tail = 5, base = 6:");
			a1.set(3, 5, 6);
			a1.writeOutput();
			System.out.println();
			a1.drawHere();
			System.out.println();
			System.out.println("===============================");

			// now test the drawing of a left arrow
			// using the drawAt method
			System.out.println();
			System.out.println("The arrow parameters are:");
			a1.writeOutput();
			System.out.println();
			System.out.print("This arrow should display ");
			System.out.print("five lines down.");
			a1.drawAt(5);
			System.out.println();
			System.out.println("===============================");

			System.out.println("Do again? (Y for Yes, or N for No)");
			repeat = keyboard.next().charAt(0);
		} while ((repeat == 'Y' || repeat == 'y'));
	}
}
