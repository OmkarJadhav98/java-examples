/* please write a java code to accept ticket range for metro ticketing.*/

import java.util.Scanner;
public class MetroTicketCounter
{
    private static Scanner scanner = new Scanner(System.in);

    /*===================================================================================================
    Psuedo Code:

    1. Import the Scanner class.
    2. Print a welcome message.
    3. Declare an array of Strings named ticket and an array of integers named ticketPrice
       and an integer variable named Destination.
    4. Initialize the ticket array with the names of the destinations.
    5. Initialize the ticketPrice array with the prices of the tickets for each destination.
    6. Declare an integer variable i and initialize it to 0
    7. a while loop that runs as long as i is less than the length of the ticket array
       and inside the loop, print the destination and its corresponding price, and increment i by 1
    8. After the loop, print a message asking the user to enter the number of the destination they want
       to reach.
    9. Read the user's input and store it in the Destination variable.
    0. Check the value of Destination using if-else statements.
        If Destination is between 0 and the length of the ticket array, print the destination
        and its corresponding ticket price . Otherwise, print an error message.
    ====================================================================================================*/

    public static void main(String[] args)
    {
        System.out.println("--------------------Welcome to the Pune-Metro Ticket Counter--------------------");

        String[] ticket = new String[5];
        int[] ticketPrice = new int[5];
        int Destination = 0;

        ticket[0] = "Swargate to Karve Nagar";
        ticket[1] = "Swargate to Bund Garden";
        ticket[2] = "Swargate to Vanaj";
        ticket[3] = "Swargate to Ram wadi";
        ticket[4] = "Swargate to Chinchwad";

        ticketPrice[0] = 10;
        ticketPrice[1] = 15;
        ticketPrice[2] = 20;
        ticketPrice[3] = 25;
        ticketPrice[4] = 30;

        int i = 0;
        while(i < ticket.length)
        {
            System.out.println("Please Enter " + i + " for " + ticket[i]);
            i++;
        }

        System.out.println("Please enter the number of the destination you want to reach: ");
        Destination = scanner.nextInt();

        if(Destination >= 0 && Destination < ticket.length)
        {
            System.out.println("Ticket for " + ticket[Destination] + " is: " + ticketPrice[Destination] + " Rs");
        }
        else
        {
            System.out.println("Invalid input. Please enter a number between 0 and 4.");
        }
    }
}