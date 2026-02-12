// WAJP to print factorial of all odd numbers from 10 to 1.

public class factorialProblem3 {
    public static void main(String[] args) {
        for (int n = 9; n >= 1; n -= 2) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        }
    }
}
