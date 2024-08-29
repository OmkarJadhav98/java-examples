# Explanation:
## 1. findMax Class:

The `findMax` class contains the `findMax` method, which is designed to find the maximum element in an array of integers.

## 2. findMax Method:

- **Input**: An array of integers `arr`.
- **Initialization:**
The method initializes an integer variable `max` with the first element of the array (`arr[0]`).
- **Looping Through the Array:**
A `for-each` loop is used to iterate over every element (`num`) in the array.
Inside the loop, the method checks if the current element (`num`) is greater than the current value of `max`.
If `num` is greater, `max` is updated to the value of `num`.
- **Return:**
After the loop finishes, `max` will hold the largest value found in the array, which is then returned.

## 3. main Method:

- **Instantiation:** 
- An instance of the `findeMax` class is created.

- **Test Arrays:**
- The program defines three test arrays:
- `array1` contains positive integers.
- `array2` contains negative integers.
- `array3` contains a single element.

- **Finding Maximum:**
- The `findMax` method is called for each array, and the maximum value is printed to the console.

##  Outputs:
When we run this program, the output will be:

```yaml
    Maximum in array1: 8
    Maximum in array2: -2
    Maximum in array3: 8
```

- For array1 with elements {1, 2, 3, 4, 5, 8}, the maximum value is 8.
- For array2 with elements {-10, -3, -7, -2, -5}, the maximum value is -2.
- For array3 with a single element {8}, the maximum value is 8.


## Conclusion:
This program demonstrates how to find the maximum value in an array of integers using a simple iteration and comparison approach. The logic is straightforward, making it easy to understand and apply to various cases, including arrays with positive numbers, negative numbers, or a single element.