// WAJP to find second largest digit in the given number

import java.util.*;
public class digitSeperation9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        while(n > 0){
            int digit = n%10;

            if(digit > largest){
                secondLargest = largest;
                largest = digit;
            }else if(digit > secondLargest && digit < largest){
                secondLargest = digit;
            }

            n /= 10;
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}
