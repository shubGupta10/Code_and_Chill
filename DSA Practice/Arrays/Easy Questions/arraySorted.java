public class arraySorted {
    public static void main(String[] args){
        int [] arr  = {12,24,44,54,64};
        int result = isSorted(arr);
        if(result == 1){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not Sorted");
        }
    }


    public static int isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}
