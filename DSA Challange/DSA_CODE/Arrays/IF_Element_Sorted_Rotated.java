public class IF_Element_Sorted_Rotated {
    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2};
        Boolean result = checkIfSortedAndRotated(arr);
        System.out.println(result);
    }

    public static Boolean checkIfSortedAndRotated(int[] arr) {
        int greater = 0;

        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i-1] > arr[i]){
                greater++;
            }


            if(arr[arr.length -1] > arr[0]){
                greater++;
            }
        }
        return greater <= 1;
    }
}
