/*========================================================================
Write a Java program to update an array element by the given element.
========================================================================*/

import java.util.ArrayList;
public class _5
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

        // Update the Third element with Orange
        Colors.set(2,"Orange");
        System.out.println("Updated ArrayList of Colors is: " + Colors);
    }
}
