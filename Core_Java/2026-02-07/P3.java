/* Write a Java program to:
Store employee ID and name using HashMap
Display all employee details
*/

import java.util.HashMap;
import java.util.Map;

public class P3 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(101, "Aditya");
        m.put(102, "Adarsh");
        m.put(103, "Namita");
        m.put(104, "Vishnu");
        m.put(105, "Vikash");

        System.out.println(m);
    }
}
