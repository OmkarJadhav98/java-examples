/*=================================================================================================
Write a program to Check whether a character is a vowel or consonant using switch statement.
=================================================================================================*/
import java.util.Scanner;
public class VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a Single Character: ");

        char character = scanner.next().toLowerCase().charAt(0);

        switch (character)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(character + " is a vowel.");
                break;
            default:
                System.out.println(character + " is a consonant");
                break;

        }
    }
}
