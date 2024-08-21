public class RemoveNthFromEnd {
    //main function
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        RemoveNthFromEnd solution = new RemoveNthFromEnd();
        head = solution.removeNthFromEnd(head, n);

        printList(head);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode firstPtr = dummy;
        ListNode secondPtr = dummy;

        for (int i = 0; i < n; i++) {
            secondPtr = secondPtr.next;
        }

        while (secondPtr.next != null) {
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }

        firstPtr.next = firstPtr.next.next;

        return dummy.next;
    }

    //print list to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
