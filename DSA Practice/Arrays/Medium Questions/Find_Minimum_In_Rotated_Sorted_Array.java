public class Find_Minimum_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        int result = findMinimum(nums);
        System.out.println(result);
    }

    public static int findMinimum(int[] nums) {
        if(nums == null || nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] > nums[right]) {
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}
