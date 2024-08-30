# Explanation:
## 1. PalindromeChecker Class:
   The `PalindromeChecker` class contains the `isPalindrome` method, which is designed to check if a given string is a palindrome.

## 2. isPalindrome Method:
**Input:** 
- A string `input` that needs to be checked for being a palindrome.

**Normalization:**

- The method first removes all non-alphanumeric characters from the string using `replaceAll("[^a-zA-Z0-9]", "")`.
- It then converts the string to lowercase using `.toLowerCase()` to ensure the comparison is case-insensitive.

**Reversing the String:**

- The normalized string is reversed using `new StringBuilder(normalizedStr).reverse().toString()`.

**Comparison:**

- The method compares the normalized string with its reversed version.
- If the two strings are equal, the original string is a palindrome; otherwise, it is not.

**Return:**

- The method returns `true` if the string is a palindrome, and `false` otherwise.
## 3. main Method:
   **Instantiation:**

- The `main` method doesn't require instantiation since the `isPalindrome` method is `static`.

**Test Strings:**

- The program defines several test strings:
  - `"Madam"`: A case-insensitive palindrome.
  - `"Racecar"`: A palindrome that reads the same forward and backward.
  - `"Hello"`: Not a palindrome.
  - `"111"`: A palindrome that reads the same forward and backward.

**Checking for Palindromes:**

- The `isPalindrome` method is called for each test string, and the result is printed to the console.

## Outputs:
When the program is run, the output will be:

```yaml
    Is "Madam" a palindrome? true
    Is "RaceCar" a palindrome? true
    Is "Hello" a palindrome? false
    Is "111" a palindrome? true
```

- For the string `"Madam"`, the output is true because it reads the same forward and backward, ignoring case.
- For the string `"RaceCar"`, the output is true for the same reason.
- For the string `"Hello"`, the output is false because it does not read the same forward and backward.
- For the phrase `"111"`, the output is true because it reads the same when spaces, punctuation, and case are ignored.

## Conclusion:
- This program demonstrates how to check if a string is a palindrome by normalizing the input, reversing the string, and comparing it with the original. 
- The method is versatile, handling various inputs, including phrases with spaces, punctuation, and different cases.