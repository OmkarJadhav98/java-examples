# Explanation:
## 1. MissingNumberFinder Class:
   The `MissingNumberFinder` class contains the `findMissingNumber` method, which is designed to find the missing number in a given array of integers.

## 2. findMissingNumber Method:
**Input:** 
- An array of integers `arr` that contains numbers from `1` to `n`, with one number missing.

**Initialization:**

- The method calculates the expected sum of numbers from `1` to `n` using the formula:

   ![img_2.png](img_2.png)

- It also calculates the actual sum of the elements in the array using a simple summation loop.

**Finding the Missing Number:**

- The missing number is found by subtracting the actual sum from the expected sum:

   ![img_3.png](img_3.png)

- This difference gives the missing number.

**Return:**

- The method returns the missing number, which completes the sequence.
## 3. main Method:

**Instantiation:**

- The `main` method creates an instance of the `MissingNumberFinder` class.

**Test Arrays:**

-  The program defines three test arrays:
   - `array1`: A sequence from `1` to `5` with the number `3` missing.
   - `array2`: A sequence from `1` to `10` with the number `7` missing.
   - `array3`: A sequence from `1` to `100` with the number `56` missing.

**Finding the Missing Number:**

- The `findMissingNumber` method is called for each array, and the missing number is printed to the console.

## Outputs:
When the program is run, the output will be:

```yaml
Missing number in array1: 3
Missing number in array2: 7
Missing number in array3: 56
```
- For array1 with elements {1, 2, 4, 5}, the missing number is 3.
- For array2 with elements {1, 2, 3, 4, 5, 6, 8, 9, 10}, the missing number is 7.
- For array3 with elements {1, 2, 3, ..., 55, 57, ..., 100}, the missing number is 56.

## Conclusion:
This program demonstrates how to find the missing number in a sequence of integers using a simple arithmetic approach. By calculating the expected sum of the complete sequence and comparing it with the actual sum of the array elements, we can easily identify the missing number.