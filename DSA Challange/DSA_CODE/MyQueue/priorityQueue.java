package MyQueue;

import java.util.*;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(8);
        queue.add(9);
        queue.add(10);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(1);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
