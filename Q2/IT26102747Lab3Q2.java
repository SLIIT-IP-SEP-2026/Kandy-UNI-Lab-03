
import java.util.Scanner;

public class IT26102747Lab3Q2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double salary,otHours,otRate,otAmount, totalSalary;
		
		System.out.println("Enter monthly salary: ");
		salary = input.nextDouble();
		
		System.out.println("Enter OT hours: ");
		otHours = input.nextDouble();
		
		System.out.println("Enter OT hourly rate: ");
		otRate = input.nextDouble();
		
		otAmount = otHours*otRate;
		
		totalSalary = salary + otAmount;
		
		System.out.println("OT Amount: " + otAmount);
		
		System.out.println("Total Salary: "+ totalSalary);
		
		  input.close();
		  
	}
}
		
		
		