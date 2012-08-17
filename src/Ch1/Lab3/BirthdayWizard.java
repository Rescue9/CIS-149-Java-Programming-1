package Ch1.Lab3;

import java.util.*;

public class BirthdayWizard {
	
	public static void main(String[] args){
		
		System.out.println("Greetings.");
		int year, age;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What year were you born in?");
		year = keyboard.nextInt();
		
		System.out.println("Choose an age in years:");
		age = keyboard.nextInt();
		
		System.out.println("You will turn " + age + " in tye year ");
		System.out.println(year + age);
				
	}
	
}
