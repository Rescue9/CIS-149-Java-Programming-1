package Ch3;

/*
 * Program: MiddleString.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: August 29, 2012
 * Purpose: To find the word that is the middle word of three
 *
 */

import java.util.Scanner;

public class MiddleString {
	
	public static void main(String[] args){
	
		// declare variables
		Scanner reader = new Scanner(System.in);
		String word1, word2, word3, middle;
		
		// get user input
		System.out.println("Please enter three words separated by spaces.");
		word1 = reader.next();
		word2 = reader.next();
		word3 = reader.next();
		
		// compare the words
		if(word1.compareTo(word2)<=0 && word1.compareTo(word3)<=0)
		{
			// word1 is the smallest
			if(word2.compareTo(word3)<=0)
				middle = word2;
			else
				middle = word3;
		}
		else if (word2.compareTo(word3)<=0){
			//word2 is the smallest
			if(word1.compareTo(word3)<=0)
				middle = word1;
			else
				middle = word3;
		}
		else {
			//word3 is the smallest
			if(word1.compareTo(word2)<=0)
				middle = word1;
			else
				middle = word2;
		}
		System.out.println("The middle word is " + middle);
	}
}
