package MyQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueUsingRecursion {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Before Reverse Queue: " + queue);
        reverse(queue);
        System.out.println("After Reverse Queue: " + queue);
    }

    public static Queue<Integer> reverse(Queue<Integer> queue) {
        if(queue.isEmpty() || queue.size() == 1) return queue;

        int front = queue.poll();
        queue = reverse(queue);
        queue.offer(front);
        return queue;
    }
}
