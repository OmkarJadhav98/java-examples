/*-------------------------------------------------------------------
Write a Java program that swaps two elements in an array list.
-------------------------------------------------------------------*/

import java.util.ArrayList;
import java.util.Collections;

public class _14 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");

        System.out.println("ArrayList Before Swap: " + Colors);
        for(String a : Colors)
        {
            System.out.println(a);
        }

        //Swapping 1st(index 0) element with the 3rd(index 2) element
        Collections.swap(Colors, 0, 2);
        System.out.println("ArrayList after swap:" +Colors);
        for(String b: Colors)
        {
            System.out.println(b);
        }

    }
}
