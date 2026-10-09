import java.util.Scanner;

public class IT26101292Lab3Q1B{
	public static void main(String[] args){
		double priceperKg; //1Kg price
		double Kg; //how many Kg
		double total; //price without discount 
		double pay; //amout of pay
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the price of 1Kg price:");
		priceperKg= input.nextDouble();
		double discount = 0.1;
		
		System.out.println("Enter the number of kilograms you want to buy:");
		Kg=input.nextDouble();
		
		total=Kg*priceperKg;
		
		pay=total-(discount*total);
		
		System.out.println("total amount to is:"+pay);
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
