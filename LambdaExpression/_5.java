/*Write a Java program to update an array element by the given element.*/
import java.util.ArrayList;
public class _5 {
    public static void main(String[] args) {

        ArrayList<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        System.out.println(list_Strings);
        // Update the third element with "Yellow"
        ((java.util.function.Consumer<ArrayList<String>>)
                (list -> list.set(2, "Yellow"))).accept(list_Strings);
        // Print the list again
        System.out.println(list_Strings);
    }
}

