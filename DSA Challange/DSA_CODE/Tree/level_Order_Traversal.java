import java.util.LinkedList;
import java.util.Queue;

public class level_Order_Traversal {
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        printLevelOrder(root);
    }

    public static void printLevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.poll();

            // Null check
            if(curr == null){
                if(q.isEmpty()){
                    return;
                }
                q.add(null);
                System.out.println();
                continue;
            }

            System.out.print(curr + " "); 

            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
}

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
