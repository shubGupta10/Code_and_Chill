public class middleOfLL {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node middle(Node head) {
        if (head == null) {
            return null;
        }
        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }

    public static void main(String[] args) {
        middleOfLL middleOfLL = new middleOfLL(); // corrected class name

        Node head = middleOfLL.new Node(1);
        head.next = middleOfLL.new Node(2);
        head.next.next = middleOfLL.new Node(3);
        head.next.next.next = middleOfLL.new Node(4);
        head.next.next.next.next = middleOfLL.new Node(5);

        Node middleNode = middleOfLL.middle(head);
        System.out.println("Middle node value: " + middleNode.val);
    }
}
