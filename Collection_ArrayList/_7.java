/*==================================================================
Write a Java program to search for an element in an array list.
==================================================================*/

import java.util.ArrayList;
public class _7 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");

        System.out.println("ArrayList of Colors is: " + Colors);

        // search for an element in an array list
        if(Colors.contains("Black"))
        {
            System.out.println("Found the element...");
        }else
        {
            System.out.println("There is no such element...");
        }

    }
}
