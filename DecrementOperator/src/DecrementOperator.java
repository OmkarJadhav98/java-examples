import java.util.Scanner;
public class DecrementOperator
{
        private static Scanner scanner = new Scanner(System.in);

        /*==========================================================================
        Pseudo code:
            1.  accept range
            2.  loop range >= 1
            3.  print range
            4.  range = range - 1
        ==========================================================================*/
        public static void decrementOperatorPrints(int range)
        {
            System.out.println("------------- Decrement operator output ---------------");

            while (range >= 1)
            {
                System.out.println(range);
                range--; //range = range - 1;
            }
            System.out.println("------------- Decrement operator output ends here ---------------");
        }

        public static void main(String[] args)
        {
            System.out.println("Please enter the range: ");
            int range = scanner.nextInt();
            decrementOperatorPrints(range);
        }
}
