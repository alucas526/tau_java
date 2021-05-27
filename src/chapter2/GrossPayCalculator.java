package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]) {

        // We're going to calculate gross pay based on hours worked multiplied by the hourly pay rate.
        // To do that, we need:
        // 1. Number of hours worked (hours)
        System.out.println("Enter the number of hours worked:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // 2. Hourly pay rate (rate)
        System.out.println("Enter the pay rate:");
        double rate = scanner.nextDouble();
        scanner.close();

        // 3. hours multiplied by rate (grossPay)
        double grossPay = hours * rate;

        // We'll then display grossPay.
        System.out.println("Gross Pay is $" + grossPay);

    }
}
