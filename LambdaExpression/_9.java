/*Write a Java program to append the specified element to the end of a hash set.*/
import java.util.HashSet;
public class _9 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");

        System.out.println("The Hash Set: " + h_set);
        h_set.forEach(element -> System.out.println("Element: " + element));
    }
}