import java.util.Queue;
import java.util.LinkedList;

public class Reversal {

    public Queue<Integer> rev(Queue<Integer> q) {
        Queue<Integer> q2 = new LinkedList<>();

        // Transfer elements from the original queue to q2
        while (!q.isEmpty()) {
            q2.offer(q.poll());
        }

        // Transfer elements from q2 back to the original queue in reversed order
        while (!q2.isEmpty()) {
            q.offer(q2.poll());
        }

        return q; // Return the reversed queue
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(4);
        queue.offer(3);
        queue.offer(1);
        queue.offer(10);
        queue.offer(2);
        queue.offer(6);

        System.out.println("Original queue: " + queue);

        Reversal reversal = new Reversal();
        queue = reversal.rev(queue);

        System.out.println("Reversed queue: " + queue);
    }
}
