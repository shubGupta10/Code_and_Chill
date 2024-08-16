public class SearchInSortedArray {
    public static void main(String[] args){
        int [] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int result = SearchIntoSortedArray(nums, target);
        System.out.println(result);
    }

    public static int SearchIntoSortedArray(int[] nums, int target){
        if(nums == null || nums.length == 0) return -1;


        int start = 0;
        int end = nums.length -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }


            //check which part is sorted.

            //left part

            if (nums[start] < nums[mid]) {
                if (nums[mid] > target && nums[start] <= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                //right part

                if (nums[mid] < target && nums[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
