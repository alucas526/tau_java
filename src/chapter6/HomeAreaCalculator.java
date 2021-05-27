package chapter6;

// Write a class that creates instances of the Rectangle class in order to find
// the total area of two or more rooms in a house.

public class HomeAreaCalculator {

    public static void main(String[] args) {

        // ***************
        // * RECTANGLE 1 *
        // ***************

        // Create an instance of the Rectangle class

        Rectangle livingRoom = new Rectangle();
        livingRoom.setWidth(48);
        livingRoom.setLength(24);
        double areaLivingRoom = livingRoom.calculateArea();

        // ***************
        // * RECTANGLE 2 *
        // ***************

        // Create an instance of the Rectangle class

        Rectangle diningRoom = new Rectangle(36, 18);
        double areaDiningRoom = diningRoom.calculateArea();

        double totalArea = areaLivingRoom + areaDiningRoom;

        System.out.println("The area of both rooms is " + totalArea + " square feet.");
    }

}
