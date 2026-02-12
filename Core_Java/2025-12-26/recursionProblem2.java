// WAJP to print odd numbers from the range 500 to 50 without using any loops

public class recursionProblem2 {
    public static void print(int n){
        if( n < 50) return;
        if(n % 2 != 0){
            System.out.println(n);
        }
        print(n-1);
    }
    public static void main(String[] args) {
        print(500);
    }
}
