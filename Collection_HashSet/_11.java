import java.util.HashSet;
/**********************************************************************************
Write a program to compare two sets and retain elements that are the same.
**********************************************************************************/

public class _11 {
    public static void main(String[] args) {
        HashSet<String> h_set1 = new HashSet<>();
        h_set1.add("Red");
        h_set1.add("Green");
        h_set1.add("Orange");
        h_set1.add("Yellow");
        System.out.println("First HashSet content: "+h_set1);
        HashSet<String> h_set2 = new HashSet<>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Black");
        h_set2.add("Yellow");
        System.out.println("First HashSet content: "+h_set2);

        h_set1.retainAll(h_set2);
        System.out.println("HashSet content:");
        System.out.println(h_set1);
    }
}
