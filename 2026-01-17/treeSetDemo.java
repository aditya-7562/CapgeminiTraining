/* TreeSet:
    - It is an implementation class of Set interface.
    - It is present inside java.util package.
    - It was introduced in JDK 1.2
    - It follows sorted order (ascending order by default).
    - It does not follow insertion order.
    - It does not allow duplicate elements.
    - It does not allow null elements.
    - It can only allow same type of objects.
    - It is used when sorted data with uniqueness is required.
*/
import java.util.*;
public class treeSetDemo {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<String>();
        ts.add("Aditya");
        ts.add("Kabir");
        ts.add("Balaji");
        ts.add("Avinash");

        System.out.println("ASC: " + ts);

        TreeSet<String> dts = (TreeSet) ts;

        System.out.println("DESC: " + dts.descendingSet());

    }
}
