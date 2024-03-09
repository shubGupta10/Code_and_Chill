public class Insertion {
    public static void main(String[] args) {
        int [] arr = {74,3,38,12,24,56};
        int n= arr.length;
        insertionSort(arr, n);
        for (int num: arr){
            System.out.printf(num + " ");
        }
    }

    static  void insertionSort(int [] arr, int n){
        n = arr.length;
        for (int i = 1; i < n; i++) { // Start from the second element
            int current = arr[i];
            int j = i - 1; // sorted array ke liye j use kr rhe
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
