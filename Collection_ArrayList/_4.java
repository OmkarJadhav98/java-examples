/*============================================================================================
Write a Java program to retrieve an element (at a specified index) from a given array list.
============================================================================================*/

import java.util.ArrayList;

public class _4
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

        // retrieve the first, second and Fifth element
        String element = Colors.get(0);
        System.out.println("First Element: " + element);

        element = Colors.get(1);
        System.out.println("Second Element: " + element);

        element = Colors.get(4);
        System.out.println("Fifth Element: " + element);
    }
}
