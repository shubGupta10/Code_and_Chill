public class majorityElement {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 3, 1, 1, 3, 1, 1 };
        findingMajorityElement(arr);
    }

    static void findingMajorityElement(int[] arr) {
        int majorityElement = arr[0];
        int count = 0;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] == majorityElement) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                majorityElement = arr[i];
                count = 1;
            }
        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (majorityElement == arr[i]) {
                count++;
            }
        }

        if(count > n/2){
            System.out.println(majorityElement);
        }
    }

}
