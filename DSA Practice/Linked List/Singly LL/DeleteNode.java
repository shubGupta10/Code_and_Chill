public class DeleteNode {
    ListNode head = new ListNode(4);
    head.next = new ListNode(5);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(9);
        System.out.println("Original Linked List:");

    deleteNode(head.next);


    public ListNode deleteTheNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
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