/*===============================================================
Write a program to calculate HCF of Two given number.
===============================================================*/
import java.util.Scanner;

public class _1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = 1; // Start with the lowest possible HCF
        int min = Math.min(num1, num2); // Find the smaller number

        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i; // Found the HCF
                break; // No need to check further
            }
        }

        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}

