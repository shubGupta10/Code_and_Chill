public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        RemoveDuplicates rd = new RemoveDuplicates();
        ListNode result = rd.deleteDuplicates(head);

        printList(result);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                int val = curr.val;

                while (curr != null && curr.val == val) {
                    curr = curr.next;
                }

                if (prev != null) {
                    prev.next = curr;
                } else {
                    head = curr;
                }
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
