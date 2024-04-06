public class Subtraction
{
    public static void main(String[] args)
    {
        int No1 = 10;
        int No2 = 30;
        int INTEGER = No1 - No2;

        long iLong1 = 32151;
        long iLong2 = 651651;
        long LONG = iLong1 - iLong2;

        float No3 = 22.22f;
        float No4 = 10.10f;
        float FLOAT = No3 - No4;

        double iNo1 = 10.11111;
        double iNo2 = 20.11111;
        double DOUBLE = iNo1 - iNo2;

        char iNo3 = '8';
        char iNo4 = '2';
        int CHAR = (iNo3 - '0') - (iNo4 - '0');

        System.out.println("Subtraction of integer is : "+INTEGER);
        System.out.println("Subtraction of long is : "+LONG);
        System.out.println("Subtraction of float is : "+FLOAT);
        System.out.println("Subtraction of double is : "+DOUBLE);
        System.out.println("Subtraction of character is : "+CHAR);
    }
}
