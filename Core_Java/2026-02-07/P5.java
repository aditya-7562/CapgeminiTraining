/* Write a Java program using Stream API to:
Store names in a list
Convert all names to uppercase
Display the result
*/

import java.util.List;
import java.util.stream.Collectors;

public class P5 {
    public static void main(String[] args) {
        List<String> ls = List.of("Aditya", "Vishnu", "Namita", "Adarsh", "Mihir");

        List<String> upperLs = ls.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperLs);
    }
}
