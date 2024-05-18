import java.util.HashSet;

/*********************************************************
Write a program to convert a hash set to an array.
*********************************************************/
public class _7 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Orange");
        h_set.add("Yellow");

        System.out.println("HashSet is : "+h_set);

        // Creating an Array
        String[] new_array = new String[h_set.size()];
        h_set.toArray(new_array);

        // Displaying Array elements
        System.out.println("Array elements: " + h_set);
        for(String element : new_array) {
            System.out.println(element);
        }
    }
}
