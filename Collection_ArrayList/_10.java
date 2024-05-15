/*============================================================
Write a Java program to shuffle elements in an array list.
============================================================*/

import java.util.ArrayList;
import java.util.Collections;

public class _10 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");

        System.out.println("List Before Shuffling: " + Colors);

        Collections.shuffle(Colors);
        System.out.println("List After Shuffling: " + Colors);
    }
}
