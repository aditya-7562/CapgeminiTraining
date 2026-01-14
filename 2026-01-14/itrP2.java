// WAJP to remove from backward direction using ListIterator.

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class itrP2 {
    public static void main(String[] args) {
        String[] a = {"suraj", "mridul", "kabir", "girish"};
        List<String> list = new ArrayList<>();
        for(String s : a) {
            list.add(s);
        }
        System.out.println(list);
        ListIterator<String> ltr = list.listIterator();
        while(ltr.hasNext()) {
            ltr.next();
        }
        while(ltr.hasPrevious()) {
            ltr.previous();
            ltr.remove();
            System.out.println(list);
        }
    }
}
