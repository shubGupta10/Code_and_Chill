public class Longest {
    public static void main(String[] args) {

        int[] arr = { 9, 8, 7, 6, 4, 32, 2 };
        int n = arr.length;
        int result = longestElement(arr, n);
        System.out.println(result);
    }

    static int longestElement(int[] arr, int n) {
        n = arr.length;
        int maxelem = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxelem) {
                maxelem = arr[i];
            }
        }
        return maxelem;
    }
}