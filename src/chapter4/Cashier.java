package chapter4;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {

        // Get number of items to scan:
        System.out.println("How many items will you be scanning?");
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();

        double total = 0;

        // Create loop to iterate through all items and calculate cost:
        for(int i = 0; i < numberOfItems; i++){
            System.out.println("Enter the price of the item:");
            double itemPrice = scanner.nextDouble();
            total = total + itemPrice;
        }

        scanner.close();
        System.out.println("The total price is $" + total);
    }
}
