// what is kadane algorithm

// Kadane's algorithm is an efficient method used to find the maximum sum contiguous sub-array within a given array of integers. It's a dynamic programming algorithm that iterates through the array once, keeping track of the maximum sum found so far and updating it as it traverses the array.

// Here's a step-by-step explanation of Kadane's algorithm:

// Initialize: Set two variables, max_so_far and max_ending_here, to the value of the first element in the array. These variables will keep track of the maximum sum found overall and the maximum sum found ending at the current index, respectively.

// Iterate Through the Array: Start iterating through the array from the second element (index 1). For each element num in the array:

// a.Update max_ending_here: Calculate the maximum of the current element num and the sum of num and max_ending_here. This step determines whether to extend the current sub-array or start a new sub-array.

// b.Update max_so_far: Calculate the maximum of max_so_far and max_ending_here. This step keeps track of the maximum sum found so far.

// Return the Result: After iterating through the entire array, max_so_far will contain the maximum sum of a contiguous sub-array within the array. Return max_so_far as the result.


public class kadaneAlgorithm {
    long maxSubarraySum(int arr[], int n) {
        long maxSoFar = arr[0]; // Initialize maxSoFar with the first element
        long maxEndingHere = arr[0]; // Initialize maxEndingHere with the first element
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < n; i++) {
            // Update maxEndingHere by taking the maximum of the current element
            // and the sum of the current element and maxEndingHere
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            
            // Update maxSoFar by taking the maximum of maxSoFar and maxEndingHere
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        // Return the maximum sum found
        return maxSoFar;
    }

    public static void main(String[] args) {
        kadaneAlgorithm kadane = new kadaneAlgorithm();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = kadane.maxSubarraySum(arr, n);
        System.out.println("Maximum sum of contiguous sub-array: " + maxSum);
    }
}
