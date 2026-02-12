// WAJP to print sum of all digits

import java.util.*;
public class digitSeperationP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0){
            int digit = n%10;
            sum += digit;
            n /= 10;
        }
        System.out.println("Total sum of digits is " + sum);
    }
}
