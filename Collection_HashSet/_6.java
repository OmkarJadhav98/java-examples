import java.util.HashSet;

/****************************************************************
Write a program to clone a hash set to another hash set.
****************************************************************/
public class _6
{
    public static void main(String[] args)
    {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Orange");
        h_set.add("Yellow");

        System.out.println("HashSet is : "+h_set);

        HashSet <String> new_h_set = new HashSet <String> ();
        new_h_set = (HashSet)h_set.clone();
        System.out.println("Cloned Hash Set: " + new_h_set);
    }
}