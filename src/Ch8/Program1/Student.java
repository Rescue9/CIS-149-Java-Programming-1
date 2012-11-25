package Ch8.Program1;

public class Student extends Person {
	
	private int studentNumber;
	
	public Student(){
		super();
		studentNumber = 000000;
	}
	
	public Student(String initialName, int initialStudentNumber){
		super(initialName);
		setStudentNumber(initialStudentNumber);
		
	}
	
	public void reset(String newName, int newStudentNumber){
		setName(newName);
		setStudentNumber(newStudentNumber);
		
	}
	
	public void setStudentNumber(int newStudentNumber){
		studentNumber = newStudentNumber;
	}
	
	public int getStudentNumber(){
		return studentNumber;
	}
	
	public void writeOutput(){
		super.writeOutput();
		System.out.println("Student Number: " + studentNumber);
	}
	public boolean equals(Student otherStudent){
		return equals((Student)otherStudent) && (this.studentNumber == otherStudent.studentNumber);
	}
}
