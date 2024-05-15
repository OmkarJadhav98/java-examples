/*==============================================
Write a Java program to empty an array list.
==============================================*/

import java.util.ArrayList;

public class _17 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");

        System.out.println("List Before Remove All Element: " + Colors);

        Colors.clear(); // Correct way to empty the list
        System.out.println("List After Remove All Element: " + Colors);
    }
}
