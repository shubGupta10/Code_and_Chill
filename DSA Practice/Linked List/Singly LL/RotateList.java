public class RotateList {
    public static void main(String[] args) {
        RotateList rl = new RotateList();
        ListNode head = rl.new ListNode(1);
        head.next = rl.new ListNode(2);
        head.next.next = rl.new ListNode(3);
        head.next.next.next = rl.new ListNode(4);
        head.next.next.next.next = rl.new ListNode(5);

        int k = 2;
        ListNode newHead = rl.RotateLinkedList(head, k);

        // Print rotated list
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }

    public int SizeofLL(ListNode head) {
        int n = 0;
        while (head != null) {
            n++;
            head = head.next;
        }
        return n;
    }

    public ListNode RotateLinkedList(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int n = SizeofLL(head);
        int loop = k % n;
        loop = n - loop;

        if (n == 1 || loop == n) {
            return head;
        }

        int j = 0;
        ListNode temp = head;
        ListNode FirstAddress = temp;

        while (temp != null) {
            j++;
            if (j == loop) {
                FirstAddress = temp.next;
                temp.next = null;
                break;
            }
            temp = temp.next;
        }

        temp = FirstAddress;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;

        return FirstAddress;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
