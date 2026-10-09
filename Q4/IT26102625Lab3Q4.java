import java.util.Scanner;

public class IT26102625Lab3Q4{
	public static void main (String[]args){
		
	Scanner ss = new Scanner(System.in);
    int amount , a , b , c , d , e ;

    System.out.println("Enter a five-digit number:");
    amount = ss.nextInt();
	
	a = amount / 10000 ;
	amount = amount % 10000 ;
	b = amount / 1000 ;
	amount = amount % 1000 ;
	c = amount / 100 ;
	amount = amount % 100 ;
	d = amount / 10 ;
	amount = amount % 10 ;
	e = amount ;
	
	
		
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
		
		
		
		
  }
}