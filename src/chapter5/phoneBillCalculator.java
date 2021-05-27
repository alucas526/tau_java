package chapter5;

import java.util.Scanner;

public class phoneBillCalculator {

    // Initialize scanner
    static Scanner scanner = new Scanner(System.in);

    // Set overage price and tax rate
    static double minutesOverCost = 0.25;
    static double taxRate = 0.07;
    static double overageCost = 0;

    public static void main(String[] args) {
        // Determine base plan cost
        double basePlanCost = getBasePlanCost();

        // Determine plan minutes
        int planMinutes = getPlanMinutes();

        // Determine minutes used
        int minutesUsed = getMinutesUsed();

        // Determine overage
        int minutesOver = determineOverage(minutesUsed, planMinutes);

        // Calculate cost of overage
        if (minutesOver > 0){
            overageCost = determineOverageCost(minutesOver, minutesOverCost);
        }

        // Calculate subtotal
        double subtotal = basePlanCost + overageCost;

        // Calculate tax
        double tax = subtotal * taxRate;

        // Calculate total cost
        double totalCost = subtotal + tax;

        // Print itemized bill
        printStatement(basePlanCost, planMinutes, minutesOver, overageCost, subtotal, tax, totalCost);

    }

    public static double getBasePlanCost(){
        System.out.println("What is the base plan cost?");
        return scanner.nextDouble();
    }

    public static int getPlanMinutes(){
        System.out.println("How many minutes are in the current plan?");
        return scanner.nextInt();
    }

    public static int getMinutesUsed(){
        System.out.println("How many minutes were used this month?");
        return scanner.nextInt();
    }

    public static int determineOverage(int minutesUsed, int planMinutes){
        if (minutesUsed > planMinutes){
            return minutesUsed - planMinutes;
        }
        else {
            return 0;
        }
    }

    public static double determineOverageCost(double minutesOver, double minutesOverCost){
        return minutesOver * minutesOverCost;
    }

    public static void printStatement(double basePlanCost, int planMinutes, int minutesOver, double overageCost, double subtotal, double tax, double totalCost){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + basePlanCost);
        System.out.println("Minutes allotted: " + planMinutes);
        if (minutesOver > 0){
            System.out.println("Minutes over: " + minutesOver);
            System.out.println("Overage: $" + overageCost);
        }
        System.out.println("Subotal: " + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + totalCost);
    }

}
