package chapter3;

// If statement exercise.
// All salespeople are paid $1000 per week.
// Salespeople who exceed 10 sales in a given week receive a bonus of $250.
// Salespeople who exceed 20 sales in a given week receive the $250 bonus, plus
// an additional $50 bonus per sales above and beyond 10.

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        // Set base pay and bonus pay amounts:
        int basePay = 1000;
        int bonusPay = 250;
        int superBonus = 50;
        int quota = 10;
        int superQuota = 20;

        // Get sales from the salesperson:
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Determine if number of sales warrants a bonus and provide appropriate messaging:
        if(sales > superQuota){
            basePay = basePay + bonusPay + (superBonus * (sales - superQuota));
            System.out.println(sales + " sales! You nailed it this week! Your total pay is $" + basePay + ".00.");
        }
        else if(sales > quota){
            basePay = basePay + bonusPay;
            System.out.println("Congratulations! Because you made " + sales + " sales this week, your total pay is $"
                    + basePay + ".00.");
            System.out.println("If you had made " + ((superQuota + 1) - sales)
                    + " more sales this week, you would have received a $" + superBonus
                    + ".00 bonus per each sale over " + superQuota + ".");
        }
        else {
            System.out.println("You made " + sales + " sales this week. Your total pay is $" + basePay + ".00.");
            System.out.println("If you had made " + ((quota + 1) - sales)
                    + " more sales this week, you would have received a $" + bonusPay + ".00 bonus.");
        }
        System.out.println("Have a great week!");
    }
}
