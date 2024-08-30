package DuplicateRemover;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemover {

    public static int[] removeDuplicates(int[] arr){

        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set){
            result[index++] =num;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arrayWithDuplicates = {1,2,2,3,4,4,5,6,7,7,8,9,9};

        int[] arrayWithoutDuplicates = removeDuplicates(arrayWithDuplicates);

        System.out.println("Array without duplicates: " + Arrays.toString(arrayWithoutDuplicates));
    }
}
