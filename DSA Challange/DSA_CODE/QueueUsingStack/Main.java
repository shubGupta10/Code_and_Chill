package QueueUsingStack;

public class Main {
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enQueue(4);
        queue.enQueue(5);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
