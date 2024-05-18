
import java.util.Iterator;
import java.util.TreeSet;

/******************************************************************
Write a program to find numbers less than 7 in a tree set.
******************************************************************/
public class _9 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(6);
        numbers.add(8);

        System.out.println("TreeSet is : " + numbers);

        Iterator<Integer> iterator = numbers.iterator();
        System.out.print("Numbers less than 7: ");
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number < 7) {
                System.out.print(number + " ");
            }
        }
    }
}