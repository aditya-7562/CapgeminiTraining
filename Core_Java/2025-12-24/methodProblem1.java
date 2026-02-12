/* WAJP to create a calculator class with 4 methods
    to add 3 variables
    to multiply 3 variables
    to subtract 3 variables
    to add 2 variables
*/
public class methodProblem1 {

    public static void add2(int a, int b){
        System.out.println(a+b);
    }
    public static void add3(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void subtract4(int a, int b, int c, int d){
        System.out.println(a-b-c-d);
    }
    public static void multiply(int a, int b, int c){
        System.out.println(a*b*c);
    }
    public static void main(String[] args) {
        add2(15, 22);
        add3(24, 36, 47);
        subtract4(21, 1, 6, 4);
        multiply(3, 5, 4);
    }
}
