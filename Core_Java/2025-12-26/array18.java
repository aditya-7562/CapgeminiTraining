// WAJP to find count of elements divisible by k in a given array
import java.util.*;
public class array18 {
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
        int count = 0;
        for(int i = 0; i < n; i++){
            if(target % arr[i]== 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
