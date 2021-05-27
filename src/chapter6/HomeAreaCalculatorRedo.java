package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo areaCalculator = new HomeAreaCalculatorRedo();
        Rectangle livingRoom = areaCalculator.getRoom();
        Rectangle diningRoom = areaCalculator.getRoom();

        double totalArea = areaCalculator.calculateTotalArea(livingRoom, diningRoom);

        System.out.println("The total area of both rooms is " + totalArea + " square feet.");
        areaCalculator.scanner.close();
    }

    public Rectangle getRoom(){
        System.out.println("Which room are we measuring?");
        String roomName = scanner.next();
        System.out.println("What is the length of the room?");
        double roomLength = scanner.nextDouble();
        System.out.println("What is the width of the room?");
        double roomWidth = scanner.nextDouble();
        System.out.println("The " + roomName + " has a total area of " + (roomLength * roomWidth) + " square feet.");

        return new Rectangle(roomName, roomLength, roomWidth);

    }

    public double calculateTotalArea(Rectangle room1, Rectangle room2){
        return room1.calculateArea() + room2.calculateArea();
    }
}
