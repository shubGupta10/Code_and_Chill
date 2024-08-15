public class length {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Calling the length method to find the length of the linked list
        int len = Solution.length(head);
        System.out.println("Length of the linked list: " + len);
    }

    public static class Solution {
        public static int length(Node head) {
            int count = 0;

            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }

            return count;
        }
    }

    // Node class definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
