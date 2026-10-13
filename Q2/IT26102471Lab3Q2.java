import java.util.Scanner;

public class IT26102471Lab3Q2 {
	public static void main(String[] args){
		
		double monthlySalary,Othours,OthourlyRate,OtAmount,TotalSalary;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the monthly salary:");
		monthlySalary=input.nextDouble();
		
		System.out.println("Enter the number of Ot hours:");
		
		Othours=input.nextDouble();
		System.out.println("Enter the OT hourly rate:");
		
		OthourlyRate=input.nextDouble();
		OtAmount=Othours*OthourlyRate;
		
		TotalSalary=monthlySalary+OtAmount;
		System.out.println("The total salary including ot amount is :"+TotalSalary);
	}
}	
		