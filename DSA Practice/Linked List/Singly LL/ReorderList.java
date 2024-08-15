public class ReorderList{
     public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

         reorderLinkedList(node1);

        printList(node1);
    }

    public static void reorderLinkedList(ListNode head){
        if(head == null || head.next == null) return;

        //find the middle of the list
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null  && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse the second half of the list

        ListNode prev = null;
        ListNode curr = slow;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }


        //merge the two list
        ListNode first = head;
        ListNode second = prev; // at the reverse list

        while(second.next != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode (int x){
            val = x;
            next = null;
        }
    }
}