// WAJP to print all the strong number from 1 to 1000

public class digitSeperation16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50000; i++) {
            int sum = 0;
            
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                int fact = 1;
                for (int j = 1; j <= digit; j++) {
                    fact *= j;
                }
                sum += fact;
                temp /= 10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
