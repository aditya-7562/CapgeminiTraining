/*
    WAJP to print numbers in the range
    1111 to 1121
    1234 to 1223
    -1111 to -1121
    -1234 to -1223
    by using for loop
*/

public class forLoopProblem1 {
    public static void main(String[] args) {
        System.out.println("**************** 1111 to 1121 *********************");
        for(int i = 1111; i <= 1121; i++){
            System.out.println(i);
        }
        System.out.println("**************** 1234 to 1223 *********************");
        for(int i = 1234; i >= 1223; i--){
            System.out.println(i);
        }
        System.out.println("**************** -1111 to -1121 *********************");
        for(int i = -1111; i >= -1121; i--){
            System.out.println(i);
        }
        System.out.println("**************** -1234 to -1223 *********************");
        for(int i = -1234; i <= -1223; i++){
            System.out.println(i);
        }
    }
}
