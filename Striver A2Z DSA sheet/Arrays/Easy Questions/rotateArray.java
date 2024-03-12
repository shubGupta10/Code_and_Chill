
public class rotateArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] result = rotateArraytoLeft(arr, n);
        for(int num: result){
            System.out.println(num + " ");
        }
    }   
    
    static int [] rotateArraytoLeft(int [] arr, int n){
        n = arr.length;
        if(n<=1){
            return arr;
        }

        int temp = arr[0];

        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp; //last position pe temp waale elem ko daal rhe.
        return arr;
    }
}
