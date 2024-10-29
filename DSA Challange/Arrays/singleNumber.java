public class singleNumber {
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2,4,5};
        int ans = 0;
        for(int num : nums){
            // we did here XOR operation, XOR which cancels out same type of elements
            ans = ans ^ num;
        }
        System.out.println(ans);
    }
}
