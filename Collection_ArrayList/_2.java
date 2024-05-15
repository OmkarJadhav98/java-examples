/*========================================================================
Write a Java program to iterate through all elements in an array list.
========================================================================*/

import java.util.ArrayList;
public class _2 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");

        for (String color : Colors)
        {
            System.out.println(color);
        }
    }
}

