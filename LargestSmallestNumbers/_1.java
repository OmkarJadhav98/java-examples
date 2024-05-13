/*================================================================================
Write a program to enter the numbers till the user wants and
at the end the program should display the largest and smallest numbers entered.
================================================================================*/


import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int num;

        System.out.println("Enter numbers (enter -1 to stop):");
        Scanner input = new Scanner(System.in);
        while (true) {
            num = input.nextInt();
            if (num == -1) {
                break; // Exit the loop if -1 is entered
            }
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}


