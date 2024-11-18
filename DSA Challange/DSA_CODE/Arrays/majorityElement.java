public class majorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majorElem = nums[0];
        int frequency = 0;

        for(int i=0; i<n; i++){
            if(frequency == 0){
                frequency++;
                majorElem = nums[i];
            }else if(majorElem == nums[i]){
                frequency++;
            }else{
                frequency--;
            }
        }
        return majorElem;
    }
}
