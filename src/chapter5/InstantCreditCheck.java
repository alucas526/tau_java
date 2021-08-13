package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

    // Set minimum requirements:
    static double minimumSalary = 25000;
    static int minimumCreditScore = 700;

    // Initialize Scanner:
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Ask user current salary and credit score:
        double userSalary = getUserSalary();
        int userCreditScore = getUserCreditScore();
        scanner.close();

        // Check eligibility
        boolean userEligibility = isUserEligible(userSalary, userCreditScore);

        // Notify the user of eligibility:
        informUser(userEligibility);

    }

    public static double getUserSalary(){

        // Ask user for current salary:
        System.out.println("What is your current salary?");
        double userSalary = scanner.nextDouble();
        return userSalary;

    }

    public static int getUserCreditScore(){

        // Ask user for current credit score:
        System.out.println("What is your credit score?");
        int userCreditScore = scanner.nextInt();
        return userCreditScore;

    }

    public static boolean isUserEligible(double userSalary, int userCreditScore){
        if (userSalary >= minimumSalary && userCreditScore >= minimumCreditScore){
            return true;
        } else {
            return false;
        }
    }

    public static void informUser(boolean userEligibility){
        if(userEligibility){
            System.out.println("Congratulations! You're approved!");
        } else{
            System.out.println("We're sorry, your application was rejected.");
        }

    }

}
