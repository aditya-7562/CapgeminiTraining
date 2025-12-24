// WAJP to pront factorial of all prime numbers from 14 to 5.

public class factorialProblem4 {
    public static void main(String[] args) {
        for(int i = 14; i >= 5; i--) {
            boolean isPrime = true;
            for(int j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                int fact = 1;
                for(int k = 1; k <= i; k++) {
                    fact *= k;
                }
                System.out.println("Factorial of " + i + " is: " + fact);
            }
        }
    }
}
