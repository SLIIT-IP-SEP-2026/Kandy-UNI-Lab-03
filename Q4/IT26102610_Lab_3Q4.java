import java.util.Scanner ;
public class IT26102610_Lab_3Q4{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a five digit number : ");
	int number = input.nextInt();
	
	int D1 , D2 , D3 , D4 , D5 ;
	
	D1 = number / 10000;
	number = number % 10000;
	
	D2 = number/ 1000;
	number = number % 1000;
	
	D3 = number / 100;
	number = number % 100;
	
	D4 = number / 10;
	D5 = number % 10;
	
	System.out.println(D1 + " " + D2 + " " + D3 + " " + D4 + " " + D5 );
	
	
	}
}