package chapter3;

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {

        // Set letter grade minimums:
        int minimumA = 90;
        int minimumB = 80;
        int minimumC = 70;
        int minimumD = 60;

        // Get the test score:
        System.out.println("What was your test score?");
        Scanner scanner = new Scanner(System.in);
        double testScore = scanner.nextDouble();

        // Determine the letter grade based on the test score:
        char grade;
        if(testScore >= minimumA){
            grade = 'A';
        }
        else if(testScore >= minimumB){
            grade = 'B';
        }
        else if(testScore >= minimumC){
            grade = 'C';
        }
        else if(testScore >= minimumD){
            grade = 'D';
        }
        else{
            grade = 'F';
        }
        System.out.println("You received a(n) " + grade + " on this test.");

    }
}
