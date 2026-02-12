// 1. Remove Duplicates: Given an array of integers, remove duplicate elements using HashSet and print unique values.

import java.util.*;
public  class setP1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 5, 3};
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println("Unique values: " + uniqueNumbers);
    }
    
}
