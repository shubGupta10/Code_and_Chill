import java.util.Arrays;
import java.util.Stack;

public class GreaterElemOnRight {

    public static int[] countGreater(int[] arr, int[] query) {
        int n = arr.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                stack.pop();
            }
            answer[i] = stack.isEmpty() ? 0 : stack.size();
            stack.push(i);
        }

        int[] result = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            result[i] = answer[query[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 10, 4};
        int[] queries = {0, 1};
        int[] result = countGreater(arr, queries);
        System.out.println(Arrays.toString(result));
    }
}
