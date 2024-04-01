public class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;


        Node (String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }


    //adding the element from start
    public void addFirst(String data){
        //first we create a node
        Node newNode = new Node(data);

        // we check if the list have only one elem
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //adding the element from last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // to print the list

    public void printList(){
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    //to delete at start

    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        head = head.next;
    }


    //to delete at Last
    public void deleteLast(){
        size--;
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }


    //to check for size
    public int getSize(){
        return size;
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        
    }
}
