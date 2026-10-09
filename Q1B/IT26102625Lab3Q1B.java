import java.util.Scanner;

public class IT26102625Lab3Q1B{
	public static void main(String[]args){
		
	double firstprice , quantity , totalprice , discount ;
    Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the price of 1kg of rice:");
	firstprice = input.nextDouble();
	
    System.out.println("Enter the number of kilograms you want to buy:");
	quantity = input.nextDouble();
	
	discount = (10/100.0) * firstprice ;
	totalprice = (firstprice - discount) * quantity ;

		
	System.out.println("The total amount with 10% discount is:" +totalprice);
			
			
	}	
}