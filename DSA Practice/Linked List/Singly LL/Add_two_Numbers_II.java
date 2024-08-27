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


    public ListNode AddTwoNunber(ListNode l1, ListNode l2){
        l1 = Reverse(l1);
        l2 = Reverse(l2);

        int sum = 0;
        int carry = 0;

        ListNode ans = new ListNode();

        while(l1 != null || l2 != null){
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            ans.val = sum % 10;
            carry = sum / 10;


            ListNode newNode = new ListNode(carry);
            newNode.next = ans;
            ans = newNode;
            sum = carry;
        }

        return carry == 0 ? ans.next : ans ;
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