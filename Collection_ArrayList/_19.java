/*==================================================================
Write a Java program for trimming the capacity of an array list.
==================================================================*/

import java.util.ArrayList;

public class _19 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");

        System.out.println("Original ArrayList: " + Colors);
        System.out.println("Let trim to size the above ArrayList: ");

        Colors.trimToSize();
        System.out.println(Colors);
    }
}
