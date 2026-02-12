/*
    WAJP to print characters from the range
    A to M
    x to m
    by using while loop
*/

public class whileLoopProblem2 {
    public static void main(String[] args) {
        System.out.println("***************** A to M **********************");
        char c = 'A';
        while(c <= 'M'){
            System.out.println(c);
            c++;
        }
        System.out.println("***************** x to m **********************");
        char d = 'x';
        while(d >= 'm'){
            System.out.println(d);
            d--;
        }
    }
}
