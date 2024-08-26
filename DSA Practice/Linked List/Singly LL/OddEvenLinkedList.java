public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        OddEvenLinkedList solution = new OddEvenLinkedList();
        head = solution.oddEvenList(head);

        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);

        ListNode lefthead = left;
        ListNode righthead = right;

        int index = 1;

        while (head != null) {
            if (index % 2 == 1) {
                left.next = head;
                left = left.next;
            }else{
                right.next = head;
                right = right.next;
            }
            head = head.next;
            index++;
        }


        right.next = null;
        left.next = righthead.next;

        return lefthead.next;
    }

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
}