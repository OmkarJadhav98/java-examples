import java.util.HashSet;

/***********************************************************************
Write a program to get the number of elements in a hash set.
***********************************************************************/

public class _3 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Orange");
        h_set.add("Yellow");

        System.out.println("HashSet is : "+h_set);
        System.out.println("Size of the Hash Set: " + h_set.size());
    }
}
