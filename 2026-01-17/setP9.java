// First Repeating Element: Find the first repeating element in an array using HashSet.

import java.util.HashSet;

public class setP9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 4, 8, 2};

        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            if(set.contains(i)){
                System.out.println(i);
                return;
            }
            set.add(i);
        }

    }
}
