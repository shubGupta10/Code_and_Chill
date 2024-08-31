import java.util.*;

public class Implementation_Using_Arrays {

    int[] arr;
    int capacity;
    int rear;

    // Constructor
    public Implementation_Using_Arrays(int n) {
        capacity = n;
        arr = new int[capacity];
        rear = -1;
    }

    // EnQueue Operation
    public void enQueue(int data) throws Exception {
        if (rear == capacity - 1) {
            throw new Exception("Queue is full");
        }
        rear++;
        arr[rear] = data;
    }

    // DeQueue Operation
    public int deQueue() throws Exception {
        if (rear == -1) {
            throw new Exception("Queue is empty");
        }
        int result = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return result;
    }

    // Peek Operation
    public int peek() throws Exception {
        if (rear == -1) {
            throw new Exception("Queue is empty");
        }
        return arr[0];
    }

    //main function
    public static void main(String[] args) {
        try {
            Implementation_Using_Arrays queue = new Implementation_Using_Arrays(5);

            queue.enQueue(10);
            queue.enQueue(20);
            queue.enQueue(30);
            queue.enQueue(40);
            queue.enQueue(50);

            System.out.println("Peek: " + queue.peek());

            System.out.println("DeQueue: " + queue.deQueue());
            System.out.println("DeQueue: " + queue.deQueue());

            queue.enQueue(60);

            System.out.println("Peek after enQueue 60: " + queue.peek());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
