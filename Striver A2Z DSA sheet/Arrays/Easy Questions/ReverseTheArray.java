public class ReverseTheArray {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        ReverseArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //arr = {1,2,3,4}
    public static void ReverseArray(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }

        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int [] arr , int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
