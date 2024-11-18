public class singleNumber {
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2,4,5};
        int ans = 0;
        for(int num : nums){
            ans = ans ^ num;
        }
        System.out.println(ans);
    }
}
