import java.util.Scanner;
public class _1
{
    public static void main(String[] args)
    {
         System.out.println("Please enter a First number:");

         Scanner scanner = new Scanner(System.in);
         String no1 = scanner.nextLine();

         System.out.println("Please enter a Second nmuber:");
         String no2 = scanner.nextLine();

         int a = Integer.valueOf(no1);
         int b = Integer.valueOf(no2);

         if(a < b)
         {
             System.out.println("Value of 'a' is Smaller than 'b'.");
         }
         else
         {
             System.out.println("Value of 'a' is not Smaller than 'b'.");
         }
    }
}
