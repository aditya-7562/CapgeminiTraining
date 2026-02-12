// WAJP to find intersection of two arrays

public class arrayP14 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5, 6, 7, -2, 28, 10 };
        int[] arr2 = { 1, 3, 4, 4, 6, 7, -8, 28, 10 };

        int s = arr1.length + arr2.length;
        int[] arr3 = new int[s];
        boolean flag = false;
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            flag = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                arr3[k++] = arr1[i];
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(arr3[i]);
        }
    }
}
