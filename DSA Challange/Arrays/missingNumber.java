import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("Missing number: " + findMissingNumber(nums));
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;

        // Sort the array
        Arrays.sort(nums);

        // Check if 0 is missing (edge case)
        if (nums[0] != 0) {
            return 0;
        }

        // Check if n is missing (edge case)
        if (nums[n - 1] != n) {
            return n;
        }

        // Check for the missing number in the middle of the array
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] != nums[i] + 1) {
                return nums[i] + 1;
            }
        }

        return -1;
    }
}
