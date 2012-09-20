package Ch3.Program2;

import javax.swing.JOptionPane;

/*
 * Program: AverageScores.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: September 12, 2012
 * Purpose: To average a number of scores together
 */

public class AverageScores {

	public static void main(String[] args){
		
		int answer = 0;
		double sum = 0;
		int numberOfStudents = 0;
		String students;

		while (answer == 0){
			// find out how many students the user would like to average for
			students = JOptionPane.showInputDialog("Type the number of scores you wish to enter; between 2-4");
			numberOfStudents = Integer.parseInt(students);
		
			// use switch statement for numberOfStudents & pass variables to method
			switch (numberOfStudents) {
				
				case 2: getScoreNumbers(numberOfStudents, sum);
						break;
					
				case 3: getScoreNumbers(numberOfStudents, sum);
						break;
		
				case 4: getScoreNumbers(numberOfStudents, sum);
						break;
				
				default: JOptionPane.showMessageDialog(null, "You did not enter a valid number. \nPlease follow the directions listed.");
						break;
		
			}
			// ask user if another calculation is needed
			answer = JOptionPane.showConfirmDialog(null, "Would you like to average another set of scores?", "Run again?", JOptionPane.YES_NO_OPTION);
			
			//System.out.println(answer); //used to debug
			
		}

	}
		

	
	public static void getScoreNumbers(int numberOfStudents, double sum){
		
		// inform user that all numbers should be whole
		JOptionPane.showOptionDialog(null, "All entries should be whole numbers...", "Informational Message", JOptionPane.DEFAULT_OPTION, 3, null, null, null);
				
		// remember original scoreNumber
		int originalNumberOfStudents = numberOfStudents;
		double total;
		
		// using separate method to handle repeat code
		int scoreCount = 1;
		while (numberOfStudents >0){
			
			
			String next;
			next = JOptionPane.showInputDialog("Enter score number " + scoreCount);
			sum = sum + Integer.parseInt(next);
			numberOfStudents--;
			scoreCount++;
					
		}
		
		// calculate & display total
		total = sum / originalNumberOfStudents;
		JOptionPane.showMessageDialog(null, "The average score based upon your input is " + (int) total);
				
	}

}
