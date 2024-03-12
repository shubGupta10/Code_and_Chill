
public class removeDuplicates {
    public static void main(String[] args) {
        int [] arr = {1, 2 ,2 ,2, 3};
        int n = arr.length;
        int result = checkDuplicates(arr, n);
        System.out.println(result);
    }

    static int checkDuplicates(int [] arr, int n){
        n = arr.length;
       if(n == 0 || n == 1){
        return n;
       } 

       int j =0;

       for(int i=0; i<n-1; i++){
        if(arr[i] != arr[i+1]){
            arr[j] = arr[i];
            j++;
        }
       }

       arr[j++] = arr[n-1];  //last elem ko bhej rhe j mein.
       return j;
    }
}
