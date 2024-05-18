import java.util.HashSet;
import java.util.Iterator;

/**************************************************************************
Write a program to iterate through all elements in a hash list.
**************************************************************************/
public class _2 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Orange");
        h_set.add("Yellow");

        // set Iterator
        Iterator<String> p = h_set.iterator();
        // Iterate the hash set
        for (;p.hasNext();) {
            System.out.println(p.next());
        }
    }
}
