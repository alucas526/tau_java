package chapter6;

public class Rectangle {

    private String roomName;
    private double length;
    private double width;

    // Constructors
    public Rectangle(){
        roomName = "room";
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(length);
    }

    public Rectangle(String roomName, double length, double width){
        setName(roomName);
        setLength(length);
        setWidth(width);
    }

    // Getters and Setters for length and width
    public double getLength(){ return length; }
    public void setLength(double length){ this.length = length; }

    public double getWidth(){ return width; }
    public void setWidth(double width){ this.width = width; }

    public String getRoomName(){ return roomName; }
    public void setName(String roomName){ this.roomName = roomName; }

    // Things you can do with a rectangle
    public double calculatePerimeter(){ return (2 * length) + (2 * width); }

    public double calculateArea(){ return length * width; }

}
