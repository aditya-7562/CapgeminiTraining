// WAJP to print numbers which are divisible by 7 from the range of 100 to 50

public class forLoopProblem5 {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 7 from 100 to 50:");
        for (int i = 100; i >= 50; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
