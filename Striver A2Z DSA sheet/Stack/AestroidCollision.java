import java.util.Stack;

public class AestroidCollision {

    public static int[] aestroidCollision(int[] aestroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : aestroids) {
            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                int sum = a + stack.peek();

                if (sum < 0) {
                    stack.pop();
                } else if (sum > 0) {
                    a = 0;
                } else {
                    stack.pop();
                    a = 0;
                }
            }
            if (a != 0) {
                stack.push(a);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] asteroids = { 5, 10, -5 };
        int[] result = aestroidCollision(asteroids);
        for (int asteroid : result) {
            System.out.print(asteroid + " ");
        }
    }
}
