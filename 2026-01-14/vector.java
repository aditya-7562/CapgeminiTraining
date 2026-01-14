/* Vector:
    - It is an implementing class of List interface.
    - It is a legacy class.
    - It is present in java.util package.
    - It is similar to ArrayList as it also follows dynamic array data structure.
    - Objects of vector are stored in contiguous memory locations.
    - It is synchronized in nature. (Thread-Safe)
    - Incremented capacity doubles the current capacity.


-> Differences between ArrayList and Vector:
    1. ArrayList is not synchronized but Vector is synchronized.
    2. In ArrayList, when the array is full, its capacity is increased by 50% of the current array size, whereas in Vector, the capacity is doubled.
    3. Because Vector is synchronized, it is generally slower than ArrayList for non-threaded operations.

 */

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        List<String> v = new Vector<>();
        v.add("Aditya");
        v.add("Vikash");
        v.add("Mihir");
        v.add("Adarsh");
        System.out.println(v);
        System.out.println(v.size());

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        System.out.println("---------------------");

        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}



