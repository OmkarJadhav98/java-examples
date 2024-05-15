import java.util.ArrayList;

/***********************************************************************************************
Write a Java program to replace the second element of an ArrayList with the specified element.
***********************************************************************************************/

public class _21 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");

        System.out.println("Original ArrayList: " + Colors);
        String new_Colors = "White";
        Colors.set(1,new_Colors);

        int num = Colors.size();
        System.out.println("Replace second element with 'White'.");
        for(int i = 0; i < num; i++)
        {
            System.out.println(Colors.get(i));
        }
    }
}
