public class PartitionList {
    public static void main(String[] args) {
        PartitionList list = new PartitionList();
        ListNode head = list.new ListNode(3);
        head.next = list.new ListNode(5);
        head.next.next = list.new ListNode(8);
        head.next.next.next = list.new ListNode(5);
        head.next.next.next.next = list.new ListNode(10);
        head.next.next.next.next.next = list.new ListNode(2);
        head.next.next.next.next.next.next = list.new ListNode(1);

        int x = 5;
        ListNode newHead = list.partition(head, x);

        list.printList(newHead);
    }

    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);

        ListNode less = lessHead;
        ListNode greater = greaterHead;

        while (head != null) {
            if (head.val < x) {
                less.next = head;
                less = less.next;
            } else {
                greater.next = head;
                greater = greater.next;
            }
            head = head.next;
        }

        greater.next = null;
        less.next = greaterHead.next;

        return lessHead.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
