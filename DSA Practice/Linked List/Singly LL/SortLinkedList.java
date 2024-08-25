public class SortLinkedList {
    public static void main(String[] args) {
        SortLinkedList solution = new SortLinkedList();
        ListNode head = solution.new ListNode(4);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(1);
        head.next.next.next = solution.new ListNode(3);

        ListNode sortedHead = solution.sortList(head);
        printList(sortedHead);
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode middle = getMiddle(head);
        listNode left = head;
        ListNode right = middle.next;
        middle.next = null;

        left = sortList(left);
        right = sortList(right);

        return mergeList(Left, Right);
    }

    public ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode mergeList(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;


        while(left != null && right != null) {
            if(left.val < right.val){
                current.next = left;
                left = left.next;
            }else{
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if(left != null){
            current.next = left;
        }else{
            current.next = right;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
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