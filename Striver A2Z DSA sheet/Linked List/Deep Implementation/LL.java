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


    //adding the element
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


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("This");
    }
}
