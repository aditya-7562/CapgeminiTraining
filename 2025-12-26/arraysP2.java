// WAJP to print prime elements from the given array

public class arraysP2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Prime elements are: ");

        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(arr[i]);
            }
        }
    }
}
