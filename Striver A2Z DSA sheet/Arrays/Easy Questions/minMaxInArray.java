public class minMaxInArray {
    public static void main(String[] args) {
        int [] nums = {3, 5, 4, 1, 9};
        System.out.println("The Min number is :- " + findMin(nums) + "\n" + " and the Maximum number is :- " + findMax(nums));
    }

    public static int findMin(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] < nums[0]){
                min = nums[i];
            }
        }
        return min;
    }

    public static int findMax(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] > nums[0]){
                max = nums[i];
            }
        }
        return max;
    }
}
