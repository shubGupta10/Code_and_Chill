class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode leftprev = dummy;
        ListNode currNode = head;

        // Move leftprev to the node before the start of the reversal
        for (int i = 0; i < left - 1; i++) {
            leftprev = leftprev.next;
        }

        // Initialize the current node for reversal
        currNode = leftprev.next;
        ListNode subListHead = currNode;
        ListNode preNode = null;

        // Reverse the sublist from left to right
        for (int i = 0; i <= right - left; i++) {
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        // Connect the reversed sublist back to the original list
        leftprev.next = preNode;
        subListHead.next = currNode;

        return dummy.next;
    }
}
