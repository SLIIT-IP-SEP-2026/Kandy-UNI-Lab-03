import java.util.Scanner;

public class IT26102418Lab3Q1A {
	public static void main (String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the price of 1kg of rice:");
		double pricePerKg = sc.nextDouble();
		
		System.out.println("Enter the number of kilograms you want to buy:");
		double quantity = sc.nextDouble();
		
		double totalAmount = pricePerKg*quantity;
		
		System.out.println("Total amount is:" + totalAmount);
		
		
	}
}
		