// WAJP to print sum of all numbers from range 1 to 5 without using any loops.
public class recursionProblem3 {

    public static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
