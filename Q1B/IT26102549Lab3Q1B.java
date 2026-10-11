import java.util.Scanner;

 public class IT26102549Lab3Q1B{
	 
	public static void main(String[] args){
		
		double pricePerkg,numberOfkg,totalAmount,discount,finalAmount;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the price of 1kg of rice");
		pricePerkg = sc.nextDouble();
		
		System.out.println("Enter the number of kilograms you want to buy");
		numberOfkg = sc.nextDouble();
		
		totalAmount = pricePerkg * numberOfkg ;
		System.out.println("Total Amount: "+totalAmount);
		
		discount = totalAmount * (0.1) ;
		
		finalAmount = totalAmount - discount ;
		System.out.println("Total Amount with 10% discount: "+finalAmount);
		
		
	sc.close();
		
		
		
	}
	
	 
 }