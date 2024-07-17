public class singleNumber {
    public static void main(String[] args){
        int [] nums = {4,1,2,1,2};
        System.out.println(findSingleNumber(nums));
    }

    public static int findSingleNumber(int[]nums){
        if(nums.length == 0){
            return 0;
        }


        int count = 0;
        for(int num: nums){
            count ^= num;
        }
        return count;
    }
}
