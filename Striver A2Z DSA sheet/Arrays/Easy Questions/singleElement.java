public class singleElement {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4 };
        int nums = findSingleNumber(arr);
        System.out.println(nums);
    }

    static int findSingleNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int selectedElem = arr[i];
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == selectedElem) {
                    count++;
                }
            }

            if (count == 1) {
                return selectedElem;
            }
        }
        return -1;
    }

}
