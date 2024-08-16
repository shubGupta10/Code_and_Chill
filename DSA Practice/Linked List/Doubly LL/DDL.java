public class DDL {
    Node head;

    static class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void display(){
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("END");
    }

    public void reverse() {
        Node current = head;
        Node temp = null;
    
        // Traverse till the end of the list to find the last node
        while (current != null) {
            temp = current.prev; // Save the reference to the previous node
            current.prev = current.next; // Reverse the links
            current.next = temp;
            current = current.prev; // Move to the next node
        }
    
        // If the list is not empty, the new head will be the last node (now first after reversing)
        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        DDL list = new DDL();
        list.insertFirst(34);
        list.insertFirst(43);
        list.insertFirst(57);
        list.insertFirst(66);
        list.insertLast(78);
        list.reverse();
        list.display();
    }
}
