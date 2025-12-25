// WAJP to find if the given number is a Niven number
/*
    24 is a Niven number if:
        sum of digits is 6 && 24 % 6 == 0
*/


import java.util.*;
public class digitSeperation12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int temp = n;

        while(temp > 0){
            int digit = temp%10;
            sum += digit;
            temp /= 10;
        }

        if(n % sum == 0){
            System.out.println(n + " is a Niven number.");
        }else{
            System.out.println(n + " is not a Niven number.");
        }
    }
}
