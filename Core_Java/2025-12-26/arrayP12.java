// WAJP to merge two  given arrays

public class arrayP12 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5, 6, 7, -2, 28, 10 };
        int[] arr2 = { 1, 3, 4, 4, 6, 7, 8, 28, 10 };

        int s = arr1.length + arr2.length;

        int[] arr3 = new int[s];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for(int i = arr1.length; i < arr3.length; i++){
                arr3[i] = arr2[i - arr1.length];   
        }
        
        for(int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }
    }
}
