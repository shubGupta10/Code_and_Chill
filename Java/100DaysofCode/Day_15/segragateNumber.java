// Q: Move all negative elements to end

import java.util.Arrays;

public class segragateNumber{
    public static void main(String[] args){
        int [] arr = {-5, 7, -3, -4, 9, 10, -1, 11};
        int[] result = moveallNumbers(arr, arr.length);
        System.out.println("Here are the results: " + Arrays.toString(result));

    }

    static int[] moveallNumbers(int[] arr, int n){
        n = arr.length;
        int [] result = new int[n];
        int start = 0;
        int end = n-1;


        for(int i=0; i<n; i++){
            if(arr[i] >= 0){
               result[start] = arr[i];
               start++;
            } else{
                result[end] = arr[i];
                end--;
            }
        }
        return result;
    }
}



// here another approach 

// public static void segregateElements(int[] arr, int n) {
//     int[] result = new int[n];
//     int start = 0;
//     int end = n - 1;
//     int negatives = 0;

    // Counting the number of negative elements
    // for (int i = 0; i < n; i++) {
    //     if (arr[i] < 0) {
    //         negatives++;
    //     }
    // }

    // Placing positive elements at the beginning
    // for (int i = 0; i < n; i++) {
    //     if (arr[i] >= 0) {
    //         result[start++] = arr[i];
    //     }
    // }

    // Placing negative elements at the end in reverse order
    // for (int i = n - 1; i >= 0; i--) {
    //     if (arr[i] < 0) {
    //         result[end--] = arr[i];
    //     }
    // }

    // Copying the segregated elements back to the original array
//     System.arraycopy(result, 0, arr, 0, n);
// }