import java.util.Scanner;

public class ArmstrongNumber1
{
    private  static final Scanner scanner = new Scanner(System.in);

    public static boolean Armstrong(int No)
    {
        int originalNumber = 0;
        int remainder = 0;
        int result = 0;
        int iNo = 0;

        originalNumber = No;

        while(originalNumber != 0)
        {
            originalNumber /= 10;
            ++iNo;
        }

        originalNumber = No;

        while(originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, iNo);
            originalNumber /= 10;
        }

        return  No == result;
    }
    public static void main(String[] args)
    {
        System.out.println("Please Enter a number to check if it's an Armstrong number: ");

        int No = scanner.nextInt();

        if(Armstrong(No))
        {
            System.out.println(No + " is an Armstrong number");
        }
        else
        {
            System.out.println(No + " is not an Armstrong number");
        }
    }
}
