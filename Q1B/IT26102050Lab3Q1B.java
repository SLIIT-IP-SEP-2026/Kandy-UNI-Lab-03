import java.util.Scanner;

public class IT26102050Lab3Q1B {
	
	public static void main(String[] args) {
		
		double price,NumofKilo,totalamount,totaldiscout,finalamount;
		double discout = 0.10;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter price of 1KG of rice : ");
		price = input.nextDouble();
		System.out.println("Enter the number of kilograms you want to buy : ");
		NumofKilo = input.nextDouble();
		
		totalamount = price * NumofKilo;
		totaldiscout = totalamount * discout;
		finalamount = totalamount - totaldiscout;
	
	System.out.println("The total amount is: " +totalamount);	
	System.out.println("The total amount with 10% discout is: " +finalamount);
	}
}	