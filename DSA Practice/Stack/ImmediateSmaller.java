import java.util.Stack;

public class ImmediateSmaller {

    public static void findNGE(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        int[] extendedArr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            extendedArr[i] = arr[i % n];
        }

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && extendedArr[i] > extendedArr[stack.peek()]) {
                result[stack.pop()] = extendedArr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 3, 4, 2};
        findNGE(a);
    }
}
