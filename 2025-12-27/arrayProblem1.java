/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1 :
Input:
	nums = [1,2,3,4]
Output:
	[24,12,8,6]
	
Example 2 :
Input:
	nums = [-1,1,0,-3,3]
Output:
	[0,0,9,0,0]
	
	
Constraints
2 <= nums.length <= 10^5
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
*/

import java.util.*;
public class arrayProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] result = new int[n];
        leftProducts[0] = 1;
        for(int i=1;i<n;i++){
            leftProducts[i] = leftProducts[i-1] * arr[i-1];
        }
        rightProducts[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            rightProducts[i] = rightProducts[i+1] * arr[i+1];
        }
        for(int i=0;i<n;i++){
            result[i] = leftProducts[i] * rightProducts[i];
        }
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
