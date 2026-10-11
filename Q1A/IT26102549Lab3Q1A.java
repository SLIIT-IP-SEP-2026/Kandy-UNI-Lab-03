import java.util.Scanner;

public class IT26102549Lab3Q1A{
	
	public static void main(String[] args){
		
		double pricePerkg,numberOfKilograms,totalAmount;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Enter the price of 1kg of rice");
		pricePerkg = sc.nextDouble();
		
		System.out.println ("Enter the number of kilograms you want to buy");
		numberOfKilograms = sc.nextDouble();
		
		totalAmount = pricePerkg * numberOfKilograms ;
		System.out.println ("The total amount is " + totalAmount);
		
	sc.close();
		
	
	}
	
	
}