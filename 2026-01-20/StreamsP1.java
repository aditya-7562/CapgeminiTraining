/* WAJP to print objects ending with sh
 */

import java.util.List;

public class StreamsP1 {
    public static void main(String[] args) {
        List<String> names = List.of("Nitish", "Vikash", "Anil", "Aditya", "Devansh");
        names.stream().filter(name -> name.endsWith("sh")).forEach(System.out :: println);
    }
}
