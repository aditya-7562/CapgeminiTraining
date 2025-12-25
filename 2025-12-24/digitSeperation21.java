
/*
Write a program to Check Given Number is a Xylem or Phloem  Number. and return a suitable message.
Explanation:-
A number N will be a xylem number if the sum of its extreme (first and last) digits is equal to the sum of mean means digits present in the middle other than first and last digit(all digits except first and last) digits. If the sum of extreme digits is not equal to the sum of mean digits, the number is called phloem number.
Check Inner sum and Outer sum are the same or not. Both are the same return(String return type) 1 otherwise 0.
1 --> xylem number
0 --> phloem number


Example:-

         int num = 12341
         outer values = 1,1-----> add both 1+1=2 --->outer sum is 2.
         inner values = 2,3,4----->  add those 2+3+4 ----->inner sum is 9.
         compare both inner and outer 
         Both are not equal. So, return 0.
         if both are equal, So,return 1 .
*/
import java.util.*;

public class digitSeperation21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // int innerSum = 0;
        // int outerSum = 0;
        // int a = n % 10, b = 0;
        // n = n / 10;
        // while (n > 0) {
        //     int digit = n % 10;
        //     innerSum += digit;
        //     b = digit;
        //     n /= 10;
        // }
        // innerSum -= b;
        // outerSum = a + b;
        // System.out.println(innerSum + " " + outerSum);

        int out = n%10;
        int in = 0;

        n /= 10;

        while(n>10){
            int digit = n%10;
            in += digit;
            n /= 10;
        }
        out += n;

        if(out == in){
            System.out.println(1);
        }else{
            System.out.println(0);

        }
    }
}
