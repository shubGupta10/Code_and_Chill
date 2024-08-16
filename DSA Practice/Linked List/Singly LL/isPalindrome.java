public class isPalindrome {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        isPalindrome solution = new isPalindrome();
        boolean result = solution.checkIfPalindrome(node1);
        System.out.println("Is the linked list a palindrome? " + result);
    }

    public boolean checkIfPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reverseSecondHalf = reverseList(slow);

        ListNode start = head;
        ListNode end = reverseSecondHalf;

        while (end != null) {
            if (start.x != end.x) {
                return false;
            }
            start = start.next;
            end = end.next;
        }

        return true;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static class ListNode {
        int x;
        ListNode next;

        ListNode(int x) {
            this.x = x;
            this.next = null;
        }
    }
}
