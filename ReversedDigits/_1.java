/*====================================================================
Write a program that prompts the user to input an integer and
then outputs the number with the digits reversed.
For example, if the input is 12345, the output should be 54321.
====================================================================*/

import java.util.Scanner;

public class _1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
