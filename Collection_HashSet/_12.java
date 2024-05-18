import java.util.HashSet;

/***************************************************************
Write a program to remove all elements from a hash set.
***************************************************************/

public class _12
{
    public static void main(String[] args)
    {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Orange");
        h_set.add("Yellow");

        System.out.println("HashSet is : "+h_set);

        h_set.clear();

        System.out.println("HashSet content: "+h_set);
    }
}
