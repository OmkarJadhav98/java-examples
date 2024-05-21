/*Write a program to get a set view of the keys contained in this map.*/

import java.util.*;
public class _11 {
    public static void main(String[] args){

        HashMap<Integer,String> hash_map= new HashMap<>();

        hash_map.put(1,"Red");
        hash_map.put(2,"Green");
        hash_map.put(3,"Black");
        hash_map.put(4,"White");
        hash_map.put(5,"Blue");

        // get key set value from map
        Set<Integer> keyset = hash_map.keySet();

        // check key set values
        System.out.println("Key set values are: " + keyset);
    }
}
