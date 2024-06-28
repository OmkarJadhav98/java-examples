/*Write a Java program to get the number of elements in a hash set.*/
import java.util.*;
import java.util.Iterator;
public class _11 {
    public static void main(String[] args)
    {
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original Hash Set: " + h_set);
        h_set.forEach(element -> System.out.println(element));
        System.out.println("Size of the Hash Set: " + h_set.size());
    }
}