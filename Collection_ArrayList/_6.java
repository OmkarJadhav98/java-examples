/*======================================================================
Write a Java program to remove the third element from an array list.
======================================================================*/

import java.util.ArrayList;
public class _6
{
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");

        System.out.println("ArrayList of Colors is: " + Colors);

        // remove the third element from an array list
        Colors.remove(2);
        System.out.println("After removing third element from the list:\n"+Colors);
    }
}
