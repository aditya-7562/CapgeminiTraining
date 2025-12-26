// WAJP to find third largest element of the given array

public class arrayP10 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8, 28, 10 };
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] <largest && arr[i] > secondLargest && arr[i] > thirdLargest){
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }else if(arr[i] <largest && arr[i] < secondLargest && arr[i] > thirdLargest){
                thirdLargest = arr[i];
            }
        }

        System.out.println(thirdLargest);
    }
}
