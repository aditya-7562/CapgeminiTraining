// WAJP to print all Niven numbers from 1 to 100

public class digitSeperation13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }

            if(i % sum == 0){
                System.out.println(i);
            }
        }
    }
}
