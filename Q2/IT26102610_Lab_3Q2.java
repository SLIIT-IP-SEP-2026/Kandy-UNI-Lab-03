import java.util.Scanner;
public class IT26102610_Lab_3Q2{

	public static void main(String[] args){
	
	double Monthly_Salary , OT_Hours , OT_Hourly_Rate , OT_Amount , Total_Salary;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter your Monthly_Salary : ");
	Monthly_Salary = input.nextDouble();
	
	System.out.println("Enter Your OT_Hours  : ");
	OT_Hours = input.nextDouble();
	
	System.out.println("Enter Your OT_Hourly_Rate : ");
	OT_Hourly_Rate = input.nextDouble();
	
	OT_Amount = OT_Hourly_Rate * OT_Hours;
	Total_Salary = Monthly_Salary + OT_Amount;
	
	System.out.println("Your Total_Salary Including OT_Amount : " + Total_Salary);
  }
		
}