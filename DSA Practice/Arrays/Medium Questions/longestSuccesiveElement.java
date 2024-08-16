import java.util.Arrays;

public class longestSuccesiveElement {
    public static void main(String[] args) {
        int [] arr =  {5, 8, 3, 2, 1, 4};
        int result = longestSuccesiveElements(arr);
        System.out.println(result);
    }

    static int longestSuccesiveElements(int [] arr){
    int maxElement = Integer.MIN_VALUE;


    for(int i=0; i<arr.length; i++){
        if(arr[i] > maxElement){
            maxElement = arr[i];
        }
    }
    return maxElement;
    }
}
