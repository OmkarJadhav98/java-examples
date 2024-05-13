/*========================================================================================================
Write a program that generates a random number and asks the user to guess what the number is.
If the user's guess is higher than the random number, the program should display "Too high, try again."
If the user's guess is lower than the random number, the program should display "Too low, try again."
The program should use a loop that repeats until the user correctly guesses the random number.
========================================================================================================*/

import java.util.Random;
import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100; // You can adjust the range as needed
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have selected a random number between " + min + " and " + max + ".");
        System.out.println("Try to guess the number!");

        int userGuess;
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            }
        } while (userGuess != randomNumber);

        System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
    }
}

