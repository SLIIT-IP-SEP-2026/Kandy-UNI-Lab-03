import java.util.Scanner;
public class IT26102746Lab3Q2 {
	public static void main(String[] args)
	{
		Scanner sc = new 
Scanner(System.in);
        System.out.print("Enter marks 1: ");

		int m1 = sc.nextInt();
		System.out.print("Enter mark 2: ");
		
		int m2 = sc.nextInt();
		System.out.print("Enter marks 3: ");
		
		int m3 = sc.nextInt();
		double avg = (m1 + m2 + m3) / 3.0;
		System.out.println("Average is: " + avg);
		
		if(avg >= 50){
			System.out.println("Pass");
		} else { 
		    System.out.println("Fail");
		}
	}
}