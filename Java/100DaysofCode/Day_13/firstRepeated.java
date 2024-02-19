public class firstRepeated{
    public static void main(String[] args) {
        int [] arr = {1, 5, 3, 4, 3, 5, 6};
        int result = repeated(arr, -1);

        System.out.println("Here is the answer: " + result);
    }

    static int repeated(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return n; 
    }
}