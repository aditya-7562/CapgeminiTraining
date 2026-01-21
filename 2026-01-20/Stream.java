/* Stream:
    Stream is a Java 8 feature used to process collection data in a functional style without using loops.
    It does not store data, works on collection, processes data one by one and does not modify the original collection.

    Basic stream flow: Collection -> Stream -> Operations -> Result
    eg: List -> Stream() -> filter() -> forEach()

    Basic methods:
    1. stream(): Used to convert a collection into a stream.
    2. filter(): Used to filter elements based on a condition.
    3. map(): Used to transform elements in the stream to another form.
    4. forEach(): Used to perform an action for each element in the stream.
    5. collect(): Used to collect the result from the stream into a collection.
    6. sorted(): Used to sort the elements in the stream in naturl order (uses Comparable).
    7. sorted(Comparator): Used to sort the elements in the stream based on a custom comparator.
    8. reduce(): Used to combine elements in the stream to produce a single result.
    9. distinct(): Used to remove duplicate elements from the stream.
    10. limit(): Used to limit the number of elements in the stream.
    11. skip(): Used to skip a number of elements in the stream.
    12. count(): Used to count the number of elements in the stream.
    13. anyMatch(): Used to check if any element in the stream matches a given condition.
    14. allMatch(): Used to check if all elements in the stream match a given condition.
    15. noneMatch(): Used to check if no elements in the stream match a given condition.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Print everything one by one: ");
        numbers.stream().forEach(System.out :: println);

        System.out.println("\nPrint even numbers from the list");
        numbers.stream().filter(n -> n%2 == 0).forEach(System.out :: println);

        System.out.println("\nPrint odd with 3 added to them: ");
        numbers.stream().filter(n -> n%2 != 0).map(n -> n+3).forEach(System.out :: println);

        System.out.println("\nfind even numbers and store them in a list:");
        List<Integer> even_collector = numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println(even_collector);
    }
}
