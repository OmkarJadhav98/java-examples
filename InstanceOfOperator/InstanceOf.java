public class InstanceOf
{
    public static void main(String[] args)
    {
        String city = "Pune";
        Integer length = 20;
        Double temp = 35.5;

        if (city instanceof String)
        {
            System.out.println("This type of city is String");
        }
        else
        {
            System.out.println("This type of city is Not String");
        }

        if (length instanceof Integer)
        {
            System.out.println("This type of length is Integer");
        }
        else
        {
            System.out.println("This type of length is Not Integer");
        }

        if (temp instanceof Double)
        {
            System.out.println("This type of temp is Double");
        }
        else
        {
            System.out.println("This type of temp is Not Double");
        }
    }
}
