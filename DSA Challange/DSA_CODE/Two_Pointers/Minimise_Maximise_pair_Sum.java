package Two_Pointers;

import java.util.Arrays;

public class Minimise_Maximise_pair_Sum {
    public static int findMinimisePaidSum(int [] nums){
        Arrays.sort(nums);
        int i=0; int j=nums.length - 1;
        int result = 0;

        while(i < j){
            int sum = nums[i] + nums[j];
            result = Math.max(result, sum);
        }
        return result;
    }
}


// Step to solve
// 1: Sort
// 2: intialise i and j
// intialise result;
// while(i<j)
// calculate sum = nums[i] + nums[j]
// i++, j--;
// return result;
