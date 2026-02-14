/* Write a Java program to:
Store integers in an ArrayList
Count how many times a given number appears in the list
*/

import java.util.List;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        List<Integer> ls = List.of(1, 2, 3, 4, 4, 5, 8, 9, 3, 40);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i : ls){
            if(i == n) count++;
        }
        System.out.println(count);
        sc.close();
    }
}
