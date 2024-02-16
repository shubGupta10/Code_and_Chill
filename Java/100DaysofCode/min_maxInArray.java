public class min_maxInArray {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7};

        int minVal = min(arr, 0);
        int maxVal = max(arr, 0);

        System.out.printf("The min and max in the array is: %d, %d%n", minVal, maxVal);
        
        
    }

    static int min(int[] arr , int a ){
        a = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < a){
                a = arr[i];
            }
        }
        return a;
    }

    static int max(int[] arr2, int b){
        b = arr2[0];
        for(int i=0; i<arr2.length; i++){
            if(arr2[i] > b){
                b = arr2[i];
            }
        }
        return b;
    }
}
