public class SortColors {
    public static void main(String[] args){
        int [] nums = {2,0,2,1,1,0};
        sortAllColors(nums);
        for(int num: nums){
            System.out.println(num + " ");
        }
    }

    //ex arr = [2,0,2,1,1,0]
    public static void sortAllColors(int[]nums){
        if(nums.length == 0){
            return;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
