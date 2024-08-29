package ReverseString;//Problem: Given a string, reverse it.


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

        System.out.println("Original1: " + original1);
        System.out.println("Reversed1: " + sr.reverseString(original1));
        System.out.println("============================================");

        System.out.println("Original2: " + original2);
        System.out.println("Reversed2: " + sr.reverseString(original2));
        System.out.println("============================================");
    }
}

