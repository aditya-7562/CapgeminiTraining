// WAJP to solve 2sum problem

import java.util.Scanner;

public class array19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements for the array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter taget number: ");
        int target = sc.nextInt();
        int[] res = new int[2];
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        for(int i = 0; i < res.length; i++){
            System.out.println("Index: "+res[i]);
        }
    }
}
