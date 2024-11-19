package MyLinkedList;


class Node {
    public int data;
    public Node next;

    //constructor for data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public String display() {
        Node current = head;
        StringBuilder builder = new StringBuilder();

        while (current != null) {
            builder.append(current.data);
            if (current.next != null) {
                builder.append(" --> ");
            }
            current = current.next;
        }

        return builder.toString();
    }


    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode = head;
            head.next = newNode;
        }

    }

    public void insertAtSpecific(int data, int position) {
        Node newNode = new Node(data);

        Node current = head;
        int index = 1;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void reverse() {
        Node current = head;
        Node prev = null;

        while (current != null) {
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        head = prev;
    }

    public void deleteAtStart() {
        if (head == null) {
            isEmpty();
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is already empty. Cannot delete.");
        } else if (head.next == null) {
            head = null;
        } else {
            Node current = head;

            while (current.next.next != null) {
                current = current.next;
            }

            // Remove the last node
            current.next = null;
        }
    }

    public void deleteFromEndAtSpecific(int position) {
        if(head == null){
            isEmpty();
        }else{
           Node current = head;
           Node Next = head;
           for(int i=0; i<position; i++){
               if (Next == null) {
                   System.out.println("Position is greater than the length of the list.");
                   return;
               }
               Next = Next.next;
           }
           while(Next.next != null){
               current = current.next;
               Next = Next.next;
           }
           current.next = current.next.next;
        }
    }

    public void printRecursion(Node head){
        if(head == null) return;
        System.out.print(head.data + " --> ");
        printRecursion(head.next);
    }

    public void printRecursion(){
        printRecursion(head);
    }
    public void reverseUsingRecursion(){
        head = reverseUsingRecursion(head);
    }

    private Node reverseUsingRecursion(Node head) {
        if(head == null || head.next == null) return head;

        Node rest = reverseUsingRecursion(head.next);

        head.next.next = head;
        head.next = null;

        return rest;
    }

}
