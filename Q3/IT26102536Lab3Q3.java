import java.util.Scanner;

public class IT26102536Lab3Q3 { 

	public static void main (String[] args) {
	
	//Scanner object create
	Scanner input = new Scanner(System.in);
	
	//declare variables
	int value5000;
	int value1000;
	int value500;
	int value200;
	int value100;
	int value50;
	int value20;
	int value10;
	int value05;
	int value02;
	int value01;
	double amount;
	
	//Input the rupee amount
	System.out.print("Enter the Rupee amount: ");
	amount = input.nextDouble();
	 
	 //calculations
	 value5000 = (int)amount / 5000;
	 amount = amount%5000;
	 
	 value1000 = (int)amount / 1000;
	 amount = amount % 1000;
	 
	 value500 = (int)amount / 500;
	 amount = amount % 500;
	 
	 value200 = (int)amount / 200;
	 amount = amount % 200;
	 
	 value100 = (int)amount / 100;
	 amount = amount % 100;
	 
	 value50 = (int)amount / 50;
	 amount = amount % 50;
	 
	 value20 = (int)amount / 20;
	 amount = amount % 20;
	 
	 value10 = (int)amount / 10;
	 amount = amount % 10;
	 
	 value05 = (int)amount / 05;
	 amount = amount % 05;
	 
	 value02 = (int)amount / 02;
	 amount = amount % 02;
	 
	 value01 = (int)amount / 01;
	 amount = amount % 01;
	 
	 
	 //print  
	 
	 System.out.println("5000 Notes - " +value5000); 
	 System.out.println("1000 Notes - " +value1000);
	 System.out.println("500 Notes - " +value500);
	 System.out.println("200 Notes - " +value200); 
	 System.out.println("100 Notes - " +value100);
	 System.out.println("50 Notes - " +value50);
	 System.out.println("20 Notes - " +value20); 
	 System.out.println("10 Coins - " +value10);
	 System.out.println("05 Coins - " +value05); 
	 System.out.println("02 Coins - " +value02);
	 System.out.println("01 Coins - " +value01);
	}
}