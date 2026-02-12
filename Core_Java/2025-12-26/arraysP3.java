// WAJP to print perfect number elements from the given array

public class arraysP3 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8, 28, 10 };

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 1; j <= arr[i]/2; j++){
                if(arr[i] % j == 0){
                    sum += j;
                }
            }
            if(sum == arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
}
