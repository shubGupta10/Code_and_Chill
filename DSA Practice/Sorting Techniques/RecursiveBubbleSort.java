//Approach :
//1. Define a recursive function, let's call it recursiveBubbleSort.
//2. Inside this function, have a base case to check if the array is sorted or not. If it's sorted, return the array.
//3. Otherwise, iterate through the array and swap adjacent elements if they are in the wrong order.
//4. After one pass through the array, call the recursiveBubbleSort function recursively with the reduced array size (excluding the last element, as it's already in its correct position after each pass).
//5. Repeat this process until the array is fully sorted.
public class RecursiveBubbleSort {
    public static void main(String[] args) {

        int [] arr = {6,3,9,2,5,8};
        int n = arr.length;
        recursiveBubble(arr, n);
        for (int num : arr){
            System.out.printf( num + " ");
        }

    }

    static void recursiveBubble(int [] arr, int n){
        if(n == 1){
            return;
        }

        for (int i=0; i<n-1; i++){
              if(arr[i] > arr[i+1]){
                  int temp = arr[i];
                  arr[i] = arr[i+1];
                  arr[i+1] = temp;
              }
        }
        recursiveBubble(arr, n-1);
    }
}
