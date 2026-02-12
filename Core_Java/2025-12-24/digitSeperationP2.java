// WAJP to print all prime number digits in the given number

import java.util.*;
public class digitSeperationP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        while(n!=0){
            int digit = n % 10;
            if(digit == 2 || digit == 3 || digit == 5 || digit == 7){
                System.out.println(digit);
            }
            n = n / 10;
        }
    }
}
