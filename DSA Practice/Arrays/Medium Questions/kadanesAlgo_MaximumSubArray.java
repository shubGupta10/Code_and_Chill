public class kadanesAlgo_MaximumSubArray {
    public static void main(String[] args) {
        int [] nums = {5,4,-1,7,8};

        int result = findMaxSubArray(nums);
        System.out.println(result);
    }

    public static  int findMaxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum > max) {
                max = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
