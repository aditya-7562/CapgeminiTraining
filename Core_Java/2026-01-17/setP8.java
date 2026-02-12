// Remove all even numbers from a Set while iterating.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class setP8 {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        Iterator<Integer> it = A.iterator();
        while (it.hasNext()) {
            int i = it.next();
            if (i % 2 == 0) {
                it.remove(); 
            }
        }

        System.out.println(A);
    }
}
