package chapter3;

// If Else
// All salespeople are expected to reach a quota of ten (10) sales per week.
// Those who reach the quota receive a congratulatory message.
// Those who do not reach the quota receive a message indicating the number of
// sales that they would have needed to meet the quota.

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        // Set base pay and bonus pay amounts:
        int quota = 10;

        // Get sales from the salesperson:
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Display messaging based on number of sales made:
        if(sales >= 10){
            System.out.println("Congratulations! You met the quota of " + quota + " sales!");
        }
        else{
            int shortfall = quota - sales;
            System.out.println("You were " + shortfall + " sales short of the weekly quota. TRY HARDER.");
        }

    }
}
