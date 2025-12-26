// WAJP to find average of largest and smallest elements of the array

import java.util.Scanner;

public class array21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements for the array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sCount = 0;
        int lCount = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
               largest = arr[i]; 
            } 
            if(arr[i] < smallest){
                smallest = arr[i];
            } 
        }

        for(int i = 0; i < n; i++){
            if(arr[i] == smallest) sCount++;
            if(arr[i] == largest) lCount++;
        }

        double sum = (smallest*sCount) + (largest*lCount);
        double average = sum / (sCount + lCount);
        System.out.println(average);
    }
}
