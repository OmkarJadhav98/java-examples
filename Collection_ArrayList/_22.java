import java.util.ArrayList;

/***********************************************************************************************
Write a Java program to print all the elements of an ArrayList using the elements' position.
***********************************************************************************************/

public class _22 {
    public static void main(String[] args)
    {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Blue");
        Colors.add("Black");

        System.out.println("Original ArrayList: " + Colors);
        System.out.println("\nPrint using index of an element: ");

        int NoOfElements = Colors.size();
        for (int index = 0; index < NoOfElements; index++)
            System.out.println(Colors.get(index));
    }
}
