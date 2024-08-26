public class DeleteNode {
    public static void main(String[] args) {

    }

    public ListNode deleteTheNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}