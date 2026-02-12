// WAJP to find second largest element of the given array

public class arrayP9 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8, 28, 10 };
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] <largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
