// WAJP to check weather the given number is special number ot not
/*
    Example:
        19 is a special number because
        sum of digits 1 & 9 = 10
        product of digit 1 & 9 = 9
        total = sum + product = 19 = origina number
*/
import java.util.*;
public class digitSeperation10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int product = 1;
        int temp = n;

        while(temp > 0){
            int digit = temp % 10;

            sum += digit;
            product *= digit;

            temp /= 10;
        }
        int total = sum + product;
        if(total == n){
            System.out.println(n + " is a special number.");
        }else{
            System.out.println(n + " is not a special number.");
        }
    }
}
