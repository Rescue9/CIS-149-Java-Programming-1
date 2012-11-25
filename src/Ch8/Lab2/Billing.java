package Ch8.Lab2;

import java.text.DecimalFormat;

public class Billing {

	private String aDoctor;
	private String aPatient;
	
	private double billingAmount;
	DecimalFormat currency = new DecimalFormat("$##,##0.00");
	
	public Billing(Doctor theDoctor, Patient thePatient){
		aDoctor = theDoctor.getName();
		aPatient = thePatient.getName();
		billingAmount = theDoctor.getOfficeFee();
	}
	
	public void writeOutput(){
		writeDoctorName();
		writePatientName();
		writeBillingAmount();
	}
	
	public void writeDoctorName(){
		System.out.println("Doctor: " + aDoctor);
	}
	
	public void writePatientName(){
		System.out.println("Patient: " + aPatient);
	}
	
	public void writeBillingAmount(){
		System.out.println("Billing Amount: " + currency.format(billingAmount));
	}
	
	public void set(String newDoctorName, String newPatientName, double newBillingAmount){
		setDoctor(newDoctorName);
		setPatient(newPatientName);
		setBillingAmount(newBillingAmount);
	}
	
	public void setDoctor(String newDoctor){
		aDoctor = newDoctor;
	}
	
	public void setPatient(String newPatient){
		aPatient = newPatient;
	}
	
	public void setBillingAmount(double newBillingAmount){
		billingAmount = newBillingAmount;
	}
	
	// methods to return values of instance variables
	public String getDoctor(){
		return aDoctor;
	}
	
	public String getPatient(){
		return aPatient;
	}
	
	public double getBillingAmount(){
		return billingAmount;
	}
	
	public boolean equals(Billing otherBilling){
		return this.aDoctor.equalsIgnoreCase(otherBilling.getDoctor())
				&& this.aPatient.equalsIgnoreCase(otherBilling.getPatient())
				&& this.billingAmount == otherBilling.billingAmount;
	}
	
}
