import java.util.Scanner;

public class IT26101292Lab3Q2{
	public static void main(String[] args){
		double monthly; //monthly salary
		double othours; //over time hours
		double perot; //per OT rate 
		double total; //total salary
		double otamount; // OT amount
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the monthly salary:");
		monthly= input.nextDouble();
		
		
		System.out.println("Enter the number OT hours:");
		othours=input.nextDouble();
		
		System.out.println("Enter the OT hourly rate:");
		perot=input.nextDouble();
		
		otamount=othours*perot;
		
		total=monthly+otamount;
		
	
		
		System.out.println("total amount to is:"+total);
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
