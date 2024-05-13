/*====================================================================================
Write a program to print out all Armstrong numbers between 1 and 500.
If sum of cubes of each digit of the number is equal to the number itself,
then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
====================================================================================*/

public class _1 {
    public static void main(String[] args) {
        for (int number = 1; number <= 500; number++) {
            int originalNumber = number;
            int result = 0;

            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, 3);
                originalNumber /= 10;
            }

            if (result == number) {
                System.out.println(number + " is an Armstrong number.");
            }
        }
    }
}

