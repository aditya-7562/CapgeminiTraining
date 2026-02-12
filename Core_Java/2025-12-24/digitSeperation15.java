// WAJP to check weather the given number is strong number or not.
/*
    145 is strong number because:
        sum of factorial of each digit  = original number
*/
import java.util.*;
public class digitSeperation15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int temp = n;

        while(temp > 0){
            int digit = temp % 10;
            int fact = 1;
            for(int i = 1; i <= digit; i++){
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }

        if(sum == n){
            System.out.println(n + " is a strong number");
        }else{
            System.out.println(n + " is not a strong number");

        }
    }
}
