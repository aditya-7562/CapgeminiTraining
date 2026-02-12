// WAJP to find the product of sums of all the evn digits and odd digits in a given number
import java.util.*;
public class digitSeperationP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while(n > 0){
            int digit = n % 10;
            if(digit % 2 == 0){
                evenSum += digit;
            }else{
                oddSum += digit;
            }
            n /= 10;
        }
        System.out.println(evenSum * oddSum);
    }
}
