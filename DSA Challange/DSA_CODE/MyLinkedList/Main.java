package MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insertAtSpecific(4, 4);
        list.insert(5);
        list.insert(6);
        list.insertAtEnd(7);


        list.reverseUsingRecursion();
        System.out.println();

        System.out.println(list.display());


        if(list.isEmpty()){
            System.out.println("List is empty");
       }else{
            System.out.println("List is not empty");
        }
}
}
