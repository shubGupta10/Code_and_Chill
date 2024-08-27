public class Add_two_Numbers_II {
    public static void main(String[] args) {

    }

    public ListNode Reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;


        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
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