package Ch8.Lab2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BillingTest {
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat currency = new DecimalFormat("$##,##0.00");
		char repeat;
		
		do { // all code goes in the do / while loop
			String doctorName[] = new String[2];
			String doctorSpeciality[] = new String[2];
			
			double[] doctorFee = new double[2];
			
			String[] patientName = new String[2];
			String[] patientSSN = new String[2];
			
			for(int i = 0; i<2; i++){
				System.out.println("Enter doctor " + (i+1) + "'s name");
				doctorName[i] = keyboard.next();
				
				System.out.println("Enter doctor " + (i+1) + "'s office fee");
				doctorFee[i] = keyboard.nextDouble();
				
				System.out.println("Enter doctor " + (i+1) + "'s specialty");
				doctorSpeciality[i] = keyboard.next();
			}
			
			for(int i=0;i<2;i++){
				System.out.println("Enter patient " + (i+1) + "'s name");
				patientName[i] = keyboard.next();
				
				System.out.println("Enter patient " + (i+1) + "'s Social Security Number");
				patientSSN[i] = keyboard.next();
			}
			
			Doctor d1 = new Doctor(doctorName[0], doctorFee[0], doctorSpeciality[0]);
			Doctor d2 = new Doctor(doctorName[1], doctorFee[1], doctorSpeciality[1]);
			Patient p1 = new Patient(patientName[0], patientSSN[0]);
			Patient p2 = new Patient(patientName[1], patientSSN[1]);
			
			System.out.println();
			System.out.println("Two doctors created:");
			System.out.println();
			d1.writeOutput();
			System.out.println();
			d2.writeOutput();
			System.out.println();
			
			System.out.println("Two patiends created:");
			System.out.println();
			p1.writeOutput();
			System.out.println();
			p2.writeOutput();
			System.out.println();
			
			Billing b1 = new Billing(d1,p1);
			Billing b2 = new Billing(d1,p2);
			Billing b3 = new Billing(d2,p1);
			
			System.out.println("Three billing records created:");
			System.out.println();
			System.out.println("Verify 1st record:");
			System.out.println("Doctor Name: Spock");
			System.out.println("Patient Name: Calvin");
			System.out.println("Billing Amount: $200.00");
			System.out.println();
			b1.writeOutput();
			System.out.println("===============================");
			
			System.out.println();System.out.println("Verify 2nd record:");
			System.out.println("Doctor Name: Spock");
			System.out.println("Patient Name: Hobbes");
			System.out.println("Billinb Amount $200.00");
			System.out.println();
			b2.writeOutput();
			System.out.println();
			System.out.println("===============================");
			
			System.out.println();
			System.out.println("Verify 3rd record:");
			System.out.println("Doctor Name: Doolittle");
			System.out.println("Patient Name: Calvin");
			System.out.println("Billing Amount: $175:00");
			System.out.println();
			b3.writeOutput();
			System.out.println();
			System.out.println("===============================");
			
			System.out.println();
			System.out.println("Verify total billable = $575");
			System.out.println();
			System.out.println();
			System.out.println("TOTAL BILLABLE DOLLARS");
			System.out.println("----------------------");
			double totalAmount = b1.getBillingAmount() + b2.getBillingAmount() + b3.getBillingAmount();
			System.out.println(currency.format(totalAmount));
			
			System.out.println("Do again? (Y for Yes, N for No)");
			repeat = keyboard.next().charAt(0);
		}while ((repeat == 'y') || (repeat == 'Y'));
	}

}
