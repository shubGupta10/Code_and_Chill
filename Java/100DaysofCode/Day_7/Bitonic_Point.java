//Q : find the maximum number if a array is strictly increasing and strictly decreasing.

public class Bitonic_Point {
    public static void main(String[] args) {

        int[] arr = {20,
            2, 25, 52, 55 ,100 ,250, 1000, 5000 ,500, 450 ,440 ,400, 350 ,321 ,300 ,250 ,220, 201 ,109, 5};

        int maxIndex = findMax(arr);
        int maxElement = arr[maxIndex];

        System.out.println("Maximum element is: " + maxElement + " at index " + maxIndex);

    }

    static int findMax(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            System.out.println("Array must have two elements.");
            return -1;
        }
        // this condition is for checking the 1st and after that second element:
        if (arr[0] > arr[1]) {
            return 0;
        }
        // this condition is for checking the last and second last of the element in the
        // array:
        // if(arr[n-1] < arr[n-2]){
        // return n-1;
        // }

        // here we are running a loop from second element to last second element in the
        // array
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }
        return n - 1;
    }

}
