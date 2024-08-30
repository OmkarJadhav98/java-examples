package IntersectionFinder;

import java.util.HashSet;
import java.util.Set;

// To find the intersection of two arrays.
public class IntersectionFinder {

    public static int [] findIntersection(int[] arr1, int[] arr2){

        Set<Integer> set1 = new HashSet<>();
        for(int num : arr1){
            set1.add(num);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int num : arr2){
            if(set1.contains(num)){
                intersection.add(num);
            }
        }
        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        IntersectionFinder finder = new IntersectionFinder();

        int[] array1 = {1,2,3,4,5,6,7,8,9};
        int[] array2 = {3,7,8,11,13};

        int[] result = finder.findIntersection(array1,array2);

        System.out.print("Intersection of array1 and array2: [");
        for(int i = 0; i < result.length; i++) {
            if(i > 0){
                System.out.print(", ");
            }
            System.out.print(result[i]);
        }
        System.out.println("]");
    }
}