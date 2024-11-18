import java.util.HashMap;
import java.util.Map;

public class mergerSortedArray {
    public static void main(String[] args) {

    }

    public void mergerSortedArray(int[] arr1, int m, int[] arr2, int n) {
        int i = m-1;
        int j = n-1;

        while( i >= 0 && j >= 0) {
            if(arr1[i] > arr2[j]) {
                arr1[i+ j+1] = arr1[i];
                i++;
            }else{
                arr1[i+ j+1] = arr2[j];
                j--;
            }
        }

        while (j >= 0){
            arr1[j] = arr2[j];
            j--;
        }
    }
}
