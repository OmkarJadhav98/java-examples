/*====================================================================================
Two numbers are entered through the keyboard.
Write a program to find the value of one number raised to the power of another.
(Do not use Java built-in method)
====================================================================================*/

import java.util.Scanner;

public class _1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent (a positive integer): ");
        int exponent = scanner.nextInt();

        double result = 1.0;

        if (exponent >= 0) {
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        } else {
            System.out.println("Exponent must be a non-negative integer.");
        }
    }
}
