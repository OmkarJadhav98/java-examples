/*************************************************************
Write a Java program to increase an array list size.
*************************************************************/

import java.util.ArrayList;

public class _20 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");

        System.out.println("Original ArrayList: " + Colors);

        Colors.ensureCapacity(5);
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");
        System.out.println("New ArrayList: " + Colors);
    }
}
