import java.util.Stack;

public class SumofSubarrayMin {
    public static int sumSubarrayMins(int[] arr) {
        int mod = (int) 1e9 + 7; // Setting up a large number for later calculations
        int n = arr.length; // Finding the length of the input array
        Stack<Integer> stack = new Stack<>(); // Creating an empty stack to help with calculations
        int[] left = new int[n]; // Creating an array to store distances to the left boundary
        int[] right = new int[n]; // Creating an array to store distances to the right boundary
        
        // Finding distances to the left boundary
        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop(); // Remove elements from the stack until we find a smaller or equal element
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek(); // Calculate distance to left boundary
            stack.push(i); // Push the current index onto the stack
        }
        
        stack.clear(); 
        
        // Finding distances to the right boundary
        for (int i = n - 1; i >= 0; --i) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop(); // Remove elements from the stack until we find a smaller or equal element
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i; // Calculate distance to right boundary
            stack.push(i); // Push the current index onto the stack
        }
        
        long sum = 0; // Initializing a variable to store the sum of minimums
        
        // Calculating sum of minimums
        for (int i = 0; i < n; ++i) {
            sum = (sum + (long) arr[i] * left[i] * right[i]) % mod; // Update the sum
        }
        
        return (int) sum; // Returning the sum as an integer
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4}; // Input array
        System.out.println(sumSubarrayMins(arr)); // Printing the result of sumSubarrayMins
    }
}
