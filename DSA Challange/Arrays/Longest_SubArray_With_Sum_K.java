import java.util.HashMap;

public class Longest_SubArray_With_Sum_K {
    public static void main(String[] args) {

    }

    public int longestSubarray(int[] nums, int k) {
        int currSum = 0;
        int start = 0;
        int end = -1;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            if(currSum - k == 0){
                start = 0;
                end = i;
                break;
            }

            if(map.containsKey(currSum - k)){
                start = map.get(currSum - k) + 1;
                end = i;
                break;
            }
            map.put(currSum, i);
        }
        return end;
    }
}
