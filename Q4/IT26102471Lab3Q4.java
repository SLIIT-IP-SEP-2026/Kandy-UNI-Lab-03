import java.util.Scanner;

public class IT26102471Lab3Q4{
    public static void main(String[] args){
	  Scanner input=new Scanner(System.in);
	  
	  System.out.print("Enter a five-digit number: ");
	  int number=input.nextInt();
	  
	  int a1=number/10000;
	  int a2=(number/1000)%10;
	  int a3=(number/100)%10;
	  int a4=(number/10)%10;
	  int a5=number%10;
	  
	  System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5);
	  
	  input.close();
	}
}	