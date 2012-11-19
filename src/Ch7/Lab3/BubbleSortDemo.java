/*
 * Program: BubbleSortDemo.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Nov 5, 2012
 * Purpose: Driver class for BubbleSorter
*/
package Ch7.Lab3;

import java.util.Scanner;

public class BubbleSortDemo {
	
	public static void main(String[] args){
	
		Scanner keyboard = new Scanner(System.in);
		int[]b = new int[7];
	
		for (int i = 0; i<7; i++){
			System.out.println("Please enter number " + (i+1));
			b[i]=keyboard.nextInt();
		}
		
		System.out.println("Array values before sorting:");
		
		int i;
		for (i=0; i<b.length; i++){
			System.out.println(b[i] + " ");
		}
		
		System.out.println();
		
		BubbleSorter.sort(b);
		
		System.out.println("Array values after sorting:");
		
		for (i = 0; i < b.length; i++){
			System.out.println(b[i] + " ");
		}
		
		System.out.println();
	}

}
