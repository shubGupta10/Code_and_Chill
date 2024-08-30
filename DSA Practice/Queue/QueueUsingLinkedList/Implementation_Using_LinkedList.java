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


}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
