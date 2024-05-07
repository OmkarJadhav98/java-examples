/*=========================================================================================
Write a do-while loop that asks the user to enter two numbers.
The numbers should be added and the sum displayed.
The loop should ask the user whether he or she wishes to perform the operation again.
If so, the loop should repeat; otherwise it should terminate.
=========================================================================================*/

import java.util.Scanner;

public class _1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, sum;
        char choice;

        do {
            System.out.print("Enter the first number: ");
            number1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            number2 = scanner.nextInt();

            sum = number1 + number2;
            System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

            System.out.print("Do you wish to perform another operation (y/n)? : ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Operation terminated.");
    }
}
