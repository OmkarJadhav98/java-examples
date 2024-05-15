/*=======================================================================================
Write a Java program to insert an element into the array list at the first position.
=======================================================================================*/

import java.util.ArrayList;
public class _3
{
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");

        System.out.println("Old ArrayList is: " + Colors);

        Colors.add(1, "Orange");
        System.out.println("New ArrayList is: " + Colors);
    }
}
