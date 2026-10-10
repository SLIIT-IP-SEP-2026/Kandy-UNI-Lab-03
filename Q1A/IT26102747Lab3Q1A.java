
import java.util.Scanner;

public class IT26102747Lab3Q1A {
 
  public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
  
     double price,kg,total;
	 
	 System.out.println("Enter the price of 1kg of rice: ");
     
	 price = input.nextDouble();
	 
	 System.out.println("Enter the number of kilograms: ");
	 
	    kg = input.nextDouble();
		
		total = price*kg;
		
		System.out.println("Total amount to pay: " + total);
		
		input.close();
		
  }
}
