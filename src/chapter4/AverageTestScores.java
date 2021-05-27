package chapter4;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {

        // What we know:
        int numberOfStudents = 24;
        int numberOfTests = 4;

        // Process all students:
        for (int i = 0; i < numberOfStudents; i++){
            double testTotal = 0;
            for (int j = 0; j < numberOfTests; j++){
                System.out.println("Student " + (i + 1) + ", what was your score for Test " + (j + 1) + "?");
                Scanner scanner = new Scanner(System.in);
                double score = scanner.nextDouble();
                testTotal = testTotal + score;

            }
            // Compute average of test scores:
            double avgScore = testTotal / numberOfTests;

            // Display student's average test score:
            System.out.println("Student " + (i + 1) + "'s average test score was " + avgScore);
        }
    }
}
