package chapter3;

// Nested If Statements
// To qualify for a loan, a person must make at least $30,000/year, and they need to have been
// working at their current job for at least two (2) years.

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {

        // Set variables for minimum salary and minimum years required at current job:
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // Ask user for current salary:
        System.out.println("Welcome to the Loan Application Processor (LAP)!");
        System.out.println("What is your current salary?");
        Scanner scanner = new Scanner(System.in);
        double currentSalary = scanner.nextDouble();

        // Determine if salary meets requirements:
        if(currentSalary >= requiredSalary){
            // Determine if user has been employed long enough at their current job:
            System.out.println("How many years have you been employed at your current job?");
            double currentYearsEmployed = scanner.nextDouble();
            scanner.close();
            if(currentYearsEmployed >= requiredYearsEmployed){
                System.out.println("Congratulations! You qualify for a loan!");
            }
            else{
                System.out.println("You do not qualify for a loan. You must be employed for at least "
                        + requiredYearsEmployed + " years at your current job.");
            }
        }
        else{
            System.out.println("You do not qualify for a loan. The minimum required salary is $"
                    + requiredSalary + ".00.");
        }

    }
}
