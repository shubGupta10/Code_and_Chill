public class findNthNode {
    
    class Node {
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public Node searchNthNode(Node head, int n){
        if (head.next == null) {
            return null;
        }
        
        //size
        int size = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }


        //searching here
        int indexToSearch = size - n;
        Node prev = head;
        int i =1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }
        // size - n elem pe aao aur fir uss elem se pehle se elem ko pakad lo
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        findNthNode obj = new findNthNode();
        Node head = obj.new Node(1); 
        head.next = obj.new Node(2); 
        head.next.next = obj.new Node(3); 

        int n = 2; 
        Node result = obj.searchNthNode(head, n);
        if (result != null) {
            System.out.println("Node at position " + n + " from end is: " + result.val);
        } else {
            System.out.println("Invalid position or empty list.");
        }
    }
    
}
