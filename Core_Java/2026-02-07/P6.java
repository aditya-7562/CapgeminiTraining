/* Write a Java program using Stream API to:
Store integers in a list
Count how many numbers are greater than 50
*/

import java.util.List;

public class P6 {
    public static void main(String[] args) {
        List<Integer> ls = List.of(1, 2, 3, 4, 4, 51, 82, 9, 3, 40, 77, 11);
        long n = ls.stream().filter(x -> x>50).count();
        System.out.println(n);
    }
}
