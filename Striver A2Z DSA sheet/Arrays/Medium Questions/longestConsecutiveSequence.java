public class longestConsecutiveSequence {
    public static void main(String[] args){

    }

    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n == 0) return 0;


        int [] sequence = new int[n];

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i + 1] == nums[j]){
                    sequence[i] = j;
                }
            }
        }
        return sequence[n-1];
    }
}
