package Ch4.Lab2;
/*
 * Program: ExamStatistics.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Sep 22, 2012
 * Purpose: To calculate the averages, percentages, and average score, etc. from entered exam scores.
*/

import java.util.Scanner;

public class ExamStatistics {

	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		// declare and initialize most variables
		int score,
		Acount = 0,
		Bcount = 0,
		Ccount = 0,
		Dcount = 0,
		Fcount = 0,
		sumOfScores = 0,
		lowest = 100,
		highest = 0,
		totalCount;
		float percent;
		
		System.out.println();
		System.out.println();
		System.out.println("Enter numberical grades");
		System.out.println("in the range of 0 to 100 -");
		System.out.println("integers only please!");
		System.out.println();
		System.out.println("Enter '-1' to terminate data entry.");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Please enter a score from 0 to" + " 100 or -1 to quit: ");
		score = keyboard.nextInt(); //Get 1st score
		
		while (score >=0) //quit if a negative value is entered
		{
			// update running total of scores to get average
			sumOfScores = sumOfScores + score;
			
			// change lowest & highest values if necessary
			if (score < lowest)
				lowest = score;
			if (score > highest)
				highest = score;
			
			// increment letter grade category count
			if (score >=90)
				Acount = Acount + 1;
			else if (score >=80)
				Bcount = Bcount + 1;
			else if (score>=70)
				Ccount = Ccount + 1;
			else if (score >=60)
				Dcount = Dcount + 1;
			else
				Fcount = Fcount + 1;
			
			// get next score value
			System.out.println("Please enter a score from 0 to" + " 100 or -1 to quit:");
			score = keyboard.nextInt();
		}
		
		totalCount = Acount + Bcount + Ccount + Dcount + Fcount;
		
		if (totalCount > 0){
			System.out.println();
			System.out.println("Total number of grades = " + totalCount);
			System.out.println("Number of A's = " + Acount);
			System.out.println("Number of B's = " + Bcount);
			System.out.println("Number of C's = " + Ccount);
			System.out.println("Number of D's = " + Dcount);
			System.out.println("Number of F's = " + Fcount);
			System.out.println();
			
			percent = (float) Acount * 100 / totalCount;
			System.out.println("Percent A's = " + percent);
			percent = (float) Bcount * 100 / totalCount;
			System.out.println("Percent B's = " + percent);
			percent = (float) Ccount * 100 / totalCount;
			System.out.println("Percent C's = " + percent);
			percent = (float) Dcount * 100 / totalCount;
			System.out.println("Percent D's = " + percent);
			percent = (float) Fcount * 100 / totalCount;
			System.out.println("Percent F's = " + percent);
			
			System.out.println("Lowest grade = " + lowest);
			System.out.println("Highest grade = " + highest);
			System.out.println();
			
			System.out.println("Average score = " + (float) sumOfScores / totalCount);
			
		}
		else // print message if no scores were entered
		{
			System.out.println("No scores were entered.");
			System.out.println("Bye bye.");
		}
			
	}
	
}
