package Two_Pointers;

public class Two_Sum_II{
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;

        int [] result = twoSum(nums, target);
        for(int i=0; i<result.length; i++){
            System.out.println("The elements are " + i);
        }

    }

    public static int[] twoSum(int[] nums, int target){

        int start = 0;
        int end = 0;

        while(start < end){
            int sum = nums[start] + nums[end];
            if(sum == target){
                return new int[]{start + 1, end +1 };
            }else if(sum < target){
                start++;
            }else{
                end--;
            }
        }
        return new int[]{};
    }
}