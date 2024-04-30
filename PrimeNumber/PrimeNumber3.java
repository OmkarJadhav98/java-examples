import java.util.Scanner;

public class PrimeNumber3
{
    public static boolean isPrime(int num)
    {
        if (num <= 1)
        {
            return false;
        }
        if(num == 2)
        {
            return true;
        }

        int i = 2;
        do
        {
            if (num % i == 0)
            {
                return false;
            }
            i++;
        }while (i <= Math.sqrt(num));
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        if (isPrime(number))
        {
            System.out.println(number + " is a prime number.");
        }
        else
        {
            System.out.println(number + " is not a prime number.");
        }
    }
}

