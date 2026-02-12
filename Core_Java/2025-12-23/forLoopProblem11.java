// WAJP to check if the given number is a perfect number
// if sum of all the factors of n excluding n is equals to n then n is a perfect number.

import java.util.*;
public class forLoopProblem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println( n + " is a perfect number.");
        } else {
            System.out.println( n + " is not a perfect number.");
        }
    }
}
