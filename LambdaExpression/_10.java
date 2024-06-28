/*Write a Java program to iterate through all elements in a hash list.*/
import java.util.*;

public class _10
{
    public static void main(String[] args)
    {
        HashSet<String> h_set = new HashSet< >();

        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");

        h_set.forEach(element -> System.out.println(element));
    }
}