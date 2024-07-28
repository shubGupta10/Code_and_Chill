public class WaterTrapping{
    
    static int waterTrappingProblem(int [] arr){
        int n= arr.length;
        int [] left = new int[n];
        int [] right = new int[n];

        left[0] = arr[0];
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }

        right[n-1] = arr[n-1]; //right ko yaha position diya
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }

        int result = 0;
        for(int i=0; i<n; i++){
            result += (Math.min(left[i], right[i]) - arr[i]);
        }

        return result;
     }
    
    public static void main(String[] args){
        int [] arr = {2, 1, 1, 4};
        System.out.println("Trapped water: " + waterTrappingProblem(arr));
    
    }
}