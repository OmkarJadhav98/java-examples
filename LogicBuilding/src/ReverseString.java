//Problem: Given a string, reverse it.


//      Main logic:-
//      public String reverseString(String str) {
//              return new StringBuilder(str).reverse().toString();
//      }

//  Using logic

public class ReverseString{
    public String reverseString(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        ReverseString sr = new ReverseString();

        String original1 = "Hello World!";
        String original2 = "Java Programming";

        System.out.println("Original: " + original1);
        System.out.println("Reversed: " + sr.reverseString(original1));
        System.out.println("============================================");

        System.out.println("Original: " + original2);
        System.out.println("Reversed: " + sr.reverseString(original2));
        System.out.println("============================================");
    }
}

