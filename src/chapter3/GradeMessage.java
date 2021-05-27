package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        // Ask the user to enter their letter grade:
        System.out.println("Please enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        // Display message based on entered grade:
        String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job.";
            case "D" -> "Well, you still passed.";
            case "F" -> "Did you even study?";
            default -> "Error: Invalid grade entered.";
        };

        // Old switch code:
        // String message;
        // switch(grade){
        //     case "A":
        //         message = "Excellent job!";
        //         break;
        //     case "B":
        //         message = "Great job!";
        //         break;
        //     case "C":
        //         message = "Good job.";
        //         break;
        //     case "D":
        //         message = "Well, you still passed.";
        //         break;
        //     case "F":
        //         message = "Did you even study?";
        //         break;
        //     default:
        //         message = "Error: Invalid grade entered.";
        //         break;
        // }

        System.out.println(message);

    }
}
