/*==============================================================
Write a Java program to extract a portion of an array list.
==============================================================*/

import java.util.ArrayList;
import java.util.List;

public class _12 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");

        System.out.println("ArrayList is: " + Colors);

        // Extract a portion of the ArrayList from index 1 to 3
        List<String> subListColors = Colors.subList(1, 4);
        System.out.println("Extracted portion of the ArrayList: " + subListColors);
    }
}
