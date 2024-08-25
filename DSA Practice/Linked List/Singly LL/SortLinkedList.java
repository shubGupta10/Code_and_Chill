public class SortLinkedList {
    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode middle = getMiddle(head);
        listNode left = head;
        ListNode right = middle.next;
        middle.next = null;

        Left = sortList(left);
        Right = sortList(right);

        return mergeList(Left, Right);
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