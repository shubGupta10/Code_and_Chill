public class longestSubArray {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = longestSubarrayWithSum(a, k);
        System.out.println(len);
    }

    static int longestSubarrayWithSum(int []a, long k){
        int n = a.length;

        int len = 0;
        for(int i=0; i<n; i++){
            long s = 0;
            for(int j=i; j<n; j++){
                s += a[j];

                if(s==k){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    
}
