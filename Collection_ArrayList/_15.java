/*==================================================
Write a Java program to join two array lists.
==================================================*/

import java.util.ArrayList;

public class _15 {
    public static void main(String[] args)
    {
        ArrayList<String> ColorsList1 = new ArrayList<>();
        ColorsList1.add("Red");
        ColorsList1.add("Green");
        ColorsList1.add("Yellow");
        ColorsList1.add("Blue");
        ColorsList1.add("Black");

        System.out.println("List of First ArrayList: " + ColorsList1);

        ArrayList<String> ColorsList2 = new ArrayList<>();
        ColorsList2.add("White");
        ColorsList2.add("Orange");
        ColorsList2.add("Violet");
        ColorsList2.add("Purple");

        System.out.println("List of Second ArrayList: " + ColorsList2);

        // Let join above two list
        ArrayList<String> a = new ArrayList<String>();
        a.addAll(ColorsList1);
        a.addAll(ColorsList2);
        System.out.println("New array: " + a);
    }
}
