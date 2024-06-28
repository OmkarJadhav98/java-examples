/*Write a Java program to sort a given array list.*/
import java.util.ArrayList;

public class _8 {
    public static void main(String[] args) {
        ArrayList<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        System.out.println("List before sort: "+list_Strings);

        // Using a lambda expression to sort the list
        list_Strings.sort((a, b) -> a.compareTo(b));

        System.out.println("List after sort: " + list_Strings);
    }
}