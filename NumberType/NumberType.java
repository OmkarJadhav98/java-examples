import java.util.Scanner;
public class NumberType
{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        /*================================================================
            Psuedo Code:
                1. Display a msg to user to enter a positive value
                2. Accept the value from user (scanner class usage)
                3. if(no % 2 == 0)
                {
                    if(no is greater than 100) -> Golden no
                    esle if (_no is smaller than 100 ) -> silver no
                }else
                {
                    if no is greater than 100 -> platinum no
                    if no is smaller than 100 -> titanium no
                }
        ================================================================*/

        System.out.println("Please enter a number : ");
        int no = scanner.nextInt();

        if((no % 2 == 0) && (no > 100))
        {
            System.out.println("This number is Golden number...");
        }
        else if((no % 2 == 0) &&(no <= 100))
        {
            System.out.println("This number is Silver number...");
        }
        else if((no % 2 != 0) && (no > 100))
        {
            System.out.println("This number is Platinum number...");
        }
        else if ((no % 2 != 0) && (no <= 100))
        {
            System.out.println("This number is Titanium number...");
        }
    }
}
