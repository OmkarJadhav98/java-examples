import java.util.Scanner;
public class BitwiseAND
{
    static int No1 = 0;
    static int No2 = 0;
    public static void main(String[] args)
    {
        System.out.println("Please enter first value:");
        Scanner scanner = new Scanner(System.in);

        No1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Please enter second value:");
        No2 = Integer.valueOf(scanner.nextLine());

        //bitwiseANDOperation();
        int result = No1 & No2;
        System.out.println("bitwise AND result: " + result);
    }
}
