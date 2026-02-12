// WAJP to find a element of the array in which occurrence of k is maximum
/*
    int[] a = {37, 823, 122, 2322, 6017};
    int k = 2;
    output: 2322
*/

import java.util.Scanner;

public class array23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements for the array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target K: ");
        int k = sc.nextInt();

        int maxCount = 0;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            int num = arr[i];
            while(num != 0){
                int digit = num % 10;
                if(digit == k) count++;
                num /= 10;
            }
            if(count > maxCount){
                maxCount = count;
                index = i;
            }

        }
        System.out.println(arr[index]);
        
    }
}
