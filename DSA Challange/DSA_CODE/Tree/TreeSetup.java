package Tree;

import java.util.Scanner;

public class TreeSetup {
    static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        Node root = createTree(); 
        System.out.println("Tree created successfully.");

        System.out.println("Here is your all three traversals");
        InOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }

    static Node createTree() { 
        System.out.println("Enter data:");
        int data = sc.nextInt();

        if (data == -1) return null;

        // Create the root node
        Node root = new Node(data);

        System.out.println("Enter left for" + data);
        root.left = createTree(); 

        System.out.println("Enter right for " + data);
        root.right = createTree(); 

        return root;
    }

    //Traversal in trees
    static void InOrder(Node root){
        if(root == null) return;

        //follow LNR
        InOrder(root.left);
        System.out.print(root.data+ " ");
        InOrder(root.right);
    }

    static void preOrder(Node root){
        if(root == null) return;

        //follow NLR
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null) return;

        //follow LRN
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
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
