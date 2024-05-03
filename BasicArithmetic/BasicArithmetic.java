/*==================================================================================
Write a program to Menu driven program using switch statement.
( Find addition, subtraction, multiplication and division of to integer numbers )
===================================================================================*/

import java.util.Scanner;

public class BasicArithmetic
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        char operation;
        int result;

        System.out.println("Simple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("+ for Addition");
        System.out.println("- for Subtraction");
        System.out.println("* for Multiplication");
        System.out.println("/ for Division");
        System.out.print("Enter your choice: ");
        operation = scanner.next().charAt(0);

        System.out.print("Enter the first integer number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter the second integer number: ");
        number2 = scanner.nextInt();

        switch (operation) {
            case '+':
                result = number1 + number2;
                System.out.println("The result of addition of " + number1 + " + " + number2 + " is: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("The result of subtraction of " + number1 + " - " + number2 + " is: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("The result of multiplication of " + number1 + " * " + number2 + " is: " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("The result of division of " + number1 + " / " + number2 + " is: " + result);
                } else {
                    System.out.println("Division by zero is not possible.");
                }
                break;
            default:
                System.out.println("Invalid operation! Please choose +, -, *, or /.");
                break;
        }
    }
}
