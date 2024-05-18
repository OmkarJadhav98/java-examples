import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**********************************************************
Write a program to convert a hash set to a tree set.
***********************************************************/
public class _8 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Orange");
        h_set.add("Yellow");

        System.out.println("HashSet is : "+h_set);

        // Create a TreeSet of HashSet elements
        Set<String> tree_set = new TreeSet<>(h_set);

        // Display TreeSet elements
        System.out.println("TreeSet elements: ");
        for(String element : tree_set) {
            System.out.println(element);
        }
    }
}
