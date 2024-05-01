/*===================================================================
Write a program to create simple calculator using switch Statement.
=====================================================================*/
import java.util.Scanner;
public class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double number1, number2, result;

        System.out.println("Choose an operator: +, -, *, or /");
        char operator = input.next().charAt(0);

        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator)
        {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Division by zero is not possible.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please choose +, -, *, or /.");
                break;
        }
        input.close();
    }
}

