public class Implementation {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        public static Node head; // our single Node

        public static boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            // case when the linked list is empty
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            // case when there are elements in the linked list
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        //it will follow LIFO (Last in First Out)

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
