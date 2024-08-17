public class MergeList {
//    main function
    public static void main(String[] args) {
        ListNode L1 = new ListNode(1);
        L1.next = new ListNode(3);
        L1.next.next = new ListNode(5);

        ListNode L2 = new ListNode(2);
        L2.next = new ListNode(4);
        L2.next.next = new ListNode(6);

        MergeList merger = new MergeList();
        ListNode mergedList = merger.mergeTwoLists(L1, L2);

        printList(mergedList);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public ListNode mergeTwoLists(ListNode L1, ListNode L2) {
        ListNode result = new ListNode(0);
        ListNode prev = result;

        while (L1 != null && L2 != null) {
            if (L1.data <= L2.data) {
                prev.next = L1;
                L1 = L1.next;
            } else {
                prev.next = L2;
                L2 = L2.next;
            }
            prev = prev.next;
        }

        if (L1 != null) {
            prev.next = L1;
        }
        if (L2 != null) {
            prev.next = L2;
        }

        return result.next;
    }
}

class ListNode {
    int data;
    ListNode next;
    ListNode(int x) { data = x; }
}
