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
		
		System.out.println("Writing output for intitial Student input");
		s1.writeOutput();
		System.out.println();
		s2.writeOutput();
		System.out.println();

		
		// undergraduate.class test
		int[] level = new int[2];
		System.out.println("What is " + s1.getName() + "'s undergrad level?");
		level[0] = keyboard.nextInt();
		System.out.println("What is " + s2.getName() + "'s undergrad level?");
		level[1] = keyboard.nextInt();
		
		Undergraduate u1 = new Undergraduate(s1.getName(), s1.getStudentNumber(), level[0]);
		Undergraduate u2 = new Undergraduate(s2.getName(), s2.getStudentNumber(), level[1]);
		System.out.println();
		System.out.println("Writing output for undergrad information for initial students");
		u1.writeOutput();
		System.out.println();
		u2.writeOutput();
		System.out.println();
		
		System.out.println("Resetting " + s1.getName() + "'s information completely");
		u1.reset("Holly", 980, 3);
		u1.writeOutput();
		System.out.println();
		
		// employee.class test
		Employee e1 = new Employee("Jim", "Central Intelligence", 12);
		Employee e2 = new Employee("George", "Science & Technology", 22);
		
		System.out.println("Testing specific input information for employee");
		e1.writeOutput();
		System.out.println();
		e2.writeOutput();
		System.out.println();
		// staff.class test
		System.out.println("Testing Staff class information");
		Staff st1 = new Staff();
		st1.reset("Ginger", "Zoology", 354, 32);
		st1.writeOutput();
		System.out.println();
		System.out.println("Changing paygrade");
		st1.setPayGrade(33);
		st1.writeOutput();
		System.out.println();
		
		// faculty.class test
		System.out.println("Faculty test");
		Faculty f1 = new Faculty();
		f1.setName("Bob");
		System.out.println("Name should be Bob: " +f1.getName());
		System.out.println();
		f1.setEmployeeID(747);
		f1.writeOutput();
		System.out.println();
		System.out.println();
		f1.setTitle("Interm Professor");
		f1.setDepartment("Janitorial");
		f1.writeOutput();
		
	}
}
