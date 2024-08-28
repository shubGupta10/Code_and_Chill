public class CheckListPalindrome {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse List
        ListNode prev = null;
        while(slow != null){
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }


        //compare left and right

        ListNode left = head;
        ListNode right = prev;

        while(right != null){
            if(left.val != right.val){
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
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
