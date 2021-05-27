package chapter7;

import java.awt.*;
import java.util.Scanner;

public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];

        getGrades();

        System.out.println(String.format("The average grade is %.2f", calulateAverageGrade()));
        System.out.println(String.format("The highest grade is %d", getHighestGrade()));
        System.out.println(String.format("The lowest grade is %d", getLowestGrade()));

    }

    public static void getGrades() {
        for (int i=0; i < grades.length; i++) {
            System.out.println(String.format("Enter grade #%d", i + 1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSumOfGrades() {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return sum;
    }

    public static double calulateAverageGrade() {
        return calculateSumOfGrades()/grades.length;
    }

    public static int getHighestGrade() {
        int highestGrade = grades[0];
        for (int grade : grades) {
            if (grade > highestGrade) {
                highestGrade = grade;
            }
        }
        return highestGrade;
    }

    public static int getLowestGrade() {
        int lowestGrade = grades[0];
        for (int grade : grades) {
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }
        return lowestGrade;
    }

}
