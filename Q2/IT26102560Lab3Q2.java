import java.util.Scanner;

public class IT26102560Lab3Q2 {
	public static void main(String[] args) {
		
	double OTamount;
	double OThours;
	double OTrate;
	double MonthlySalary;
	double TotalSalary;
	double OTHourlyRate;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter The Salary Amount:");
	MonthlySalary=input.nextDouble();
	System.out.println("Enter The Number Of OThours:");
	OThours=input.nextDouble();
	System.out.println("Enter The OTHourlyRate:");
	OTHourlyRate=input.nextDouble();
	
	OTamount = OThours * OTHourlyRate;
	TotalSalary = MonthlySalary + OTamount;
	
	System.out.println("The total salary including OT is:" + TotalSalary);
	}
	


	

}
	

	
	