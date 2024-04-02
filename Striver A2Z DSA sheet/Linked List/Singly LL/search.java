public class search {
    public static void main(String[] args) {
        // Example usage
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int k = 3;
        int result = Solution.searchInLinkedList(head, k);
        if (result == 1) {
            System.out.println("Node with value " + k + " exists in the linked list.");
        } else {
            System.out.println("Node with value " + k + " does not exist in the linked list.");
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Solution {
        public static int searchInLinkedList(Node head, int k) {
            Node checkNode = head;
            while (checkNode != null) {
                if (checkNode.data == k) {
                    return 1; // Return 1 if node with value k exists
                }
                checkNode = checkNode.next; // Move to the next node
            }
            return 0; // Return 0 if node with value k doesn't exist
        }
    }
}
