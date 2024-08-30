package MissingNumberFinder;

public class MissingNumberFinder {

    public static int findMissingNumber(int[] arr, int n){
        int expectedSum = n *(n+1)/2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        MissingNumberFinder finder = new MissingNumberFinder();
        int[] array1 = {1, 2, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5, 6, 8, 9, 10}; //
        int[] array3 = new int[99]; //
        for (int i = 0, j = 1; i < array3.length; j++) {
            if (j != 86) {
                array3[i++] = j;
            }
        }

        System.out.println("Missing number in array1: " + finder.findMissingNumber(array1, 5));
        System.out.println("Missing number in array2: " + finder.findMissingNumber(array2, 10));
        System.out.println("Missing number in array3: " + finder.findMissingNumber(array3, 100));

    }
}
