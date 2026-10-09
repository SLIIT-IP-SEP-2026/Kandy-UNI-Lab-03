import java.util.Scanner;

public class IT26101292Lab3Q4{
	public static void main(String[] args){
		int amount,n1,n2,n3,n4,n5;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a five-digit nummber:");
		amount=input.nextInt();
		
		
	    n1=amount/10000;
		amount=amount%10000;
		
		 n2=amount/1000;
		amount=amount%1000;
		
		  n3=amount/100;
		amount=amount%100;
		
		 n4=amount/10;
		amount=amount%10;
		
		 n5=amount/1;
		amount=amount%1;
		
		System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5);
		
		
		
		
		
		
	}
	
	
	
	
}