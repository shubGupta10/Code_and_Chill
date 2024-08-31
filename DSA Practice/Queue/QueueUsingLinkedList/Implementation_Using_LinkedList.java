public class Implementation_Using_LinkedList {
    Node front, rear;

    // EnQueue Operation
    public void Enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // DeQueue Operation
    public int Dequeue() throws Exception {
        if (front == null) {
            throw new Exception("Queue is empty");
        }
        int result = front.data;
        front = front.next;
        return result;
    }

    //main function
    public static void main(String[] args) {
        try {
            Implementation_Using_LinkedList queue = new Implementation_Using_LinkedList();

            queue.Enqueue(10);
            queue.Enqueue(20);
            queue.Enqueue(30);
            queue.Enqueue(40);

            System.out.println("DeQueue: " + queue.Dequeue());
            System.out.println("DeQueue: " + queue.Dequeue());

            queue.Enqueue(50);
            queue.Enqueue(60);

            while (queue.front != null) {
                System.out.println("DeQueue: " + queue.Dequeue());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
