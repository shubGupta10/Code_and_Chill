public class Add_two_Number {
    //main function
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Add_two_Number solution = new Add_two_Number();
        ListNode result = solution.addtwoNumber(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }

    //to print the output
    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public ListNode addtwoNumber(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode ptr = result;

        int carry = 0;

        while(l1 != null || l2 != null){
            int sum = 0 + carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }


            carry = sum / 10;
            sum = sum % 10;

            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }


        if(carry == 1) ptr.next = new ListNode(1);
        return result.next;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
}