import java.util.Scanner;

public class IT26102560Lab3Q1A{
	public static void main(String[] args) {
		double priceperKg;
		double quantity;
		double TotalAmount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the price of 1kg of rice : ");
		priceperKg = input.nextDouble();
		
		System.out.println("Enter the number of kilograms you need to buy : ");
		quantity = input.nextDouble();
		
		TotalAmount = priceperKg * quantity;
		
		System.out.println("The total amoint is :"+ TotalAmount);
	}

}	