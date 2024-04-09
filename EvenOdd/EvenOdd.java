import java.util.Scanner;

public class EvenOdd
{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        /*================================================================
            Psuedo Code :
                1. Display a msg to user to enter a positive value
                2. Accept the value from user (Scanner class usage)
                3. (no % 2) == 0 -> this no is even
                4. else -> this no is odd.
        ================================================================*/

        System.out.println("Please enter a Number : ");

        int no = scanner.nextInt();

        if(no % 2 == 0)
        {
            System.out.println("this number is Even Number...");
        }
        else
        {
            System.out.println("this number is Odd Number...");
        }
    }
}
