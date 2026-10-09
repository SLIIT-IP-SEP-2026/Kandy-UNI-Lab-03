import java.util.Scanner;
public class IT26102709Lab3Q2{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the mounthly salary:");
	double salary = input.nextDouble();
	System.out.print("Enter the OT hours:");
	double hours = input.nextDouble();
	System.out.print("Enter the OT rate:");
	double rate = input.nextDouble();

	
	double Amount = hours*rate; 
	double Total =Amount + salary;
	
	System.out.println("The total salary:"+Total);
	input.close();
}
}
