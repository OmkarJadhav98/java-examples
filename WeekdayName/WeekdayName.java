/* Write a program to read a weekday number and print weekday name using switch statement. */

import java.util.Scanner;
public class WeekdayName
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Weekday number (1-7)");
        int WeekdayNumber = scanner.nextInt();

        switch(WeekdayNumber)
        {
            case 1:
            System.out.println("Monday");
                break;
            case 2:
            System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
            System.out.println("Invalid weekday number. Please enter a number between 1 and 7.");
        }
    }
}
