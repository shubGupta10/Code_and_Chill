public class missingNumber {
    public static void main(String[] args){
        int [] nums = {9,6,4,2,3,5,7,0,1};
        int missingnumber = findMissingNumber(nums);
        System.out.println(missingnumber);
    }

    static int findMissingNumber(int [] nums){
        int n = nums.length;
        int start = nums[0];
        int end = nums[n-1];

        while(start < end){
            int mid = start + (end-start)/ 2;
            if(nums[mid] > mid){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    
}
