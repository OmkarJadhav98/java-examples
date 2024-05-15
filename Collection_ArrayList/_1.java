/*===================================================================================================
Write a Java program to create an array list, add some colors (strings) and print out the collection.
=====================================================================================================*/

import java.util.ArrayList;

public class _1
{
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<String>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");

        System.out.println("ArrayList of Colors is: " + Colors);
    }
}
