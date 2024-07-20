import java.util.Arrays;

public class ArrayElementsBySign {
    public static void main(String[] args){
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] result = RearrangeArrayElements(nums);

        System.out.println(Arrays.toString(result));
    }

    public static  int [] RearrangeArrayElements(int[] nums){
        int n = nums.length;
        int [] result = new int[n];

        int posIndex = 0;
        int negIndex = 1;

        for(int num: nums){
            if(num > 0){
                result[posIndex] = num;
                posIndex += 2;
            }else{
                result[negIndex] = num;
                negIndex += 2;
            }
        }
        return result;
    }
}
