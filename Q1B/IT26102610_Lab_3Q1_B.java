import java.util.Scanner;

public class IT26102610_Lab_3Q2{

	public static void main(String[] args){
	
		double pricePerKg , quantity , totalAmount , discount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the  price Per Kg of rice : ");
		
		pricePerKg = input.nextDouble();
		
		System.out.println("Enter the number of Kg do you want ; ");
		
		quantity = input.nextDouble();
		
		
		discount = (pricePerKg * quantity / 100)*10;
		
		System.out.println("Your discount price :"+discount);
		
		
		totalAmount = (pricePerKg *  quantity) - discount;
		
		System.out.println("your total Amount is :" + totalAmount);
		
	
	}
}