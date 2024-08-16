public class Given_Sum_Pair {
    public static void main(String[] args) {
        int [] arr = {11, 15, 6, 8, 9, 10};
        int sum = 16;

        boolean result = FindSumPair(arr, sum);
        System.out.println(result);
    }

    public static boolean FindSumPair(int[] arr, int TotalSum) {
        int n = arr.length;
        int pivot = findPivot(arr);

        int low = (pivot + 1) % n;
        int high = pivot;

        while(low != high){
            int currentSum = arr[low] + arr[high];
            if(currentSum == TotalSum){
                return true;
            } else if (currentSum < TotalSum) {
                low = (low + 1) % n;
            }else{
                high = (n + high - 1) % n;
            }
        }
        return false;
    }

    public static int findPivot(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] > arr[i+1]){
                return i;
            }
        }
        return n-1;
    }
}
