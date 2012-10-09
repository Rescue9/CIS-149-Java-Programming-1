/*
 * Program: CounterTest.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 9, 2012
 * Purpose: A program that will increment and decrement a counter.
*/

package Ch5.Lab4;

import java.util.Scanner;

public class CounterTest {
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		Counter testCounter = new Counter();
		
		int startingValue, endingValue;
		
		System.out.println("Change the starting value by entering a number");
		startingValue = keyboard.nextInt();
		
		System.out.println("Set the ending value by entering a number. This number MUST be higher than the starting value");
		endingValue = keyboard.nextInt();
		
		testCounter.setValue(startingValue);
		System.out.println("After setValue() testCounter = " + testCounter.countIs());
		
		if (endingValue <= startingValue){
			System.out.println("The ending value must be higher than the starting value. This program will now end");
			System.exit(0);
		}
		
		for (int i=startingValue; i < endingValue; i++){
			System.out.println("Loop count =" + i);
			testCounter.increment();
			System.out.println("\n\t After increment() in loop " + "using printCounter(): ");
			testCounter.printCounter();
			System.out.println("\n\tUsing countIs() to return value: " + testCounter.countIs());
		}
		
		for (int i=startingValue; i< endingValue; i++){
			System.out.println("\nLoop count = " + i);
			testCounter.decrement();
			System.out.println("\n\tAfter decrement() in loop " + "using printCounter(): ");
			testCounter.printCounter();
			System.out.println("\n\tUsing countIs() to return value: " + testCounter.countIs());
		}
	}

}
