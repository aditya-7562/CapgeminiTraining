// WAJP to print product of all the numbers from range 1 to 10

public class forLoopProblem6 {
    public static void main(String[] args) {
        System.out.println("Product of all numbers from 1 to 10:");
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
