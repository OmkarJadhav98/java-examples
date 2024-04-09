import java.util.Scanner;

public class NumberType2
{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        /*================================================================
            Psuedo Code:
                1. Display a msg to user to enter a positive value
                2. Accept the value from user (scanner class usage)
                3. if((no > 100) OR even) -> Great no
                   if((no < 100) OR Odd) -> Super no

        ================================================================*/

        System.out.println("Please enter a number : ");
        int no = scanner.nextInt();

        if((no > 100) || (no % 2 == 0))
        {
            System.out.println("----Great no----");
        }
        else if((no < 100 ) || (no % 2 != 0))
        {
            System.out.println("----Super no----");
        }
    }
}
