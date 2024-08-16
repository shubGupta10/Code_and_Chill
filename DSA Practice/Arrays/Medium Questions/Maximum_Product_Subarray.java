public class Maximum_Product_Subarray {

    public static void main(String[] args) {
        int[] nums1 = {2, 3, -2, 4};
        int[] nums2 = {-2, 0, -1};
        int[] nums3 = {-2, -3, 0, -1, -2};

        System.out.println("Max product of nums1: " + maxProduct(nums1));
        System.out.println("Max product of nums2: " + maxProduct(nums2));
        System.out.println("Max product of nums3: " + maxProduct(nums3));
    }

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            ans = Math.max(ans, maxProduct);
        }

        return ans;
    }
}
