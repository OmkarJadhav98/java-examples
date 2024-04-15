import java.util.Scanner;

public class IncrementOperator
{
        /*===================================================================================
         Pseudo code:
            1. create a variable and name it as no = 1
            2. loop no <= 21
        	3. print no
        	4. no = no + 1
        ===================================================================================*/
        private static Scanner scanner = new Scanner(System.in);

        public static void incrementOperatorPrints(int range)
        {
            System.out.println("------------- Increment operator output Start ---------------");
            int no = 1;
            while (no <= range) {
                System.out.println(no);
                no++; //no = no + 1;
            }
            System.out.println("------------- Increment operator output ends here ---------------");
        }
        public static void main(String[] args)
        {
            System.out.println("Please enter the Number: ");
            int range = scanner.nextInt();
            incrementOperatorPrints(range);
        }
}
