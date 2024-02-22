public class Non_Repeating_Elements{
    public static void main(String[] args){
        int [] arr = {-1, 2, -1, 3, 2};
        int n = arr.length-1;

        int result = checkElements(arr, n);
        System.out.println("Here is the Result: " + result);

    }
    
    static int checkElements(int[] arr, int n) {
        n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                return arr[i];
            }
        }
        return 0;
    }
}


// important point 

// 1. In the inner loop, i represents the index of the current element being evaluated, and j represents the index of another element in the array.

// 2. The condition arr[i] == arr[j] checks if the values of the elements at indices i and j are the same.

// 3 .However, if i is equal to j, it means the algorithm is comparing the element with itself, which would always result in true and incorrectly mark  the element as repeated.

// 4.By adding the condition i != j, the algorithm ensures that it doesn't consider the same element at the same index as a repetition, thus correctly identifying truly repeated elements in the array.