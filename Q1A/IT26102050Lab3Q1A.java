import java.util.Scanner;

public class IT26102050Lab3Q1A {
	
	public static void main(String[] args) {
		
		double price,Num_of_Kilo,total_amount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter price of 1KG of rice : ");
		price = input.nextDouble();
		System.out.println("Enter the number of kilograms you want to buy : ");
		Num_of_Kilo = input.nextDouble();
		
		total_amount = price * Num_of_Kilo;
		
	System.out.println("The total amount is: " +total_amount);
	}
}	