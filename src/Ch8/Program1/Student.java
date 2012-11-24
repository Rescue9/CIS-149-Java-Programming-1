package Ch8.Program1;

public class Student extends Person {
	
	private int studentNumber;
	
	public Student(){
		super();
		studentNumber = 000000;
	}
	
	public Student(String initialName){
		super(initialName);
		studentNumber = 000000;
	}
	
	public Student(String initialName, int initialStudentNumber){
		super(initialName);
		setStudentNumber(initialStudentNumber);
		
	}
	
	public void reset(String newName, int newStudentNumber){
		
	}
	
	public void setStudentNumber(int newStudentNumber){
		
	}
	
	public int getStudentNumber(){
		return studentNumber;
	}
	
	public void writeOutput(){
		
	}
	public boolean equals(Student otherStudent){
		return equals((Student)otherStudent);
	}
}
