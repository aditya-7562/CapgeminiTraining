// WAJP to union of two given arrays

public class arrayP13 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5, 6, 7, -2, 28, 10 };
        int[] arr2 = { 1, 3, 4, 4, 6, 7, -8, 28, 10 };

        int s = arr1.length + arr2.length;
        int[] arr3 = new int[s];
        boolean flag = false;

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = arr1.length; i < s; i++) {
            flag = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i - arr1.length] == arr3[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                arr3[i] = arr2[i - arr1.length];
            }
        }

        for (int i = 0; i < s; i++) {
            System.out.println(arr3[i]);
        }
    }
}
