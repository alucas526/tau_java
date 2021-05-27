package chapter4;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        // Init scanner, define sentinel:
        Scanner scanner = new Scanner(System.in);
        boolean again = false;

        do{
            // Ask user for numbers:
            System.out.println("Please enter a number:");
            double firstNumber = scanner.nextDouble();
            System.out.println("Please enter a second number:");
            double secondNumber = scanner.nextDouble();

            // Calculate sum:
            double sumOfNumbers = firstNumber + secondNumber;
            System.out.println("The sum of " + firstNumber +  " and " + secondNumber + " is " + sumOfNumbers + ".");

            // Ask user if they want to sum more numbers:
            System.out.println("Would you like to add some more numbers (Y/N)?");
            char userReply =  scanner.next().charAt(0);
            if(userReply == 'Y' || userReply == 'y'){
                again = true;
            }
            else {
                again = false;
            }
        } while (again);

        scanner.close();
        System.out.println("Hope you had fun adding numbers!");

    }
}
