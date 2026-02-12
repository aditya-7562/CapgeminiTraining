/*
    WAJP to print characters in the range
    d to j
    m to e
    z to t
    r to x
    by using for loop
*/

public class forLoopProblem2 {
    public static void main(String[] args) {
        System.out.println("**************** d to j *********************");
        for(char i = 'd'; i <= 'j'; i++){
            System.out.println(i);
        }
        System.out.println("**************** m to e *********************");
        for(char i = 'm'; i >= 'e'; i--){
            System.out.println(i);
        }
        System.out.println("**************** z to t *********************");
        for(char i = 'z'; i >= 't'; i--){
            System.out.println(i);
        }
        System.out.println("**************** r to x *********************");
        for(char i = 'r'; i <= 'x'; i++){
            System.out.println(i);
        }
    }
}
