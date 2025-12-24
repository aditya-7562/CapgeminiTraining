// WAJP to print factorial of all numbers from 1 to 10

public class factorialProblem2 {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        }
    }
}
