/*==========================================================
Write a program to print numbers from 1 to 10.
==========================================================*/

import java.util.Scanner;

public class PrintNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int upperLimit = scanner.nextInt();

        for (int i = 1; i <= upperLimit; i++)
        {
            System.out.println(i);
        }
    }
}
