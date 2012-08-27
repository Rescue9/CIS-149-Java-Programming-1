/*
Program: Digits.java
Programmer: Andrew Buskov
Purpose: To display four digits typed on a single line onto four lines.
*/

import java.util.Scanner;

public void Digits.java {

     public static void main(String[] args0{
		 
		 Scanner keyboard = new Scanner(System.in);
		 String fourDigits;
		 
		 System.out.println("Enter a four digit integer, e.g. 1974: ");
		 fourDigits = keyboard.nextLine();
		 
		 System.out.println(fourDigits.charAt(0));
		 System.out.println(fourDigits.charAt(1));
		 System.out.println(fourDigits.charAt(2));
		 System.out.println(fourDigits.charAt(3));
		 
	 }

}

