import java.util.HashSet;

/************************************************************
Write a program to test if a hash set is empty or not.
************************************************************/

public class _5 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Orange");
        h_set.add("Yellow");

        System.out.println("HashSet is : "+h_set);
        System.out.println("Checking the above array list is empty or not! : "+h_set.isEmpty());
        System.out.println("Remove all the elements from a Hash Set: ");
        h_set.removeAll(h_set);
        System.out.println("Hash Set after removing all the elements : "+h_set);
    }
}
