/*Write a Java program to create a class called Circle with a private instance variable radius.
Provide public getter and setter methods to access and modify the radius variable.
However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.*/

package Incapsulation5;


public class Main {
    public static void main(String[] args) {
        // Create an instance of Circle
        Circle circle = new Circle();

        // Set the radius using the setter method
        circle.setRadius(7.0);

        // Get the radius using the getter method
        double radius = circle.getRadius();

        // Calculate and print the area and perimeter
        double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();

        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + area);
        System.out.println("Circle Perimeter: " + perimeter);
    }
}

