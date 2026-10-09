import java.util.Scanner;

public class IT26101292Lab3Q3{
	public static void main(String[] args){
		int amount,note5000,note1000,note500,note200,note100,note50,note20,note10,note05,note02,note01;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Rupee amount:");
		amount=input.nextInt();
		
		note5000=amount/5000;
		System.out.println("5000 Notes:"+note5000);
		amount=amount%5000;
		
		note1000=amount/1000;
		System.out.println("1000 Notes:"+note1000);
		amount=amount%1000;
		
		note500=amount/500;
		System.out.println("500 Notes:"+note500);
		amount=amount%500;
		
		note200=amount/200;
		System.out.println("200 Notes:"+note200);
		amount=amount%200;
		
		note100=amount/100;
		System.out.println("100 Notes:"+note100);
		amount=amount%100;
		
		note50=amount/50;
		System.out.println("50 Notes:"+note50);
		amount=amount%50;
		
		note20=amount/20;
		System.out.println("20 Notes:"+note20);
		amount=amount%20;
		
		note10=amount/10;
		System.out.println("10 Notes:"+note10);
		amount=amount%10;
		
		note05=amount/5;
		System.out.println("05 Notes:"+note05);
		amount=amount%5;
		
		note02=amount/2;
		System.out.println("02 Notes:"+note02);
		amount=amount%2;
		
		note01=amount/1;
		System.out.println("01 Notes:"+note01);
		amount=amount%1;
	}
	
	
	
	
}