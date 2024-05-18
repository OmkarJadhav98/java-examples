/**************************************************************************
 Write a program to append the specified element to the end of a hash set.
 **************************************************************************/
import java.util.HashSet;
public class _1
{
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Orange");
        h_set.add("Yellow");

        System.out.println("HashSet is : "+h_set);
    }
}
