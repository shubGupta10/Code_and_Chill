public class Reverse {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node reverseLL(Node head) {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // prev will be the new head of the reversed list
        return prev;
    }

    public static void main(String[] args) {
        Reverse.Node head = new Reverse.Node(1); // Creating Node directly
        head.next = new Reverse.Node(2);
        head.next.next = new Reverse.Node(3);
        head.next.next.next = new Reverse.Node(4);
        head.next.next.next.next = new Reverse.Node(5);

        Reverse reverse = new Reverse(); // Creating an instance of Reverse
        Reverse.Node reversedHead = reverse.reverseLL(head);

        // Print the values of the reversed linked list
        System.out.println("Reversed linked list:");
        Reverse.Node current = reversedHead;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

        // Find and print the middle node
        Reverse.Node middleNode = reverse.findMiddle(reversedHead);
        System.out.println("Middle node value: " + middleNode.val);
    }

    public Node findMiddle(Node head) {
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
}
