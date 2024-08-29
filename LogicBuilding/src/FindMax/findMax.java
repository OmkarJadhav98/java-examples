package FindMax;
//////////////////////////////////////////////////////////////////////
//Problem: Given an array of integers, find the maximum element.
//////////////////////////////////////////////////////////////////////

public class findMax {
    public int Maxfinder(int[] arr) {
        int max = Integer.MIN_VALUE; // Assuming max is initialized to the smallest possible integer value
        for (int num : arr) {
            // If the current element is greater than max, update max
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        findMax max = new findMax();

        int[] array1 = {1,2,3,4,5,8};
        int[] array2 = {-10, -3, -7, -2, -5};
        int[] array3 = {8};

        System.out.println("Maximum in array1: " + max.Maxfinder(array1));
        System.out.println("Maximum in array2: " + max.Maxfinder(array2));
        System.out.println("Maximum in array3: " + max.Maxfinder(array3));
    }
}
