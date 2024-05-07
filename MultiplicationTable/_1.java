/*=======================================================================
Write a program that prompts the user to input a positive integer.
It should then print the multiplication table of that number.
=======================================================================*/

import java.util.Scanner;

public class _1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
