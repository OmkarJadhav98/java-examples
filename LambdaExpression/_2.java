/*Write a Java program to iterate through all elements in an array list.*/

import java.util.ArrayList;
public class _2 {
    public static void main(String[] args) {
        ArrayList<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        list_Strings.forEach(element -> System.out.println(element));
    }
}