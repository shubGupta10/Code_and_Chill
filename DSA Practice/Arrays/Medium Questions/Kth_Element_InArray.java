import java.util.Arrays;

public class Kth_Element_InArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int k = 2;

        int result = findKthElement(arr, k);
        System.out.println(result);
    }

    public static int findKthElement(int[] arr, int k) {
        if(arr == null || arr.length == 0){
            return 0;
        }

        Arrays.sort(arr);
        return arr[arr.length - k];

    }
}
