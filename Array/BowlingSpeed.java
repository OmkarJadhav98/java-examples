/*E.g. please write a java code to accept bowling speed in a over.*/

import java.util.Scanner;
public class BowlingSpeed
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] BowlingSpeed = new int[6];
        int position = 0;

        while(position < 6)
        {
            System.out.println("Please Enter bowling speed of a " + (position+1) + " bowl "+ ": ");
            BowlingSpeed[position] = scanner.nextInt();
            position++;
        }

        System.out.println("================================");
        System.out.println("Speed of ball in a over are: ");
        System.out.println("================================");

        position = 0;
        while(position < 6)
        {
            System.out.println("Speed of " + (position+1)  + " ball " + "= " + BowlingSpeed[position] + " kmph");
            position++;
        }
    }
}
