// Q: Alternate positive and negative numbers

// public class pos_neg{
//     public static void main(String[] args){
//         int [] arr = {2,-4,5,2,-7,8,-9};

//         int result = rearange(arr, 0);
//         System.out.println("The output is: " + result );
//     }

//     static int rearange(int [] arr , int n){
//         for(int i=0; i<arr.length; i++){
//             if(n > 1 && n > 0){
//                 arr[i] = arr[i-1];
//             }
//         }
//         return n;
//     }
// }

import java.util.ArrayList;
import java.util.List;

class pos_neg {
    void rearrange(int arr[], int n) {
        // Separate positive and negative numbers into two lists
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();
        for (int num : arr) {
            if (num >= 0) {
                positiveList.add(num);
            } else {
                negativeList.add(num);
            }
        }

        // Merge the two lists, alternating positive and negative numbers
        int i = 0;
        int pIndex = 0;
        int nIndex = 0;

        // Start with positive number if available
        if (!positiveList.isEmpty()) {
            arr[i++] = positiveList.get(pIndex++);
        }

        // Merge positive and negative numbers alternately
        while (pIndex < positiveList.size() || nIndex < negativeList.size()) {
            if (nIndex < negativeList.size()) {
                arr[i++] = negativeList.get(nIndex++);
            }
            if (pIndex < positiveList.size()) {
                arr[i++] = positiveList.get(pIndex++);
            }
        }
    }
}

//not solved