import java.util.Scanner;

public class IT26102050Lab3Q4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a five digit number: ");
        int num = input.nextInt();
        
        int d1 = num / 10000;
        int rem1 = num % 10000;
        
        int d2 = rem1 / 1000;
        int rem2 = rem1 % 1000;
        
        int d3 = rem2 / 100;
        int rem3 = rem2 % 100;
        
        int d4 = rem3 / 10;
        int d5 = rem3 % 10;
        
        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
    }
}