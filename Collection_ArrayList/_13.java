/*============================================================================
Write a Java program to compare two array lists.==============================
============================================================================*/

import java.util.ArrayList;

public class _13 {
    public static void main(String[] args)
    {
        ArrayList<String> ColorsList1 = new ArrayList<>();
        ColorsList1.add("Red");
        ColorsList1.add("Green");
        ColorsList1.add("Yellow");
        ColorsList1.add("Blue");
        ColorsList1.add("Black");

        System.out.println("ColorsList1: " + ColorsList1);

        ArrayList<String> ColorsList2 = new ArrayList<>();
        ColorsList2.add("Red");
        ColorsList2.add("Green");
        ColorsList2.add("Yellow");
        ColorsList2.add("Black");

        System.out.println("ColorsList2: " + ColorsList2);

        //Storing the comparison output in ArrayList<String>
        ArrayList<String> ColorsList3 = new ArrayList<String>();
        for (String e : ColorsList1)
            ColorsList3.add(ColorsList2.contains(e) ? "Yes" : "No");
        System.out.println(ColorsList3);
    }
}
