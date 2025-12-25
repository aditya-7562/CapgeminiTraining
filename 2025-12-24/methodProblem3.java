// WAJP to check wheather the given number is part of fibonacci series or not.

public class methodProblem3 {

    public static boolean isFibonacci(int n) {
        int first = 0;
        int second = 1;
        while (first < n) {
            int next = first + second;
            first = second;
            second = next;
        }
        return first == n;
    }
    public static void main(String[] args) {
        System.out.println("Is 13 part of fibonacci series? " + isFibonacci(13));
        System.out.println("Is 14 part of fibonacci series? " + isFibonacci(14));   
    }
}
