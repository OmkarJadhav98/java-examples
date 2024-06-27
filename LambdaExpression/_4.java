/*Write a Java program to retrieve an element (at a specified index) from a given array list.*/
import java.util.ArrayList;
public class _4 {
    public static void main(String[] args) {
        ArrayList<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        System.out.println(list_Strings);

        String element = list_Strings.get(0);
        System.out.println("First element: " + element);
        element = list_Strings.get(2);
        System.out.println("Third element: " + element);
    }
}

