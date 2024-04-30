import java.util.Scanner;

public class PrimeNumber1
{
    public static boolean isPrime(int num)
    {
        if (num <= 1)
        {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(num))
        {
            if (num % i == 0)
            {
                return false;
            }
            i++;
        }
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

