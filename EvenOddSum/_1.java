/*==================================================================================================
Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
==================================================================================================*/

import java.util.Scanner;

public class _1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
    }
}
