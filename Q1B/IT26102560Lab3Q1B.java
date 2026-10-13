import java.util.Scanner;

public class IT26102560Lab3Q1B{
	public static void main(String[] args) {
		double priceperKg;
		double quantity;
		double TotalAmount;
		double FinalAmount;
		double Discount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the price of 1kg of rice : ");
		priceperKg = input.nextDouble();
		
		System.out.println("Enter the number of kilograms you need to buy : ");
		quantity = input.nextDouble();
		TotalAmount = priceperKg * quantity;
		Discount= TotalAmount *10/100;
		FinalAmount = TotalAmount - Discount;
	
		System.out.println("The total amoint is :"+ TotalAmount);
		System.out.println("The Discount price is :"+ Discount);
		System.out.println("The Final Amount is :"+ FinalAmount);
	}

}	