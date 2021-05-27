package chapter4;

import java.util.Scanner;

// Search a string to determine if it contains a given letter.
public class LetterSearch {

    public static void main(String[] args) {

        // Get text:
        char expectedLetter = 'A';
        System.out.println("Please enter some text:");
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.next();
        scanner.close();

        boolean expectedLetterFound = false;

        // Search text for expected letter:
        for(int i = 0; i < userText.length(); i++){
            char currentLetter = userText.charAt(i);
            if(currentLetter == expectedLetter || currentLetter == Character.toLowerCase(expectedLetter)){
                System.out.println("We found the letter " + expectedLetter + " at character " + i + ".");
                expectedLetterFound = true;
                break;
            }
        }

        // Let the user know if the expected letter was not found.
        if(expectedLetterFound != true){
            System.out.println("We did not find the letter " + expectedLetter + " in your text.");
        }
    }
}
