import java.util.Scanner;
public class IT26101588Lab3Q1A{

public static void main(String[] args){
Scanner input= new Scanner(System.in);

System.out.print("Enter the price of the 1kg of rice:");
double price = input.nextDouble();

System.out.print("Enter the number of kilograms you want to buy:");
int kg = input.nextInt();
Double total =price * kg;
System.out.println("Enter the total amount:" +total);














}
}