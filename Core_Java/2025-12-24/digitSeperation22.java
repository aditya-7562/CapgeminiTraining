/*
    Program to determine whether a given number is a Disarium number.

    A number is said to be disarium number if the sum of its digit raised to the power of their respective positions is equal to the number itself.
*/
import java.util.*;
public class digitSeperation22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int temp1 = n;
        int temp2 = n;
        int count = 0;
        while(temp1 > 0){
            count++;
            temp1 /= 10;
        }
        int sum = 0;
        while(temp2 > 0){
            int digit = temp2 % 10;
            sum += Math.pow(digit, count);
            count--;
            temp2 /= 10;
        }
        if(sum == n){
            System.out.println(n + " is a disarium number");
        }else{
            System.out.println(n + " is not a disarium number");

        }
    }
}
