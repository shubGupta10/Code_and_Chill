import java.util.Arrays;

public class Arrange_Element_By_sign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] rearranged = rearrangeArray(nums);

        System.out.println(Arrays.toString(rearranged));
    }


    //optimal approach
    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];

        int posIndex = 0;
        int negativeIndex = 1;

        for(int num: nums){
            if(num > 0){
                result[posIndex] = num;
                posIndex += 2;
            }else{
                result[negativeIndex] = num;
                negativeIndex += 2;
            }
        }
        return result;
    }



    // bad code but works: brute force approach

//    static int[] rearrangeArray(int[] nums) {
//        ArrayList<Integer> positive = new ArrayList<Integer>();
//        ArrayList<Integer> negative = new ArrayList<Integer>();
//
//        for(int num: nums){
//            if(num > 0){
//                positive.add(num);
//            }else{
//                negative.add(num);
//            }
//        }
//
//        int [] result = new int[nums.length];
//        int index = 0;
//        for(int i = 0; i < positive.toArray().length; i++){
//            result[index++] = positive.get(i);
//            result[index++] = negative.get(i);
//        }
//        return result;
//    }
}
