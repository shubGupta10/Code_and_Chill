import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length - 1; i++) {
            int targetNumber = target - nums[i];
            if(map.containsKey(targetNumber)) {
                return new int[] { map.get(targetNumber), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
