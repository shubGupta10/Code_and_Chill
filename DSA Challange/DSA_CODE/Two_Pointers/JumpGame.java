package Two_Pointers;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        canJump(nums);
    }
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int maxIndex = 0;
        for (int i = 0; i < n - 1; i++) {
            if (i > maxIndex)
                return false;

            maxIndex = Math.max(maxIndex, i + nums[i]);
        }
        return maxIndex >= n - 1;
    }
}
