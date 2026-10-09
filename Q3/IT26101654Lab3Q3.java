import java.util.Scanner;

public class IT26101654Lab3Q3{
	public static void main (String[]args){
		
	Scanner ee = new Scanner (System.in);

	int amount ;
	int a , b , c , d , e , f , g , h , i , j , k  ;
	 
	 System.out.println("Enter the rupee amount:");
	 amount = ee.nextInt();
	 
	a = amount / 5000 ;
	amount = amount % 5000 ;
	b = amount / 1000 ;
	amount = amount % 1000 ;
	c = amount / 500 ;
	amount = amount % 500 ;
	d = amount / 200 ;
	amount = amount % 200 ;
	e = amount / 100 ;
	amount = amount % 100 ;
	f = amount / 50 ;
	amount = amount % 50 ;
	g = amount / 20 ;
	amount = amount % 20 ;
	h = amount / 10 ;
	amount = amount % 10 ;
	i = amount / 5 ;
	amount = amount % 5 ;
	j = amount / 2 ;
	amount = amount % 2 ;
	k = amount ;
		
		
		 System.out.println("5000 Notes="+a);
		 System.out.println("1000 Notes="+b);
		 System.out.println("500 Notes="+c);
		 System.out.println("200 Notes="+d);
         System.out.println("100 Notes="+e);
	     System.out.println("50 Notes="+f);
	     System.out.println("20 Notes="+g);
		 System.out.println("10 coins="+h);
		 System.out.println("5 coins="+i);
		 System.out.println("2 coins="+j);
		 System.out.println("1 coins="+k);
		
		
		
		
	}
}
