/*==================================================
Write a Java program to sort a given array list.
==================================================*/

import java.util.ArrayList;
import java.util.Collections;

public class _8 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");

        System.out.println("List Before Sort: " + Colors);

        Collections.sort(Colors);
        System.out.println("List After Sort: " + Colors);
    }
}
