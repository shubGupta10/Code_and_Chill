public class moveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveAllZeros(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void MoveAllZeros(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }
}
