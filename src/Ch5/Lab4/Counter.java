/*
 * Program: Counter.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 9, 2012
 * Purpose: Working class for the CounterTest.java main
*/

package Ch5.Lab4;

public class Counter {
	
	private int value;
	
	public void setZero()	{
	
		value = 0;
	}
	
	public void setValue(int number)	{
	
		value = number;
	}
	
	public void increment()	{
	
		value++;
	}
	
	public void decrement()	{

		if(value > 0);

		value--;
	}
	
	public int countIs()	{
	
		return value;
	}
	
	public void printCounter()	{
	
		System.out.println("\nCounter value = " + value); //insert a blank line before this
	}


}
