public class InsertionSortLinkedList {
    public static void main(String[] args) {
        InsertionSortLinkedList solution = new InsertionSortLinkedList();

        ListNode head = solution.new ListNode(4);
        head.next = solution.new ListNode(1);
        head.next.next = solution.new ListNode(2);
        head.next.next.next = solution.new ListNode(3);

        ListNode sortedHead = solution.insertionSortList(head);

        ListNode current = sortedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while(curr != null){
            ListNode prev = dummy;

            while (prev.next != null && prev.next.val < curr.val){
                prev = prev.next;
            }

            ListNode nextTemp = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = nextTemp;
        }
        return dummy.next;
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
