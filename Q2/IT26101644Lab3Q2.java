import java.util.Scanner;

public class IT26101644Lab3Q2 {
	
	
		public static void main(String[] args){
			
			double monthlySalary, otHours, otHourlyRate, otAmount, totalSalay;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the monthly salary: ");
			
			monthlySalary = input.nextDouble();
			
			System.out.println("Enter the number of hours: ");
			otHours = input.nextDouble();
			
			System.out.println("Enter the ot Hourly rate: ");
			otHourlyRate = input.nextDouble();
			
			otAmount = otHours * otHourlyRate;
			
			
			totalSalay = monthlySalary + otAmount;

System.out.println("The total salary including OT is : " + totalSalay );			
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
