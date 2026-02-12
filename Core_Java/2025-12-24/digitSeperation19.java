/*
    WAJP to check abundant number, if yes print 1 else print 0
    12 is an abundant number because:
        sum of proper factors(1+2+3+4+6 = 16) > original number (12)
*/

import java.util.Scanner;

public class digitSeperation19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(sum > n){
            System.out.println(1);
        }else{
            System.out.println(0);

        }
    }
}
