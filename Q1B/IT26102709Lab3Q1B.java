import java.util.Scanner;
public class IT26102709Lab3Q1B{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the amount of the total bill:");
double total = input.nextDouble();

double sum = total * 90/100;

System.out.print("The amount you have to pay:"+ sum);
input.close();
}
}

  