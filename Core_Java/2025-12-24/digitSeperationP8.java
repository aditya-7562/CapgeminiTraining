// WAJP to find second smallest digit in the given number

import java.util.*;

public class digitSeperationP8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        while(n > 0){
            int digit = n % 10;

            if(digit < smallest){
                secondSmallest = smallest;
                smallest = digit;
            }else if(digit < secondSmallest && digit > smallest){
                secondSmallest = digit;
            }

            n /= 10;
        }

        System.out.println(secondSmallest);
    }
}
