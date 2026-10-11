import java.util.Scanner;

	public class IT26102549Lab3Q4{
		
		public static void main(String[] args){
		
		int number,a,b,c,d,e ; 
		
		Scanner sc = new Scanner(System.in);
        
			System.out.println("Enter a five-digit number : ");
			number = sc.nextInt();
			
			a = number/10000;
			b = (number-(a*10000))/1000;
			c = (number-(a*10000+b*1000))/100;
			d = (number-(a*10000+b*1000+c*100))/10;
			e = (number-(a*10000+b*1000+c*100+d*10));
			
			System.out.println(a+" "+b+" "+c+" "+d+" "+e);
			
		sc.close();
			
		}
		
	}