// WAJP to print all palindrom numbers from 100 to 200

public class digitSeperation18 {
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            int rev = 0;
            int temp = i;

            while (temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }

            if(rev == i){
                System.out.println(i);
            }
        }
    }
}
