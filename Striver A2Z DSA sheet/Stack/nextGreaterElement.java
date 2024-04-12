import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {
    
    public static int[] findNextGreater(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] >= nums[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = nums[stack.peek()]; 
            }
            stack.push(i); 
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {7, 12, 1, 20};
        int[] result = findNextGreater(nums);
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }
}
