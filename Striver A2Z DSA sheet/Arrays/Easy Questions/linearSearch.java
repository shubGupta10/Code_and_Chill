public class linearSearch {
    public static void main(String[] args) {
        int [] arr = { 6,7,8,4,1 };
        int n = arr.length;
        int num = 8;
        int result = linearSearchAlgo(n, num, arr);
        System.out.println(result);
    }

    static int linearSearchAlgo(int n, int num, int [] arr){
        n = arr.length;
        for(int i=0; i<n; i++){
            if(num == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
