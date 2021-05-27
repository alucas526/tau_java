package chapter3;

// Logical Operators
// To qualify for a loan, a person must make at least $30,000/year, and they need to have been
// working at their current job for at least two (2) years.

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String[] args) {

        // Set variables for minimum salary and minimum years required at current job:
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // Ask user for current salary:
        System.out.println("Welcome to the Loan Application Processor (LAP)!");
        System.out.println("What is your current salary?");
        Scanner scanner = new Scanner(System.in);
        double currentSalary = scanner.nextDouble();
        System.out.println("How long have you been employed at your current job?");
        double currentYearsEmployed = scanner.nextDouble();

        // Determine if salary meets requirements:
        if(currentSalary >= requiredSalary && currentYearsEmployed >= requiredYearsEmployed){
            System.out.println("Congratulations! You qualify for a loan!");
        }
        else{
            System.out.println("You do not qualify for a loan.");
        }

    }
}
