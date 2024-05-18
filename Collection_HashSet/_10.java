import java.util.HashSet;

/***********************************************
Write a program to compare two hash set.
***********************************************/
public class _10 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Orange");
        h_set.add("Yellow");

        HashSet<String> h_set2 = new HashSet<>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Black");
        h_set2.add("Yellow");

        for (String element : h_set)
        {
            System.out.println(h_set2.contains(element) ? "Yes" : "No");
        }
    }
}
