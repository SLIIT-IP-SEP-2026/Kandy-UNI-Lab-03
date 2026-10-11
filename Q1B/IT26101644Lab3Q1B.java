import java.util.Scanner;

public class IT26101644Lab3Q1B{
	
	
	public static void main(String[] args){
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double price = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want: ");
		double kg = input.nextDouble();
		
		
		double amount = kg*price;
		double discount = amount*10/100;
		double bill = amount - discount;
		
		
		System.out.print("The total amount with 10% discount is: " + bill);
		
		
	
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}