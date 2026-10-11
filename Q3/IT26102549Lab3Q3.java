import java.util.Scanner;

	public class IT26102549Lab3Q3{
	
		public static void main(String[] arg){
			
			int Amount;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Rupee amount:");
			Amount = sc.nextInt();
			
			System.out.println("5000 Notes - "+ Amount/5000);
			Amount = Amount%5000 ;
			System.out.println("1000 Notes - "+ Amount/1000);
			Amount = Amount%1000 ;
			System.out.println("500 Notes - "+ Amount/500);
			Amount = Amount%500 ;
			System.out.println("200 Notes - "+ Amount/200);
			Amount = Amount%200 ;
			System.out.println("100 Notes - "+ Amount/100);
			Amount = Amount%100 ;
			System.out.println("50 Notes - "+ Amount/50);
			Amount = Amount%50 ;
			System.out.println("20 Notes - "+ Amount/20);
			Amount = Amount%20 ;
			System.out.println("10 Coins - "+ Amount/10);
			Amount = Amount%10 ;
			System.out.println("05 Coins - "+ Amount/5);
			Amount = Amount%5 ;
			System.out.println("02 Coins - "+ Amount/2);
			Amount = Amount%2 ;
			System.out.println("01 Coins - "+ Amount/1);
			
			
			sc.close();
		}
	
	
	}