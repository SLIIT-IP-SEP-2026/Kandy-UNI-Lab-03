import java.util.Scanner;

public class IT26102418Lab3Q4 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a five-digit number:");
		int number = sc.nextInt();
		
		int digit1 = number/10000;
		number = number%10000;
		
		int digit2 = number/1000;
		number = number%1000;
		
		int digit3 = number/100;
		number = number%100;
		
		int digit4 = number/10;
		number = number%10;
		
		int digit5 = number;
		
		System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
	}
}
		
		