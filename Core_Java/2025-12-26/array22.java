// WAJP to find all the leader elements of the array, leader is one which does not have any greater elements towards right of it

import java.util.Scanner;

public class array22 {
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
            boolean flag = true;
            for(int j = i+1; j < n; j++){
                if(arr[i] <= arr[j]){
                    flag = false;
                }
            }
            if(flag){
                System.out.println("leaders: " + arr[i]);
            }
        }
    }
}
