package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

        // What we know:
        int rate = 15;
        int maxHours = 40;

        // Get number of hours:
        System.out.println("How many hours did you work this week (from 1- 40)?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Validate hours:
        while (hoursWorked > maxHours || hoursWorked < .1){
            System.out.println("Invalid entry. Hours must be between 1 and 40.");
            System.out.println("Please re-enter your hours:");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        // Calculate gross:
        double grossPay = hoursWorked * rate;
        System.out.println("Gross pay: $" + grossPay + ", based on the pay rate of $" + rate + " per hour and "
                + hoursWorked + " hours worked.");
    }
}
