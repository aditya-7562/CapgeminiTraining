/* WAJP that performs multiple mathematical operations using methods.
    1. Find Maximum: findMax(int a, int b, int c), returns largest number.
    2. Check Prime: isPrime(int num), returns boolean
    3. Find Minimum: findMin(int a, int b, int c), returns smallest number.
    4. Fibonacci Calculation: fibonacci(int n), returns nth fibonacci number.

*/

public class methodProblem2 {

    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Maximum of (12, 45, 23): " + findMax(12, 45, 23));
        System.out.println("Is 17 prime? " + isPrime(17));
        System.out.println("Minimum of (12, 45, 23): " + findMin(12, 45, 23));
        System.out.println("Fibonacci of 12: " + fibonacci(12));
    }
}
