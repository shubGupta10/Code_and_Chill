import java.util.HashMap;
import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        Next_Greater_Element findNextElem = new Next_Greater_Element();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = findNextElem.findNextGreaterElement(nums1, nums2);

        System.out.println("Next Greater Elements:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public  int[] findNextGreaterElement(int [] nums1, int [] nums2){
        
        HashMap<Integer, Integer> nextGreaterElem = new HashMap<>();
        Stack<Integer> stack = new Stack<>(); 

        for(int i=nums2.length -1; i >=0; i--){
            int num = nums2[i];


            while(!stack.isEmpty() && stack.peek() <= num){
                stack.pop();
            }

            if(stack.isEmpty()){
                nextGreaterElem.put(num, -1);
            }else{
                nextGreaterElem.put(num, stack.peek());
            }
            stack.push(num);
        }

        int [] result = new int[nums1.length];
        for(int i =0; i<nums1.length; i++){
            result[i] = nextGreaterElem.get(nums1[i]);
        }
        return result;
    }
}