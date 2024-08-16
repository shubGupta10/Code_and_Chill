import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    //ex arr = [1,2,3,4,5,6,7] , k=3
    //rotated array = [5,6,7,1,2,3,4]

    public static void rotateArray(int [] arr, int k){
        if(arr == null || arr.length == 0){
            return ;
        }
        k = k % arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
    }

    private static void reverse(int [] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
