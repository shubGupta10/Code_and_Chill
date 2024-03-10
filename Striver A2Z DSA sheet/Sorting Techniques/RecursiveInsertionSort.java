public class RecursiveInsertionSort {
    public static void main(String[] args){
        int [] arr = {74,3,38,12,24,56};
        recursiveInsertion(arr, arr.length);
        for (int num: arr){
            System.out.printf( num + " ");
        }
    }

    static void recursiveInsertion(int[] arr, int n){
        if (n <= 1) return; // Base case, return when only one element left
        recursiveInsertion(arr, n - 1); // Sort first n-1 elements recursively

        int last = arr[n - 1]; // Store the last element
        int j = n - 2; // Start comparing with the second last element
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last; // Insert last element at correct position
    }
}

//solution:

//we take last element approach.

//Base Case: The function starts with a base case. Here, if (n <= 1) checks if there is only one element left in the array. If so, there's nothing to sort, so the function returns without doing anything.
//Recursive Call: If there's more than one element in the array, the function recursively calls itself with n - 1, sorting the first n - 1 elements.
//Inserting the Last Element: After the recursive call, the function takes the last element of the array (at index n - 1) and stores it in a variable called last.
//Comparing and Shifting: Then, it starts comparing last with the elements before it (from arr[n - 2] to arr[0]). It compares last with each element and shifts elements to the right if they are greater than last.
//Insertion: Finally, it inserts last at the correct position in the sorted part of the array.