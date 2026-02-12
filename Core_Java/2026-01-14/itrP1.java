// WAJP to remove objects from list one by one using iterator.

import java.util.*;
public class itrP1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            list.add(i);
        }
        System.out.println("Original List: " + list);
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            itr.next();
            itr.remove();
            System.out.println("List after removal: " + list);
        }
    }
}
