package Ch8.Program1;

import java.util.Scanner;

public class DemoProgram {
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		// easier for me to test each individual class....
		// so, we're testing them in an organized fashion
		
		// person will be 'tested' when child classes call super();
		// so we won't directly test that class
		
		// student.class test
		String[] studentName = new String[2];
		int[] studentNumber = new int[2];
		System.out.println("Enter Student1's name:");
		studentName[0] = keyboard.next();
		System.out.println("Enter Student1's studentNumber:");
		studentNumber[0] = keyboard.nextInt();
		System.out.println("Enter Student2's name:");
		studentName[1] = keyboard.next();
		System.out.println("Enter Student2's studentNumber");
		studentNumber[1] = keyboard.nextInt();
		
		Student s1 = new Student(studentName[0], studentNumber[0]);
		Student s2 = new Student(studentName[1], studentNumber[1]);
		
		s1.writeOutput();
		s2.writeOutput();

		
		// undergraduate.class test
		int[] level = new int[2];
		System.out.println("What is " + s1.getName() + "'s undergrad level?");
		level[0] = keyboard.nextInt();
		System.out.println("What is " + s2.getName() + "'s undergrad level?");
		level[1] = keyboard.nextInt();
		
		Undergraduate u1 = new Undergraduate(s1.getName(), s1.getStudentNumber(), level[0]);
		Undergraduate u2 = new Undergraduate(s2.getName(), s2.getStudentNumber(), level[1]);
		
		// employee.class test
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		// staff.class test
		Staff st1 = new Staff();
		Staff st2 = new Staff();
		
		// faculty.class test
		Faculty f1 = new Faculty();
		Faculty f2 = new Faculty();
		
	}
}
