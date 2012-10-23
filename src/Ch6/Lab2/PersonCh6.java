/*
File name: PersonCh6.java
Class for a person: an enhanced version of PersonImproved class
from Chapter 5.

Enhancements:
	Four constructors:
		1. with parameters for both attributes, name and age.
		2. with just a name parameter (sets age = 0).
		3. with just an age parameter (sets name = "No name").
		4. default constructor with no parameters (sets age = 0 and name = "No name".

	An object of this class has two attributes, a name and an age.

Public methods:
	Set just the name, just the age, or both.
	Test if two persons are equal (same name and age).
	Test if two persons have the same name.
	Test if two persons have the same age.
	Test if one person is older than another.
	Test if one person is younger than another.

Preconditions:
	For set methods: the person has been created.
	For test methods: the persons have been created and have values for name and age.

Postconditions:
	Set methods: one or both attributes is assigned a value.
	Test methods: true or false is returned.
*/
package Ch6.Lab2;

import java.util.*;

public class PersonCh6 {
	
	private String name;
	private int age;
	
	//The four constructors
	
	//#1 - with bboth name and age parameters.
	// -sets age to 0 if a negative number is passed.
	
	public PersonCh6(String newName, int newAge){
		name  = newName;
		if(newAge >=0){
			age = newAge;
		}else
			System.out.println("Age must be a non-negative number.");
			System.out.println("The age has been set to 0.");
			age = 0;
			
	}
	
	//#2 - with just a name parameter.
	
	// - sets age to 0.
	
	public PersonCh6(String newName){
		name = newName;
		age = 0;
	}
	
	//#3 - with just an age parameter.
	// - sets name to "No Name".
	// - sets age = 0 if a negative number is passed.
	
	public PersonCh6(int newAge){
		
		name = "No Name";
		if (newAge >= 0)
			age = newAge;
		else {
			System.out.println("Age must be a non-negative number.");
			System.out.println("The age has been set to 0.");
			age = 0;
		}
	}
	
	//#4 - default constructor ( no parameters).
	// - sets name to "No Name".
	// - sets age to 0.
	
	public PersonCh6(){
		name = "No Name";
		age = 0;
	}
	
	public void readInput(){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the person's name?");
		name = keyboard.nextLine();
		
		System.out.println("What is the person's age?");
		age = keyboard.nextInt();
		while (age < 0){
			System.out.println("Age cannot be negative.");
			System.out.println("Reenter age:");
			age = keyboard.nextInt();
		}
	}
	
	public void writeOutput(){
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		
	}
	
	public void set(String newName, int newAge){
		name = newName;
		if (newAge >= 0)
			age = newAge;
		else{
			System.out.println("ERROR: Used a negative age.");
			System.exit(0);
		}
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public void setAge(int newAge){
		if (newAge >= 0)
			age = newAge;
		else {
			System.out.println("ERROR: Used a negative age.");;
			System.exit(0);
		}
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public boolean equals(PersonCh6 another){
		return(this.name.equalsIgnoreCase(another.name) && this.getAge() == another.getAge()); 
	}
	
	public boolean isSameName(PersonCh6 another){
		return(this.name.equalsIgnoreCase(another.name));
	}
	
	public boolean isSameAge(PersonCh6 another){
		return(this.getAge() == another.getAge());
	}
	
	public boolean isOtherThan(PersonCh6 another){
		return (this.getAge() > another.getAge());
	}
	
	public boolean isYoungerThan(PersonCh6 another){
		return(this.getAge() < another.getAge());
	}

}
