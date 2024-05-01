/*==============================================================================================
Write a program to Check whether the number is even or odd using switch statement..
================================================================================================
 */
import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = scanner.nextInt();

        switch (number % 2)
        {
            case 0:
                System.out.println(number + " is a Even number");
                break;
            case 1:
                System.out.println(number + " is a odd number");
                break;
            default:
                System.out.println("Unexpected error founded....");
        }
    }
}
