/*
    WAJP to print numbers from the range
    -123 to -129
    79 to 84
    -110 to -100
    0 to -9
    by using while loop
*/

public class whileLoopProblem1 {
    public static void main(String[] args) {
        System.out.println("*************** -123 to -129 ********************");
        int a = -123;
        while (a >= -129) {
            System.out.println(a);
            a--;
        }
        System.out.println("*************** 79 to 84 ********************");
        int b = 79;
        while (b <= 84) {
            System.out.println(b);
            b++;
        }
        System.out.println("*************** -110 to -100 ********************");
        int c = -110;
        while (c <= -100) {
            System.out.println(c);
            c++;
        }
        System.out.println("*************** 0 to -9 ********************");
        int d = 0;
        while (d >= -9) {
            System.out.println(d);
            d--;
        }
    }
}
