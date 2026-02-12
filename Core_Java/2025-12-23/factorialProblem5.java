// WAJP to print addition of all primes from 32 to 50

public class factorialProblem5 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 32; i <= 50; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                sum += i;
            }
        }
        System.out.println("Sum of all primes from 32 to 50 is: " + sum);
    }
}
