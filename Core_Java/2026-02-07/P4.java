/* Write a Java program using Stream API to:
Store integers in a list
Filter and display only even numbers

*/

import java.util.List;
import java.util.stream.Collectors;

public class P4 {
    public static void main(String[] args) {
        List<Integer> ls = List.of(1, 2, 3, 4, 4, 5, 8, 9, 3, 40, 7, 11);

        List<Integer> evenLs = ls.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(evenLs);
    }
}
