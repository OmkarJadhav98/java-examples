/*Write a Java program to insert an element into the array list at the first position.*/
import java.util.ArrayList;
public class _3 {
    public static void main(String[] args) {
        // Creae a list and add some colors to the list
        ArrayList<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        System.out.println(list_Strings);
        ((java.util.function.Consumer<ArrayList<String>>)
                (list -> list.add(0, "Pink"))).accept(list_Strings);

        ((java.util.function.Consumer<ArrayList<String>>)
                (list -> list.add(5, "Yellow"))).accept(list_Strings);

        System.out.println(list_Strings);
    }
}
