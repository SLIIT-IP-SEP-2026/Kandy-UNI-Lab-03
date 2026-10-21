import java.util.Scanner;

public class IT26102536Lab3Q1B {
	
	public static void main(String[] args) {
		
		//Scanner object create
		Scanner input = new Scanner(System.in);
		
		//declare variables
		double price, qty, discount, total, final_amount;
		
		//Get user inputs
		System.out.print("Enter the price of 1kg: " );
		price = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:  ");
		qty = input.nextDouble ();
		
		//Calculate Total amount
		total = price*qty;
		
		//Calculate Total Discount
		discount = total*0.1;
		
		//Final Amount
		final_amount = total - discount;
		
		//Print total amount after discount
		System.out.print("\nThe total amount with 10% discount is: " +final_amount);
		
		
	
	}
}