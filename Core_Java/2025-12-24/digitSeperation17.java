// WAJP to check palindrome number

import java.util.*;
public class digitSeperation17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int rev = 0;
        int temp = n;

        while(temp > 0){
            int digit = temp%10;
            rev = rev*10 + digit;
            temp /= 10;
        }

        if(rev == n){
            System.out.println(n + " is a palindrome");
        }else{
            System.out.println(n + " is not a palindrome");

        }
    }
}
