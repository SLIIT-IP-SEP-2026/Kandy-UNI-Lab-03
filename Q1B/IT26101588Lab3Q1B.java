import java.util.Scanner;
public class IT26101588Lab3Q1B{

public static void main(String[] args){
Scanner input= new Scanner(System.in);

System.out.print("Enter the price of the 1kg of rice:");
double price = input.nextDouble();

System.out.print("Enter the number of kilograms you want to buy:");
double kg = input.nextDouble();

double total =price * kg;
double discounted= total-(total*10/100);


System.out.println("Enter the total amount:" +total);
System.out.println("The total amount with 10% discount is:" +discounted);
}
}

