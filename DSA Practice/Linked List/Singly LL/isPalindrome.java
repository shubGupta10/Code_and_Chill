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

        // Step 1: Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode reverseSecondHalf = reverseList(slow);

        // Step 3: Compare the first half with the reversed second half
        ListNode start = head;
        ListNode end = reverseSecondHalf;

        while (end != null) {
            if (start.x != end.x) {  // Use 'x' instead of 'val'
                return false;
            }
            start = start.next;
            end = end.next;  // Fix the typo here
        }

        return true;
    }

    // Correct the reverseList method definition
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

    // Correct the ListNode class
    public static class ListNode {
        int x;  // Use 'x' instead of 'val'
        ListNode next;

        ListNode(int x) {
            this.x = x;  // Corrected the constructor
            this.next = null;
        }
    }
}
