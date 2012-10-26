/**
*
* File name: PersonCh6Test.java
*
* A program to test the class PersonCh6.
*
* This program creates objects of class PersonCh6 and
* exercises its methods, including the four constructors.
* PersonCh6 objects have two data attributes, name and age.
*
* PersonCh6 public methods:
* constructor with name and age parameters.
* constructor with just name parameter (sets age = 0).
* constructor with just age parameter (sets name = "No name").
* default constructor (no parameters) - sets name = "No name"
*
* and age = 0.
* readInput interactively assigns name and age values.
* writeOutput displays name and age.
*
* set assigns name and age.
* getName returns name.
* setName sets name.
* setAge sets age.
*
*/

package Ch6.Lab2;

import java.util.Scanner;

public class PersonCh6Test {
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println();
		
		System.out.println("Test case 1: default constructor and");
		System.out.println("writeOutput() method.");
		System.out.println();
		PersonCh6 secretAgent1 = new PersonCh6();
		System.out.println("Results of default contstructor:");
		System.out.println("Should be name = \"No Name\" and");
		System.out.println("age = 0.");
		System.out.println();
		secretAgent1.writeOutput();
		System.out.println();
		System.out.println("=========================================");
		
		System.out.println("Test case 2: readInput() method.");
		secretAgent1.readInput();
		System.out.println();
		System.out.println("Verify name and age.");
		System.out.println("Should be whatever you just entered.");
		System.out.println();
		secretAgent1.writeOutput();
		System.out.println();
		System.out.println("=========================================");

		System.out.println("Test case 3: new person that tests constructor with just name.");
		String case3Name;
		System.out.println("Enter a new name");
		case3Name = keyboard.next();
		PersonCh6 secretAgent2 = new PersonCh6(case3Name);
		System.out.println();
		System.out.println("Verify name = a new name and age = 0");
		System.out.println();
		secretAgent2.writeOutput();
		System.out.println();
		System.out.println("=========================================");

		System.out.println("Test case 4: constructor with just age.");
		System.out.println();
		System.out.println("Set the age = 40.");
		System.out.println();
		secretAgent2.setAge(40);
		secretAgent2.writeOutput();
		System.out.println();
		System.out.println("=========================================");

		System.out.println("Test case5: constructor with both name & age.");
		String case5Name;
		int case5Age;
		System.out.println("Enter a new name");
		case5Name = keyboard.next();
		System.out.println("What is their age?");
		case5Age = keyboard.nextInt();
		System.out.println();
		PersonCh6 secretAgent3 = new PersonCh6(case5Name, case5Age);
		secretAgent3.writeOutput();
		System.out.println();
		System.out.println("=========================================");

		System.out.println();
		System.out.println("Test case 6:");
		System.out.println("Test getName() method");
		System.out.println();
		System.out.println("Verify results: " + secretAgent3.getName());
		System.out.println("=========================================");

		System.out.println();
		System.out.println("Test case 7:");
		System.out.println("Test getAge() method");
		System.out.println();
		System.out.println("Verify Results: " + secretAgent3.getAge());
		System.out.println("=========================================");

		System.out.println();
		System.out.println("Test case 8:");
		System.out.println("Change last name to Rocky");
		secretAgent3.setName("Rocky");
		System.out.println();
		System.out.println("Verify results with getName(): " + secretAgent3.getName());
		System.out.println("=========================================");

		System.out.println();
		System.out.println("Test case 9:");
		System.out.println("setAge to 99");
		secretAgent3.setAge(99);
		System.out.println();
		System.out.println("Verify results: " + secretAgent3.getAge());
		System.out.println("=========================================");

		System.out.println();
		System.out.println("Test case 10: set method (both name & age) on the first, two persons ");
		System.out.println("and equals (both name and age)");
		System.out.println("Making two persons" + " with same name and age:");
		secretAgent1.set("Bullwinkle", 10);
		secretAgent2.set("Bullwinkle", 10);
		System.out.println("First person: ");
		secretAgent1.writeOutput();
		System.out.println("Seconf person: ");
		secretAgent2.writeOutput();
		System.out.println();
		System.out.println("Verify results: should be true.");
		System.out.println(secretAgent1.equals(secretAgent2));
		System.out.println("=========================================");
	}

}
