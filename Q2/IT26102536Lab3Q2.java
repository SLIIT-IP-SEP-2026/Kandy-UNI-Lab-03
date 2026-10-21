import java.util.Scanner;

public class IT26102536Lab3Q2 {
	
	public static void main(String[] args) {
		
		//Scanner object create
		Scanner input = new Scanner(System.in);
		
		//declare variables
		double monthly_salary, ot_amount, ot_hours, ot_hourly_rate, total_salary;
		
		//Get user inputs
		System.out.print("Enter the monthly salary: ");
		monthly_salary = input.nextDouble();
		
		System.out.print("Enter the number of OT hours:  ");
		ot_hours = input.nextDouble ();
		
		System.out.print("Enter the OT hourly rate:  ");
		ot_hourly_rate = input.nextDouble ();
		
		//Calculate OT amount
		ot_amount = ot_hours*ot_hourly_rate;
		
		//Calculate Total Salary
		total_salary = monthly_salary + ot_amount;
		
			
		//Print total salary including OT
		System.out.print("\nThe total salary including OT: " +total_salary);
		
		
	
	}
}