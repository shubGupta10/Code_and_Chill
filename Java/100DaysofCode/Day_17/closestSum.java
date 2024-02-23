
// Approach of this question:

// -> This method takes the input array arr and the target value targetValue.
// -> It initializes two pointers left and right to the start and end of the array respectively.
// -> The result array is initialized with the first and last elements of the input array.
// -> minDiff is initialized with the absolute difference between the sum of the first and last elements and the targetValue.
// -> The method enters a while loop as long as left is less than right.
// -> Inside the loop, it calculates the sum of elements at indices left and right, and also calculates the absolute difference between this sum and the targetValue.
// -> If the calculated difference is less than the current minimum difference (minDiff), it updates minDiff and updates the result array with the current pair of elements.
// -> Depending on whether the sum is less than or greater than the targetValue, it adjusts the pointers left and right.
// -> Finally, it returns the result array, which holds the pair of elements whose sum is closest to the targetValue.





public class closestSum{
    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7,89,90};
        int [] result = findClosestSum(arr, 20);
        System.out.println("Here is the result: " + result[0] + ", " + result[1]);

    }

    static int[] findClosestSum(int[] arr, int targetValue) {
        int left = 0;
        int right = arr.length - 1;
        int[] result = {arr[left], arr[right]}; 
        int minDiff = Math.abs(arr[left] + arr[right] - targetValue);

        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - targetValue);

            if (diff < minDiff) {
                minDiff = diff;
                result[0] = arr[left];
                result[1] = arr[right];
            }

            if (sum < targetValue) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}


