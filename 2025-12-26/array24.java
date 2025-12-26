// WAJP to reverse each element of the array and store it in the same position;

import java.util.Scanner;

public class array24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements for the array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int num = arr[i];
            int rev = 0;
            while(num != 0){
                int digit = num%10;
                rev = rev*10 + digit;
                num /= 10;
            }
            arr[i] = rev;
        }

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
