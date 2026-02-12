// 5. Union of Two Sets: Find the union of two sets using Set methods.
import java.util.*;
public class setP5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i : arr1){
            set1.add(i);
        }
        for(int i : arr2){
            set2.add(i);
        }

        for(int i : set1){
            set2.add(i);
        }

        System.out.println(set2);

    }
}
