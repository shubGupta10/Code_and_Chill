package MyLinkedList;

public class find_length_In_Loop {
    public int length_In_Loop(ListNode head) {
        if(head == null || head.next == null){
            return 0;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            //main logic here
            if(slow == fast){
                int loopLength = 1;
                ListNode current = slow.next;

                while(current != null){
                    loopLength++;
                    current = current.next;
                }
                return loopLength;
            }
        }
        return 0;
    }
}
