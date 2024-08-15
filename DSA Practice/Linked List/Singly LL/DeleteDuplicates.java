public class DeleteDuplicates {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        
        DeleteDuplicates solution = new DeleteDuplicates();
        ListNode result = solution.deleteDuplicates(head);
        
        // Print the resulting list
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head){
        if(head == null){
            return null;
        }

        ListNode Finder = head;

        while(Finder != null && Finder.next != null){
            if(Finder.data == Finder.next.data){
                Finder.next  = Finder.next.next;
            }else{
                Finder = Finder.next;
            }
        }
        return head;
    }

    public static class ListNode {
        int data;
        ListNode next;
        ListNode(int x) { data = x;  };
    }
}
