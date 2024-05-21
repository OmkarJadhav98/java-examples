/*Write a program to associate the specified value with the specified key in a HashMap.*/

import java.util.*;
public class _1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map= new HashMap<>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        hash_map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
