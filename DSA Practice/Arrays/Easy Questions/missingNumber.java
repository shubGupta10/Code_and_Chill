public class missingNumber {
    public static void main(String[] args){
        int [] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(findMissingNumber(nums));
    }

    //arr = [9,6,4,2,3,5,7,0,1]

    public  static int findMissingNumber(int[]nums){
        if(nums.length == 0 || nums == null){
            return 0;
        }

        int n = nums.length;
        int totalSum = n * (n + 1)/2;
        int arraySum = 0;

        for(int num: nums){
            arraySum = arraySum + num;
        }

        return totalSum - arraySum;
    }
}
