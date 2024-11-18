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

        if(head == null) {
            head = newNode;
        }else{
            Node current = head;

            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public String display() {
        Node current = head;
        StringBuilder builder = new StringBuilder();

        while(current != null) {
            builder.append(current.data).append(" --> ");
            current = current.next;
        }
        return builder.toString();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }else{
            newNode = head;
            head.next = newNode;
        }

    }

    public void insertAtSpecific(int data, int position){
        Node newNode = new Node(data);

        Node current = head;
        int index = 1;

        while(current != null && index < position -1) {
            current = current.next;
            index++;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node current = head;

        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void reverse() {
        Node current = head;
        Node prev = null;

        while(current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        head = prev;
    }
}
