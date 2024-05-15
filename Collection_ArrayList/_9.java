/*================================================================
Write a Java program to copy one array list into another.
================================================================*/

import java.util.ArrayList;
import java.util.Collections;

public class _9 {
    public static void main(String[] args)
    {
        ArrayList<String> ColorsList1 = new ArrayList<>();
        ColorsList1.add("1");
        ColorsList1.add("2");
        ColorsList1.add("3");
        ColorsList1.add("4");
        ColorsList1.add("5");

        System.out.println("ColorsList1: " + ColorsList1);

        ArrayList<String> ColorsList2 = new ArrayList<>();
        ColorsList2.add("Red");
        ColorsList2.add("Green");
        ColorsList2.add("Yellow");
        ColorsList2.add("Blue");
        ColorsList2.add("Black");

        System.out.println("ColorsList2: " + ColorsList2);

        //copy one array list into another.
        Collections.copy(ColorsList1,ColorsList2);
        System.out.println("\nCopy ColorsList1 to ColorsList2,\nAfter copy:");
        System.out.println("ColorsList1: " + ColorsList1);
        System.out.println("ColorsList2: " + ColorsList2);
    }
}
