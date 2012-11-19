/*
 * Program: BubbleSorter.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Nov 5, 2012
 * Purpose: To sort a set of numbers in ascending order.
*/

package Ch7.Lab3;

public class BubbleSorter {
	
	public static void sort(int[]a){
		boolean sorted = false;
		int iterations = a.length - 1; // max number of passes
		
		while(!sorted && iterations >0){
			sorted = true;
			for (int i=0; i< iterations; ++i){
				if (a[i]> a[i + 1]){
					// swap; bubble largest value up
					// to highest position
					
					interchange(i, a);
					sorted = false;
				}
			}
			-- iterations;
		}
	}
	
	private static void interchange(int i, int[] array){
		int temp;
		temp = array[i];
		array[i] = array[i +1];
		array[i + 1] = temp; // original value of a[i];
	}

}
