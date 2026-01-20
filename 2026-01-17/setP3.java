// 3. Common Elements: Find common elements between two integer arrays using HashSet.

import java.util.*;
public class setP3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr1){
            set.add(i);
        }
        System.out.println("Common elements between two array: ");
        for(int i : arr2){
            if(set.contains(i)){
                System.out.println(i);
            }else{
                set.add(i);
            }
        }


    }    
}
