import java.util.ArrayList;

public class Left_Right_View {
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);


        System.out.println("Left View");
        printLeftView(root);

        //just for space
        System.out.println();

        System.out.println("Right View");
        printRightView(root);

    }

    //for left view
    public static void printLeftView(Node root){
        ArrayList<Node> list = new ArrayList<>();
        printLeftViewUtil(root, list, 0);

        for(Node curr : list){
            System.out.println(curr.data + " ");
        }
    }

    //for right view
    public static void printRightView(Node root){
        ArrayList<Node> listRight = new ArrayList<>();
        printRightViewUtil(root, listRight, 0);

        for(Node curr : listRight){
            System.out.println(curr.data + " ");
        }
    }

    //for left view util
    @SuppressWarnings("unchecked")
    public static void printLeftViewUtil(Node root, @SuppressWarnings("rawtypes") ArrayList list, int level){
        if(root == null) return;

        if (list.size() == level) {
            list.add(root); 
        }

        printLeftViewUtil(root.left, list, level + 1);
        printLeftViewUtil(root.right, list, level + 1);
    }

    //for right view util
    @SuppressWarnings("unchecked")
    public static void printRightViewUtil(Node root, @SuppressWarnings("rawtypes") ArrayList listRight, int level ){
        if(root == null) return;

        if(listRight.size() == level){
            listRight.add(root);
        }

        printRightViewUtil(root.right, listRight, level + 1);
        printRightViewUtil(root.left, listRight, level + 1);
    }
}

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data){
        this.data = data;
    }
}
