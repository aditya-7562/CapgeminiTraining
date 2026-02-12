// WAJP to print factorial of every digit in the given number

import java.util.*;
public class digitSeperation14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        while(n > 0){
            int digit = n % 10;
            int fact = 1;
            for(int i = 1; i <= digit; i++){
                fact *= i;
            }
            System.out.println(digit + "! = " + fact);
            n /= 10;
        }
    }
}