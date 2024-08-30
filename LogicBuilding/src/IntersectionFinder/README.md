# Finding the Intersection of Two Arrays
### 1. IntersectionFinder Class:
   The `IntersectionFinder` class contains the `findIntersection` method, which is designed to find the common elements between two arrays of integers.

### 2. findIntersection Method:
**Input:** Two arrays of integers, `arr1` and `arr2`.

**Initialization:**

- The method uses a `HashSet` to store elements from the first array (`arr1`). A `HashSet` is chosen because it provides efficient O(1) average time complexity for insertion and lookup operations.
- Another `HashSet` is used to store the intersection results.

**Processing:**

- First, all elements from `arr1` are added to the first `HashSet`.
  - Then, the method iterates over `arr2`. For each element in `arr2`, it checks if the element is present in the first `HashSet`. If it is, the element is added to the intersection results `HashSet`.

**Return:**

- The method converts the intersection `HashSet` to an array and returns it.
### 3. main Method:
**Instantiation:**

- An instance of the `IntersectionFinder` class is created.

**Test Arrays:**

- The program defines two test arrays:
  - `array1`: Contains a set of integers.
  - `array2`: Contains another set of integers, some of which overlap with array1.

**Finding Intersection:**

- The `findIntersection` method is called with these arrays, and the resulting intersection is printed to the console.

# Outputs:
When the program is run, the output will be:

```yaml
Intersection of array1 and array2: [3, 7, 8]
```

- For `array1` with elements `{1, 2, 3, 4, 5, 7, 8}` and `array2` with elements `{3, 7, 8, 10, 12}`, the common elements are `3`, `7`, and `8`.

# Conclusion:
This program demonstrates how to find the intersection of two arrays efficiently using `HashSet`. This approach ensures that duplicate elements are not included in the intersection and provides quick lookup times.