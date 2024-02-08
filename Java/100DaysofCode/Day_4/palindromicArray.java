

public class palindromicArray {
    public static void main(String[] args){

        int[] arr = {5 ,111, 222, 333, 444, 555};
        System.out.println("Here is Your element :- "+ palinArray(arr));
    }

    static int palinArray(int[] arr){

        int start = 0;
        int end = arr.length-1;
        while(start < end){
            if(arr[start] != arr[end]){
                return 1;
            }
            start++;
            end--;
        }
        return 0;
    }
}
