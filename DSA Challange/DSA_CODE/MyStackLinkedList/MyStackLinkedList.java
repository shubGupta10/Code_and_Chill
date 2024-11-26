package MyStackLinkedList;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class MyStackLinkedList {
    private Node head;

    public MyStackLinkedList() {
        head = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printElement(){
       StringBuilder builder = new StringBuilder();
       Node current = head;

       while(current != null){
           builder.append(current.data);
           if(current.next != null){
               builder.append(" -> ");
           }
           current = current.next;
       }
       System.out.println(builder.toString());
    }

    public int pop() {
        if (head == null) {
            throw new IllegalStateException("Stack is empty");
        }

        int value = head.data;
        head = head.next;
        return value;
    }

    public int peek() {
        if(head == null){
            throw new IllegalStateException("Stack is empty");
        }
        return head.data;
    }

}
