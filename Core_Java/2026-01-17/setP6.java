// 6. Intersection of Two Sets: Find the intersection of two sets using retainAll().

import java.util.*;
public class setP6 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        s1.retainAll(s2);

        System.out.println("Intersection after retainAll(): " + s1);
    }
}
