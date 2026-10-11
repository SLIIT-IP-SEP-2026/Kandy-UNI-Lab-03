import java.util.Scanner;
public class IT26102418Lab3Q3 {
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Rupee amount:");
		int amount = sc.nextInt();
		
		int notes5000 = amount/5000;
		amount = amount%5000;
		System.out.println("5000 Notes - " + notes5000);
		
		int notes1000 = amount/1000;
		amount = amount%1000;
		System.out.println("1000 Notes - " + notes1000);
		
		int notes500 = amount/500;
		amount = amount%500;
		System.out.println("500 Notes - " + notes500);
		
		int notes200 = amount/200;
		amount = amount%200;
		System.out.println("200 Notes - " + notes200);
		
		int notes100 = amount/100;
		amount = amount%100;
		System.out.println("100 Notes - " + notes100);
		
		int notes50 = amount/50;
		amount = amount%50;
		System.out.println("50 Notes - " + notes50);
		
		int notes20 = amount/20;
		amount = amount%20;
		System.out.println("20 Notes - " + notes20);
		
		int coins10 = amount/10;
		amount = amount%10;
		System.out.println("10 Coins - " + coins10);
		
		int coins5 = amount/5;
		amount = amount%5;
		System.out.println("05 Coins - " + coins5);
		
		int coins2 = amount/2;
		amount = amount%2;
		System.out.println("02 Coins - " + coins2);
		
		int coins1 = amount;
		System.out.println("01 Coins - " + coins1);
	}
}
		
		
		