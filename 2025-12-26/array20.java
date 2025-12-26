// WAJP to find the count of elements of an array which are equal to the average of all elements of that array

import java.util.Scanner;

public class array20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements for the array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        int average = sum/n;

        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == average) count++;
        }
        System.out.println("Count: " + count);
    }
}
