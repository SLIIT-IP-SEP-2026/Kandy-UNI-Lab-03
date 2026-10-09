import java.util.Scanner;

public class IT26101654Lab3Q1A {
    public static void main(String[] args) {
		
		double pricePerKg, quantity, totalAmount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the price of 1kg of rice:");
		
		pricePerKg = input.nextDouble();

		System.out.println("Enter the number of kilograms you want to buy:");
		
		quantity = input.nextDouble();
		
		totalAmount = pricePerKg * quantity;
		
		System.out.println("The total amount is:" +totalAmount);
		
    }
}