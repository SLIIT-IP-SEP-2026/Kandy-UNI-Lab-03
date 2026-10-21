import java.util.Scanner;

public class IT26102536Lab3Q1A {
	
	public static void main(String[] args){
		
		//Scanner object create
		Scanner input = new Scanner(System.in);
		
		//declare variables
		double price, qty, total;
		
		//Get user inputs
		System.out.print("Enter the price of 1kg: " );
		price = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:  ");
		qty = input.nextDouble ();
		
		//Calculate Total amount
		total = price*qty;
		
		//Print total amount
		System.out.print("\nThe total amount is: " +total);
		
		
	
	}
}