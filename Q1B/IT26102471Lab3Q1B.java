import java.util.Scanner;

public class IT26102471Lab3Q1B{
	
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the price of 1kg of rice:");
		double price=input.nextDouble();
		System.out.println("Enter the number of kilograms you want to buy:");
		double kg=input.nextDouble();
		
		double total=price*kg;
		
		double discount=total*10/100;
		double bill=total-discount;
		System.out.println("The total amount with10% discount is:" + bill);
	}
}	
	
	