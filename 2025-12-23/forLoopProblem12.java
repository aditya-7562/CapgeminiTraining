// WAJP to print all perfect numbers from 1 to 100
// if sum of all the factors of n excluding n is equals to n then n is a perfect number.

public class forLoopProblem12 {
    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if (sum == n) {
                System.out.println(n);
            }
        }
    }
}
