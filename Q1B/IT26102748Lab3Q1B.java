import java.util.Scanner;

public class IT26102748Lab3Q1B{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice:" );
		double price_of_1kg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:" );
		double no_of_kg = input.nextDouble();
		
		double amount = (price_of_1kg * no_of_kg);
		double newAmount = amount * 90/100;
		
		System.out.println("\nThe total amount with 10% discount is:" + newAmount);
		
		
	}
}	
	

