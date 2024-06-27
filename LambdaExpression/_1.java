/*Write a Java program to create an array list, add some colors (strings) and print out the collection.*/
import java.util.ArrayList;

public class _1 {
    public static void main(String[] args) {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");

        // Using a lambda expression to print the list of colors
        Colors.forEach(color -> System.out.println(color));

        // Alternatively, we can use a method reference:
        // Colors.forEach(System.out::println);
    }
}

