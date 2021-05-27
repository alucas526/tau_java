package chapter5;

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {

        // Get user's name:
        System.out.println("Hello! What is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        greetUser(userName);

    }

    public static void greetUser(String name){
        System.out.println("Hello, " + name + "! It is _so_ nice to meet you!");
    }


}
