package Ch3.Lab2;

/*
 * Program: MiddleString.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: September 8, 2012
 * Purpose: To determwine the valid date.
 */

import javax.swing.JOptionPane;

public class CheckDate {
	
	public static void main(String args[]){
		
		String date, monthString, dayString, yearString, rest, message=" ";
		int breakIndex, month, day, year;
		boolean validDate = true, leapYear;
		
		date = JOptionPane.showInputDialog(null, "Please enter a date to be checked in the form of mm/dd/year");
		
		breakIndex = date.indexOf("/");
		monthString = date.substring(0, breakIndex);
		
		month = Integer.parseInt(monthString);
		
		rest = date.substring(breakIndex+1);
		breakIndex = rest.indexOf("/");
		dayString = rest.substring(0, breakIndex);
		yearString = rest.substring(breakIndex+1);
		
		day = Integer.parseInt(dayString);
		year = Integer.parseInt(yearString);
		
		JOptionPane.showMessageDialog(null, "Date is: " + month + ":" + day + ":" + year);
		
		if(day <1){
			validDate = false;
			message = "The day value is less than one. ";
		}
		
		switch(month){
		
			case 2: // February
				leapYear = (year %400 == 0) || ((year%4 !=0) && (year%100 !=0));
				if(leapYear && day>29){
					validDate = false;
					message = "The day value is greater than 29 in February in a leap year. ";
				}
				else if (!leapYear && day>28){
					validDate = false;
					message = "The day value is greater than 28 in February in a non leap year. ";
				}
				break;
			case 4: case 6: case 9: case 11: // April, June, September, and November
				if(day>30){
					validDate = false;
					message = "The day value is greater in a month with just 30 days. ";
				}
				break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: // January, March, May, July, August, October, and December
				if(day>31){
					validDate = false;
					message = "The day value is greater than 31 in a month with just 31 days. ";
				}
				break;
			default:
				validDate = false;
				message = message + "The month value is not from 1 to 12 ";
		}
		
		JOptionPane.showMessageDialog(null, "Your date was: " + date);
		if(validDate){
			JOptionPane.showConfirmDialog(null, "It is a valid date.");
		}
		else {
			JOptionPane.showMessageDialog(null, "It is not a valid date." + "\nThe reason it is invalid: " + message);
		}
	}
				
}
