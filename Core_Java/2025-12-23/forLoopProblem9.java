// WAJP to print prime numbers from the range from 20 to 1

public class forLoopProblem9 {
    public static void main(String[] args) {
        for (int i = 20; i >= 1; i--) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
