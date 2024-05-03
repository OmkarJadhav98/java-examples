/*========================================================================
Write a program to calculate the sum of first 10 natural number.
=========================================================================*/
public class SumOfNaturalNumbers
{
    public static void main(String[] args)
    {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i; // Add each number to sum
        }

        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }
}
