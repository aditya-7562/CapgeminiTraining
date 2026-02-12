import java.util.LinkedHashSet;
import java.util.HashSet;

public class setP10 {
    public static void main(String[] args) {
        String input = "AAABBBBCCDAAE";

        LinkedHashSet<Character> nonRepeating = new LinkedHashSet<>();
        HashSet<Character> repeating = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (repeating.contains(ch)) {
                continue;
            }

            if (nonRepeating.contains(ch)) {
                nonRepeating.remove(ch);
                repeating.add(ch);
            } else {
                nonRepeating.add(ch);
            }
        }

        if (!nonRepeating.isEmpty()) {
            System.out.println("First non-repeating character: " + nonRepeating.iterator().next());
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
// This program finds the first non-repeating character in a given string using LinkedHashSet and HashSet.