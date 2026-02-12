// WAJP to print digits of a given number

import java.util.*;
public class digitSeperationP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        while(n!=0){
            int digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }
    }
}
