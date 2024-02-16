public class duplicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4,3, 5, 2, 7 };

        int result = duplicateArray(arr);
        System.out.println("The duplicates in the array is : " + result);

    }

    static int duplicateArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
