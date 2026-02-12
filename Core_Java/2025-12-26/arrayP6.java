// WAJP to find smallest element without sorting

public class arrayP6 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, -12, 28, 10 };
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
