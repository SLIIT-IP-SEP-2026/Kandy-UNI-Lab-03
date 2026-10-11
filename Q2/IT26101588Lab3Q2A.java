import java.util.Scanner;

public class IT26101588Lab3Q2A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly salary:");
        double salary = input.nextDouble();

        System.out.println("Enter the number of OT hours:");
        double otHours = input.nextDouble();

        System.out.println("Enter the OT hourly rate:");
        double otRate = input.nextDouble();

        double otAmount = otHours * otRate;

        double totalSalary = salary + otAmount;

        System.out.println("The total salary including OT is: " + totalSalary);

        
    }
}