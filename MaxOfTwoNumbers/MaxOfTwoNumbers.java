/*==========================================================================
Write a program to find the Maximum of Two Numbers using switch statement.
==========================================================================*/

import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double max;

        switch (Double.compare(num1, num2)) {
            case 1:
                max = num1;
                break;
            case -1:
                max = num2;
                break;
            default:
                max = num1; // If both numbers are equal, consider the first number as the maximum
                break;
        }

        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
    }
}
