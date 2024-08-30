package PalindromeChecker;

public class PalindromeChecker {
    public static boolean isPalindrome(String input){

        String normalisedStr = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedStr = new StringBuilder(normalisedStr).reverse().toString();

        return normalisedStr.equals(reversedStr);
    }

    public static void main(String[] args) {

        String[] Str = {"Madam", "RaceCar", "Hello", "111"};

        for(String s : Str){
            System.out.println("Is \"" + s + "\" a palindrome? " + " -> " + isPalindrome(s));
        }
    }
}