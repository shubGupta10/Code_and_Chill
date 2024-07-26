import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean hasDuplicates = findDuplicates(nums);
        System.out.println("Has duplicates: " + hasDuplicates);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static boolean findDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }

        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
