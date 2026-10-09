import java.util.Scanner;

public class IT26101292Lab3Q1A{
	
	public static void main(String[] args){
		double priceperKg; //1Kg price
		double Kg; //how many Kg
		double pay; //amout of pay
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the price of 1Kg price:");
		priceperKg= input.nextDouble();
		
		System.out.println("Enter the number of kilograms you want to buy:");
		Kg=input.nextDouble();
		
		pay=Kg*priceperKg;
		
		System.out.println("total amount to is:"+pay);
		
		
		
		
		
		
		
		
	}
	
	
	

}