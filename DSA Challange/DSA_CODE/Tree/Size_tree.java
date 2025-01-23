public class Size_tree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println("Maximum value in the tree: " + Maximum(root));
    }

    static int Maximum(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE; 
        }

        return Math.max(root.data, Math.max(Maximum(root.left), Maximum(root.right)));
    }
}

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}