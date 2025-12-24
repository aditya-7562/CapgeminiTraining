// WAJP to check weather given number is prime or not
import java.util.*;
public class forLoopProblem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("The number " + n + " is prime.");
        } else {
            System.out.println("The number " + n + " is not prime.");
        }
    }
}
