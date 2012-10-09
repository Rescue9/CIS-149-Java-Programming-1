/*
 * Program: GroceryBill.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 8, 2012
 * Purpose: To tabulate items on a grocery bill. This uses helper class Purchase.java		
*/

package Ch5.Lab2;

import java.text.DecimalFormat;

public class GroceryBill {
	
	public static void main(String[] args){
		DecimalFormat currencyFormat = new DecimalFormat("$##,##0.00");
		double totalCost = 0;
		Purchase item = new Purchase();
	
		item.readInput();
		item.writeOutput();
		
		item.setName("Oranges");
		item.setPrice(10, 2.99);
		item.setNumberBought(24);
		item.writeOutput();
		System.out.println("Subtotal: $" + item.getTotalCost());
		totalCost = totalCost + item.getTotalCost();
		
		item.setName("Eggs");
		item.setPrice(12, 1.69);
		item.setNumberBought(36);
		item.writeOutput();
		System.out.println("Subtotal: $" + item.getTotalCost());
		totalCost = totalCost + item.getTotalCost();
		
		item.setName("Apples");
		item.setPrice(3, 1.00);
		item.setNumberBought(20);
		item.writeOutput();
		System.out.println("Subtotal: $" + item.getTotalCost());
		totalCost = totalCost + item.getTotalCost();
		
		item.setName("Watermellons");
		item.setPrice(1, 4.39);
		item.setNumberBought(2);
		item.writeOutput();
		System.out.println("Subtotal $:" + item.getTotalCost());
		totalCost = totalCost + item.getTotalCost();
		
		item.setName("Bagles");
		item.setPrice(6, 3.50);
		item.setNumberBought(12);
		item.writeOutput();
		System.out.println("Subtotal: $" + item.getTotalCost());
		totalCost = totalCost + item.getTotalCost();
		
		System.out.println();
		System.out.println("Total: " + currencyFormat.format(totalCost));
	}

}
