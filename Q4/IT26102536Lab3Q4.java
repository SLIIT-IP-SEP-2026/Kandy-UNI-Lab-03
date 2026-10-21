import java.util.Scanner;

public class IT26102536Lab3Q4 {

	public static void main (String[] args) {
	
	//Scanner object create
	Scanner input = new Scanner(System.in);
		
	//declare variables
	int no1, no2, no3, no4, no5;
	int entered_number;
	
	//get user input
	System.out.print("Enter a five-digit number: ");
	entered_number = input.nextInt();
	
	//extract numbers 
	no1 = entered_number/10000;
	
	no2 = entered_number/1000;
	no2 = no2%10;
	
	no3 = entered_number/100;
	no3 = no3%10;
	
	no4 = entered_number/10;
	no4 = no4%10;
	
	no5 = entered_number%10;
	
	
	//print final anwer
	System.out.print(no1 + " " + no2 + " " + no3 + " " + no4 + " " + no5);
	}
}