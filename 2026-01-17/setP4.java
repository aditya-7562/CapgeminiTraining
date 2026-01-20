// 4. Check Element Presence: Check whether a given element exists in a Set.
import java.util.*;
public class setP4 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set.contains(3));
        System.out.println(set.contains(5));
    }
    
}
