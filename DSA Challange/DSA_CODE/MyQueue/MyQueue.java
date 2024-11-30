package MyQueue;

import java.util.Arrays;

public class MyQueue {
    private int size;
    private int[] items;
    private int front;
    private int rear;

    public MyQueue(int capacity) {
        this.items = new int[capacity];
        this.front = -1;
        this.rear = 0;
        this.size = capacity;
    }

    public void enqueue(int val) {
        if(rear == size) {
            System.out.println("Queue is full, can't items anymore");
            return;
        }
        items[rear] = val;
        rear++;
    }

    public int dequeue() {
        if (front == rear) {
            throw new IllegalStateException("Queue is empty");
        }
        front++;
        int val = items[front];
        items[front] = 0;
        this.front = front + 1;
        return val;
    }


    public String toString(){
        return Arrays.toString(items);
    }
}
