package Ch8.Lab2;

public class Patient extends Person {
	
	private String ssn;
	private String name;
	
	public Patient(){
		super();
		ssn = "000-00-0000";
	}
	
	public Patient(String aName){
		super(aName);
		ssn = "000-00-0000";
	}
	
	public Patient(String aName, String aSsn){
		super(aName);
		ssn = aSsn;
	}
	
	public void writeOutput(){
		super.writeOutput();
		writeSsn();
	}
	
	public void writeSsn(){
		System.out.println("Social Security #: " + ssn);
	}
	
	public void set(String newName, String newSsn){
		setName(newName);
		ssn = newSsn;
	}
	
	public void setSsn(String newSsn){
		ssn = newSsn;
	}
	
	public String getSsn(){
		return ssn;
	}
	
	public boolean equals(Patient otherPatient){
		return(this.hasSameName(otherPatient) && this.ssn.equalsIgnoreCase(otherPatient.getSsn()));
	}

}
