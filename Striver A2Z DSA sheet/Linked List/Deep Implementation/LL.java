public class LL {
    Node head;


    class Node{
        String data;
        Node next;


        Node (String data){
            this.data = data;
            this.next = null;
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


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("a");
        list.addLast("list");
        list.printList();
    }
}
