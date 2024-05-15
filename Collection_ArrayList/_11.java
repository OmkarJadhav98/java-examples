/*============================================================
Write a Java program to reverse elements in an array list.
============================================================*/

import java.util.ArrayList;
import java.util.Collections;

public class _11 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");

        System.out.println("List Before Reverse: " + Colors);

        Collections.reverse(Colors);
        System.out.println("List After Reverse: " + Colors);
    }
}
