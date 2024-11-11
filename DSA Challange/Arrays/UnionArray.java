import java.util.ArrayList;
import java.util.List;

public class UnionArray {
    public static void main(String[] args) {
        // Sample input arrays
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 3, 5, 6};

        // Finding the union of arrays a and b
        ArrayList<Integer> result = findUnion(a, b);

        // Printing the result
        System.out.println(result);
    }

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // List to store the result (union)
        ArrayList<Integer> resultArrayList = new ArrayList<>();

        // Indices for both arrays
        int i = 0, j = 0;

        // Traverse both arrays
        while (i < a.length && j < b.length) {
            // If both arrays have the same element, add it to the result
            if (a[i] == b[j]) {
                // Add only if it's not a duplicate in the result list
                if (resultArrayList.isEmpty() || resultArrayList.get(resultArrayList.size() - 1) != a[i]) {
                    resultArrayList.add(a[i]);  // Add the value, not the index
                }
                i++; // Move to next element in a
                j++; // Move to next element in b
            }
            // If the current element in array a is smaller, add it to the result
            else if (a[i] < b[j]) {
                if (resultArrayList.isEmpty() || resultArrayList.get(resultArrayList.size() - 1) != a[i]) {
                    resultArrayList.add(a[i]);  // Add the value, not the index
                }
                i++; // Move to next element in a
            }
            // If the current element in array b is smaller, add it to the result
            else {
                if (resultArrayList.isEmpty() || resultArrayList.get(resultArrayList.size() - 1) != b[j]) {
                    resultArrayList.add(b[j]);  // Add the value, not the index
                }
                j++; // Move to next element in b
            }
        }

        // Add remaining elements from array a if any
        while (i < a.length) {
            if (resultArrayList.isEmpty() || resultArrayList.get(resultArrayList.size() - 1) != a[i]) {
                resultArrayList.add(a[i]);  // Add the value, not the index
            }
            i++;
        }

        // Add remaining elements from array b if any
        while (j < b.length) {
            if (resultArrayList.isEmpty() || resultArrayList.get(resultArrayList.size() - 1) != b[j]) {
                resultArrayList.add(b[j]);  // Add the value, not the index
            }
            j++;
        }

        return resultArrayList;
    }
}
