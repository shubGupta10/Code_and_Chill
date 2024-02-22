public class Non_Repeating_Elements{
    public static void main(String[] args){
        int [] arr = {-1, 2, -1, 3, 2};
        int n = arr.length-1;

        int result = checkElements(arr, n);
        System.out.println("Here is the Result: " + result);

    }
    
    static int checkElements(int[] arr, int n) {
        n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                return arr[i];
            }
        }
        return 0;
    }
}