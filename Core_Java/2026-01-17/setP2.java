// 2. Count Unique Elements: Write a program to count the number of unique characters in a given string using Set.

import java.util.HashSet;

public class setP2 {
    public static void main(String[] args) {
        String input = "hello aditya";
        HashSet<Character> set = new HashSet<>();
        for (char c : input.toCharArray()) {
            set.add(c);
        }
        System.out.println("Number of unique characters: " + set.size());
    }
}
