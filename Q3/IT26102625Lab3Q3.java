import java.util.Scanner;

public class IT26102625Lab3Q3{
	public static void main (String[]args){
		
	Scanner ee = new Scanner (System.in);

	int amount ;
	int a , b , c , d , e , f , g , h , i , j , k  ;
	 
	 System.out.println("Enter the rupee amount:");
	 amount = ee.nextInt();
	 
	a = amount / 5000 ;
	System.out.println("5000 Notes="+a);
	amount = amount % 5000 ;
	
	b = amount / 1000 ;
	System.out.println("1000 Notes="+b);
	amount = amount % 1000 ;
	
	c = amount / 500 ;
	System.out.println("500 Notes="+c);
	amount = amount % 500 ;
	
	d = amount / 200 ;
	System.out.println("200 Notes="+d);
	amount = amount % 200 ;
	
	e = amount / 100 ;
	System.out.println("100 Notes="+e);
	amount = amount % 100 ;
	
	f = amount / 50 ;
	System.out.println("50 Notes="+f);
	amount = amount % 50 ;
	
	g = amount / 20 ;
	System.out.println("20 Notes="+g);
	amount = amount % 20 ;
	
	h = amount / 10 ;
	System.out.println("10 coins="+h);
	amount = amount % 10 ;
	
	i = amount / 5 ;
	System.out.println("5 coins="+i);
	amount = amount % 5 ;
	
	j = amount / 2 ;
	System.out.println("2 coins="+j);
	amount = amount % 2 ;
	
	k = amount ;
	System.out.println("1 coins="+k);	
		
		 
		
		 
		
         
	   
	     
		 
		 
		 
		 
		
		
		
		
	}
}