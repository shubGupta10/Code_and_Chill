package MyLinkedList;
import java.util.LinkedList;




public class Reverse_List_IN_K_Groups {
    public static void main(String[] args) {
        Reverse_List_IN_K_Groups obj = new Reverse_List_IN_K_Groups();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 3;

        ListNode reversedHead = obj.reverseKGroup(head, k);

        ListNode current = reversedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        int count = 0;

        // First, count the number of nodes in the list to ensure there are at least k nodes to reverse
        current = head;
        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        // If there are at least k nodes, reverse them
        if (count == k) {
            current = head;
            for (int i = 0; i < k; i++) {
                next = current.next;  // Save the next node
                current.next = prev;   // Reverse the link
                prev = current;        // Move prev to current node
                current = next;        // Move to the next node
            }

            // head is now the last node of the reversed group, so connect it to the result of the next group
            head.next = reverseKGroup(current, k);

            // prev is the new head of the reversed list for this segment
            return prev;
        }

        // If there are fewer than k nodes, return the head as is
        return head;
    }
}
