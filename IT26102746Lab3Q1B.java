import java.util.Scanner;

public class IT26102746Lab3Q1B {
	public static void main(String[] args)
	{
		
		Scanner sc = new 
	Scanner(System.in);
        
        System.out.print("Enter the price of 1kg of rice: ");
        double price = sc.nextDouble();

        System.out.print("Enter the number of kilograms you want buy:");
        double kg = sc.nextDouble();

        double total = price * kg;
        
        if(total > 5000){
            total = total * 0.9; // 10% discount
		}

        System.out.println("The total amount after discount is: " + total);
	}
}	