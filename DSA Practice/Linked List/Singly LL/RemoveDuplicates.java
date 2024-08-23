public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }


        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            if(curr.next != null && curr.val == curr.next.val){
                int val = curr.val;

                while(curr != null && curr.val == val){
                    curr = curr.next;
                }

                if(prev != null){
                    prev.next = curr;
                }else{
                    head = curr;
                }
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
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