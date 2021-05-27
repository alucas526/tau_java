package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        // MadLibs, wherein we ask for an adjective, a season, and number, and then we take
        // those inputs and insert them into a predefined string and display the results.

        // Ask the user for an adjective.
        System.out.println("Welcome to MadLibs!");
        System.out.println("Please enter and adjective:");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.next();

        // Ask the user for a season.
        System.out.println("Please enter a season:");
        String season = scanner.next();

        // Ask the user for a number.
        System.out.println("Please enter a whole number:");
        int cupsOfCoffee = scanner.nextInt();

        // Print the results.
        System.out.println("Here are your results:");
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + cupsOfCoffee + " cups of coffee.");

    }
}
