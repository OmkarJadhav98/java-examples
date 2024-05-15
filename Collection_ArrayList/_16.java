/*===================================================================
 Write a Java program to clone an array list to another array list.
 ===================================================================*/

import java.util.ArrayList;

public class _16 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");

        System.out.println("Original ArrayList is: " + Colors);

        @SuppressWarnings("unchecked") // Suppress the unchecked warning

        ArrayList<String> Colors1 = (ArrayList<String>) Colors.clone();
        System.out.println("Cloned ArrayList is: " + Colors1);

    }
}
