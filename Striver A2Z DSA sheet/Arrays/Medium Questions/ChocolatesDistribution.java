import java.util.Arrays;

public class ChocolatesDistribution {
    public static void main(String[] args) {
        int [] nums = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;

        int result = ChocolatesDistributionProblem(nums, m);
        System.out.println(result);
    }

    public static int ChocolatesDistributionProblem(int[] nums, int m){
        //check if nums is empty
        if(nums.length == 0) return 0;

        if(nums.length < m){
            return -1;
        }

        Arrays.sort(nums);

        int min_diff = Integer.MAX_VALUE;

        for (int i=0; i<nums.length -m; i++){
            int diff = nums[i + m -1]  - nums[i];
            if(diff < min_diff){
                min_diff = diff;
            }
        }
        return min_diff;
    }
}
