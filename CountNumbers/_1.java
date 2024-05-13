/*===============================================================================
Write a program to enter the numbers till the user wants and
at the end it should display the count of positive, negative and zeros entered.
=================================================================================*/

import java.util.Scanner;

public class _1
{
    public static void main(String[] args) {
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (enter -1 to stop):");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break; // Exit the loop if -1 is entered
            } else if (num > 0) {
                positiveCount++; // Increment positiveCount for positive input
            } else if (num < 0) {
                negativeCount++; // Increment negativeCount for negative input
            } else {
                zeroCount++; // Increment zeroCount for zero input
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeroes: " + zeroCount);
    }
}

