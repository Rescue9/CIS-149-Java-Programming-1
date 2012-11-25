package Ch8.Program1;

public class Staff extends Employee{
	private int payGrade;
	
	public Staff(){
		super();
		payGrade = 0;
	}
	
	public Staff(String initialName, String initialDepartment, int initialID, int newPayGrade){
		super(initialName, initialDepartment, initialID);
		payGrade = newPayGrade;
	}
	
	public void reset(String newName, String newDepartment, int newId, int newPayGrade){
		reset(newName, newDepartment, newId);
		payGrade = newPayGrade;
	}

	public void setPayGrade(int newPayGrade){
		payGrade = newPayGrade;
	}
	
	public int getPaygrade(){
		return payGrade;
	}
	
	public void writeOutput(){
		super.writeOutput();
		System.out.println("Pay Grade: " + getPaygrade());
	}
	
	public boolean equals(Staff otherStaff){
		return equals((Employee)otherStaff) && (this.payGrade == otherStaff.payGrade);
	}
}
