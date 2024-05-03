/*============================================================================================
Write a program to check whether a person is eligible to vote or Not using switch statement.
=============================================================================================*/

import java.util.Scanner;

public class VotingEligibility
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Since switch does not support range checking directly, we convert the age to cases
        int eligibilityCase = (age >= 18) ? 1 : 0;

        switch (eligibilityCase) {
            case 1:
                System.out.println("You are eligible to vote.");
                break;
            case 0:
                System.out.println("You are not eligible to vote.");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }
}
