/* Iterator:
    - iterator is a cursor, it is a interface.
    - to activate iterator cursor in collection we have iterator() method.
    - the return type of iterator() method is Iterator interface.
    - with the help of this method we can access hasNext(), next(), remove() methods of Iterator interface.
    - hasNext(): it returns boolean value, if there is next element then it returns true otherwise false.
    - next(): it returns the next element from the collection.
    - remove(): it removes the previous object of iteration. Which means we can use remove after next() method only. If we use remove() method directly then it will throw IllegalStateException. Return type of remove() method is void.
    - with the help of iterator we can traverse the collection in forward direction only.


    ListIterator:
     - 
*/

import java.util.*;

public class iterator {
    public static void main(String[] args) {
        // System.out.println(itr);// ArrayList$Itr@2a139a55
        // System.out.println(itr.hasNext());
        // // itr.remove(); IllegalStateException
        // System.out.println(itr.next());
        // System.out.println(itr.next());
        // System.out.println(itr.next());
        // System.out.println(itr.next());
        // System.out.println(itr.next());
        // System.out.println(itr.hasNext());
        // // System.out.println(itr.next()); NoSuchElementException
        String[] a = { "A", "B", "C", "D", "E" };
        List<String> list = new ArrayList<>();
        for (String s : a) {
            list.add(s);
        }

        System.out.println("Original List: " + list);
        ListIterator<String> ltr = list.listIterator();
        // System.out.println(ltr.hasPrevious()); // false
        // System.out.println(ltr.previous()); // NoSuchElementException
        System.out.println("---Forward Direction---");
        while (ltr.hasNext()) {
            String s = ltr.next();
            System.out.println(s);
        }
        System.out.println("---Backward Direction---");
        while (ltr.hasPrevious()) {
            String s = ltr.previous();
            System.out.println(s);
        }
    }
}
