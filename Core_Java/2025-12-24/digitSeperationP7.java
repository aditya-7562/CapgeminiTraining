// WAJP to find the largest digit in the given number

import java.util.*;
public class digitSeperationP7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        while(n > 0){
            int digit = n%10;
            largest = Math.max(largest, digit);
            n/=10;
        }
        System.out.println("Largest: " + largest);
    }
}
