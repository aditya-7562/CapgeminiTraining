// WAJP to find third smallest element of the given array

public class arrayP11 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8, 28, 10 };
        int smallest = Integer.MIN_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        int thirdsmallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                thirdsmallest = secondsmallest;
                secondsmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] >smallest && arr[i] < secondsmallest && arr[i] < thirdsmallest){
                thirdsmallest = secondsmallest;
                secondsmallest = arr[i];
            }else if(arr[i] >smallest && arr[i] > secondsmallest && arr[i] < thirdsmallest){
                thirdsmallest = arr[i];
            }
        }

        System.out.println(thirdsmallest);
    }
}
