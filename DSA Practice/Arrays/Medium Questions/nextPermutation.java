public class nextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 1, 5};
        findNextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void findNextPermutation(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return;
        }

        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
