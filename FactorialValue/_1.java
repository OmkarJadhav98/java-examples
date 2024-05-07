/*=========================================================================================
Write a program to find the factorial value of any number entered through the keyboard.
=========================================================================================*/

import java.util.Scanner;
import java.math.BigInteger;

public class _1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to calculate its factorial: ");
        int number = scanner.nextInt();

        // Using BigInteger for factorial calculation because the result can be very large
        BigInteger factorial = BigInteger.ONE;

        // Calculate factorial using a for loop
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.printf("Factorial of %d is: %s\n", number, factorial.toString());
    }
}
