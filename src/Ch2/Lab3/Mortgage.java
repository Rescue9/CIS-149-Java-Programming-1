package Ch2.Lab3;
/*
* Program: FtoC.class
* Class: CIS 149
* Date: August 27, 2012
* Programmer: Andrew Buskov
* Purpose: To take a Fahrenheit temperature value and convert it to a Celsius value.
*/

import javax.swing.JOptionPane;

public class Mortgage {
	
	public static final double RATE = 0.0749;
	
	public static void main(String[] args){
		
		String strPayment, strPrinciple;
		double payment, oldPrinciple;
		int interestAmount, toPrinciple, newPrinciple;
		
		strPayment = JOptionPane.showInputDialog("Enter this month's payment (dollars.cent):");
		payment = Double.parseDouble(strPayment);
		payment = (int) (payment * 100 + 0.5);
		
		strPrinciple = JOptionPane.showInputDialog("Enter the principal owed (dollars.cents):");
		oldPrinciple = Double.parseDouble(strPrinciple);
		oldPrinciple = (int) (oldPrinciple * 100 + 0.5);
		
		interestAmount = (int) (oldPrinciple * RATE/12);
		toPrinciple = (int) (payment - interestAmount);
		newPrinciple = (int) (oldPrinciple - toPrinciple);
		
		JOptionPane.showMessageDialog(null, "Previous Balance:" + (double)oldPrinciple/100+"\nPayment:" +
				(double)payment/100 + "\nInterest Paid:" + (double)interestAmount/100 + "\nAmount applied to principle:" +
				(double)toPrinciple/100 + "\nNew Balance:" + (double)newPrinciple/100);
		
				
	}

}
