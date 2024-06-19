package Incapsulation3;

public class _1 {

    public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle();

        // Set values using setter methods
        rectangle.setLength(6.7);
        rectangle.setWidth(12.0);

        // Get values using getter methods
        double length = rectangle.getLength();
        double width = rectangle.getWidth();

        // Print the values
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}


