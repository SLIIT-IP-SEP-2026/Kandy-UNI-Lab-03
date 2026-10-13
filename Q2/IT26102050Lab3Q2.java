import java.util.Scanner;

public class IT26102050Lab3Q2 {

    public static void main(String[] args) {

        double monthlySalary, otHours, otHourlyRate, otAmount, totalSalary;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly salary:");
        monthlySalary = input.nextDouble();

        System.out.println("Enter the number of ot hours : ");
        otHours = input.nextDouble();

        System.out.println("Enter the ot hourly rate : ");
        otHourlyRate = input.nextDouble();

        otAmount = otHours * otHourlyRate;

        totalSalary = monthlySalary + otAmount;
        
        System.out.println("The total salary including ot amount is : " + totalSalary);
    }
}