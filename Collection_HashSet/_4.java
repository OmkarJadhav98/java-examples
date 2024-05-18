import java.util.HashSet;

/**********************************************
Write a program to empty a hash set.
**********************************************/

public class _4 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Orange");
        h_set.add("Yellow");

        System.out.println("HashSet is : "+h_set);

        // Remove all elements
        h_set.removeAll(h_set);
        System.out.println("Hash Set after removing all the elements is: "+h_set);
    }
}
