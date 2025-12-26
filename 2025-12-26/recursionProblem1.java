// WAJP to print all the numbers from range 1 to 1000 without loops


public class recursionProblem1 {
    public static void print(int num){
        if(num == 1001) return;

        System.out.println(num);
        print(num + 1);
        
    }
    public static void main(String[] args) {
        print(1);
    }
}
