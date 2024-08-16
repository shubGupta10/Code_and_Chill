public class CLL{
    private Node head;
    private Node tail;


    public CLL(){
        this.head = null;
        this.tail = null;
    }



    public void insert(int val){
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;

        if(head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            } while(node != head);
            System.out.println("END");

        }
    }


    public void delete(int val){
        Node node = head;

        if(head == null){
            return;
        }

        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }
    
    private class Node {
        int val;
        Node next;


        public Node(int val){
            this.val = val;
        }
    }
    
    
    
    public static void main(String[] args) {

        CLL list = new CLL();
        list.insert(8);
        list.insert(12);
        list.insert(24);
        list.insert(45);
        list.insert(67);
        list.display();
        System.out.println();
        list.delete(67);
        list.display();
        
    }
}