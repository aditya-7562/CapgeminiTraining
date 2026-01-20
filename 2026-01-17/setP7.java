// 7. Difference of Sets: Find elements present in Set A but not in Set B.

import java.util.Arrays;
import java.util.HashSet;

public class setP7 {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> B = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        System.out.println("elements present in Set A but not in Set B: ");
        for(int i : A){
            if(B.contains(i)){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}
