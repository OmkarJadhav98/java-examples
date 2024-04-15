import java.util.Scanner;
public class TernaryOperator
{
        private  static final Scanner scanner = new Scanner(System.in);
        public static void main(String[] args)
        {
            /*=======================================================================
            Pseudo code:
                1. Display a msg to user to enter a positive value
                2. accept the value from user (scanner class usage)
                3. (no % 2) == 0 -> this no is even
                4. else -> this no is odd

            =======================================================================*/

            System.out.println("Pls enter positive no: ");

            int no = scanner.nextInt();

            /*  old fashion code
            if (no % 2 == 0) {
                System.out.println("this no is even..");
            } else {
                System.out.println("this no is odd..");
            }*/

            // latest fashion code
            //(no % 2 == 0) ? System.out.println("this no is even..") : System.out.println("this no is odd..");

            System.out.println((no % 2 == 0) ? "this number is even using ternary operator.." : "this number is odd ternary operator..");
        }
}
