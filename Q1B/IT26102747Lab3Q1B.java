 import java.util.Scanner;
 
 public class IT26102747Lab3Q1B {
	 
	 public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
		 
		 double price,kg,total,discount,finalAmount;
		 
		 System.out.println("Enter the price of 1kg of rice: ");
		 
		 price = input.nextDouble();
		 
		 System.out.println("Enter the number of kilograms: ");
		 
		 kg = input.nextDouble();
		 
		 total = price*kg;
		 
		 discount = total*10/100;
		 
		 finalAmount = total - discount;
		 
		 System.out.println("Total amount: " + total);
		 System.out.println("Discount:" + discount);
		 System.out.println("Amount to pay:" + finalAmount);
		 
		    input.close();
	 }
 }