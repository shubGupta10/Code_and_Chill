import java.util.HashSet;

public class longestConsecutiveSequence {

    // Main method to test the function
    public static void main(String[] args) {

        // Example test case
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of longest consecutive sequence: " + findLongestConsecutiveSequence(nums));

        // Another test case
        int[] nums2 = {0, 0, 1};
        System.out.println("Length of longest consecutive sequence: " + findLongestConsecutiveSequence(nums2));

        // Edge case: Empty array
        int[] nums3 = {};
        System.out.println("Length of longest consecutive sequence: " + findLongestConsecutiveSequence(nums3));

        // Edge case: Array with a single element
        int[] nums4 = {5};
        System.out.println("Length of longest consecutive sequence: " + findLongestConsecutiveSequence(nums4));
    }

    // Method to find the length of the longest consecutive sequence
    public static int findLongestConsecutiveSequence(int[] nums) {
        int n = nums.length;

        // Edge case: If the array is empty
        if (n == 0) {
            return 0;
        }

        // Step 1: Add all numbers to a HashSet for O(1) lookups
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Step 2: Iterate through the set to find the longest consecutive sequence
        for (int num : numSet) {
            // Only start a new sequence if `num - 1` is not in the set
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Keep checking for the next consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
