// WAJP to print all even digits of a number

import java.util.Scanner;

public class digitSeperationP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        while(n != 0){
            int digit = n % 10;
            if(digit % 2 == 0){
                System.out.println(digit);
            }
            n /= 10;
        }
    }
}
