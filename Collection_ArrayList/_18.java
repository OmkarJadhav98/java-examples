/*====================================================================
Write a Java program to test whether an array list is empty or not.
====================================================================*/

import java.util.ArrayList;

public class _18 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");

        System.out.println("Original ArrayList: " + Colors);
        System.out.println("Checking the above array list is empty or not! " +Colors.isEmpty());

        Colors.clear(); // Correct way to empty the list
        System.out.println("\nArray list after remove all elements "+Colors);
        System.out.println("Checking the above array list is empty or not! " +Colors.isEmpty());
    }
}
