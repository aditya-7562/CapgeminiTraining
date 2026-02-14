/* Write a Java program to:
Create an ArrayList of student names
Add at least 5 names
Display all names using a loop
*/

import java.util.ArrayList;
import java.util.List;

public class P1 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Aditya");
        ls.add("Vikash");
        ls.add("Vishnu");
        ls.add("Mihir");
        ls.add("Pradeep");

        for(String s : ls){
            System.out.println(s);
        }
    }
}
