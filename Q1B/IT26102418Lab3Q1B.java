import java.util.Scanner;

public class IT26102418Lab3Q1B {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the price of 1Kg of rice:");
		double pricePer1Kg = sc.nextDouble();
		
		System.out.println("Enter the number of kilograms you want to buy:");
		double quantity = sc.nextDouble();
		
		double amount = pricePer1Kg*quantity;
		double discount = amount*10/100;
		double totalAmount = amount-discount;
		
		System.out.println("Total amount with 10% discount:" + totalAmount);
	}
}
		