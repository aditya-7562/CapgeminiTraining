// WAJP to print special numbers from range 1 to 100

public class digitSeperationP11 {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            int sum = 0;
            int product = 1;
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;

                sum += digit;
                product *= digit;

                temp /= 10;
            }

            int total = sum + product;
            if (total == i) {
                System.out.println(i);
            }

        }
    }
}
