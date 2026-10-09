import java.util.Scanner;

public class IT26102625Lab3Q1A{
	public static void main(String[]args){
		
	double price , quantity ;
    Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the price of 1kg of rice:");
	price = input.nextDouble();
	
    System.out.println("Enter the number of kilograms you want to buy:");
	quantity = input.nextDouble();
	
	double total = price * quantity ;

		
	System.out.println("The total amount is:" +total);
		
		
		
		
		
		
		
		
		
		
	}	
}