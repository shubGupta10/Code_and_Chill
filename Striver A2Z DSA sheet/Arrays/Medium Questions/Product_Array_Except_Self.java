public class Product_Array_Except_Self {
    public static void main(String[] args){
        int [] nums = {1,2,3,4};
        int [] result = findProductArrayExceptSelf(nums);
        for(int num: result){
            System.out.println(num);
        }

    }

    public static int [] findProductArrayExceptSelf(int[] nums){
        if(nums.length == 0) return new int[0];


        int [] left = new int[nums.length];
        int [] right = new int[nums.length];

        left[0] = 1;
        for(int i = 1; i < nums.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        right[nums.length - 1] = 1;
        for(int i=nums.length - 2; i> -1; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        int [] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}
