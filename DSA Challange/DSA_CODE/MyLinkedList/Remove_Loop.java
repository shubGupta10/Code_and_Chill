package MyLinkedList;

import java.util.HashSet;
import java.util.Set;

public class Remove_Loop {
    public static void main(String[] args) {
        Remove_Loop r = new Remove_Loop();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

       removeLoop(head);

       printList(head);
    }

    public static ListNode removeLoop(ListNode head) {
        if(head == null || head.next == null) return head;
        Set<ListNode> box = new HashSet<ListNode>();

        ListNode current = head;
        ListNode prev = null;

        box.add(current);

        while(current != null) {
            prev = current;
            current = current.next;
            if(box.contains(current)) {
                prev.next = null;
                return head;
            }
            box.add(current);
        }
        return head;
    }


    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
