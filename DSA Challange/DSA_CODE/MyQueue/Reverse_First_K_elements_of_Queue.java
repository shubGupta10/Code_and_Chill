package MyQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse_First_K_elements_of_Queue {

    // Helper method to reverse the first k elements of the queue
    private Queue<Integer> reverse(Queue<Integer> q, int k) {
        if (q.isEmpty() || k <= 0) {
            return q;
        }

        // Recursive logic to reverse first k elements
        int front = q.poll(); // Remove the front element
        q = reverse(q, k - 1); // Recursive call for the next k-1 elements
        q.offer(front); // Add the front element back after recursion
        return q;
    }

    // Method to modify the queue as per the problem statement
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // Handle edge cases
        if (q == null || k <= 0 || k > q.size()) {
            return q;
        }

        // Reverse the first k elements of the queue
        q = reverse(q, k);

        // Adjust the remaining elements in the queue
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.offer(q.poll()); // Move elements from front to back to maintain order
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        int k = 3;

        Reverse_First_K_elements_of_Queue obj = new Reverse_First_K_elements_of_Queue();
        Queue<Integer> modifiedQueue = obj.modifyQueue(q, k);

        System.out.println("Modified Queue:");
        while (!modifiedQueue.isEmpty()) {
            System.out.print(modifiedQueue.poll() + " ");
        }
    }
}
