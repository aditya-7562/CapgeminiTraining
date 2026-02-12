// WAJP to product of all elements of an array
public class arrayP7 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8, 28, 10 };
        int product = 1;

        for(int i = 0; i < arr.length; i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}
