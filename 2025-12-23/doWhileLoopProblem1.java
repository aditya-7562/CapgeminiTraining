/*
    WAJP to print numbers in the range
    -111 to -101
    123 to 113
    5 to -5
    -10 to 0
    by using do while loop
*/

public class doWhileLoopProblem1 {
    public static void main(String[] args) {
        System.out.println("*************** -111 to -101 ********************");
        int a = -111;
        do {
            System.out.println(a);
            a++;
        } while (a <= -101);

        System.out.println("*************** 123 to 113 ********************");
        int b = 123;
        do {
            System.out.println(b);
            b--;
        } while (b >= 113);

        System.out.println("*************** 5 to -5 ********************");
        int c = 5;
        do {
            System.out.println(c);
            c--;
        } while (c >= -5);

        System.out.println("*************** -10 to 0 ********************");
        int d = -10;
        do {
            System.out.println(d);
            d++;
        } while (d <= 0);
    }
}
