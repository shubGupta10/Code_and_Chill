import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {

    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (q.isEmpty() || k > q.size() || k <= 0) {
            return q;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }

        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }

        for (int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);

        int k = 3;

        System.out.println("Original queue: " + queue);

        Queue<Integer> resultQueue = reverseFirstK(queue, k);

        System.out.println("Queue after reversing first " + k + " elements: " + resultQueue);
    }
}
