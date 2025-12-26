// WAJP to find unique elements from the array

public class array16 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5, 4, 7, 3, 28, 10, 1 };
        int[] arr2 = new int[100];

        for(int i = 0; i < arr1.length; i++){
            arr2[arr1[i]]++;
        }

        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] != 0){
                System.out.println("Unique elemets: " + i);
            }
        }
    }
}
