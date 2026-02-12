/*
WAJP to to find the total sum of numbers needed to subtract from each element of an array to make all the elements divisible by k.
Input: An array of integers and an integer k.
Example:
Array: [5, 9, 12, 16, 25]
k: 6
Output: Total sum of numbers needed to subtract: 13
*/
public class arrayProblem7 {
    public static void main(String[] args) {
        int[] arr = { 5, 9, 12, 16, 25 };
        int k = 6;
        int sum = 0;
        for (int num : arr) {
            int remainder = num % k;
            sum += (remainder);
        }
        System.out.println( sum);
    }
}
