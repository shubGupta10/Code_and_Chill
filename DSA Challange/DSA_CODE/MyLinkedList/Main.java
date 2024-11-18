package MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insertAtBeginning(1);
        list.insert(2);
        list.insert(3);
        list.insertAtSpecific(4, 4);
        list.insert(5);
        list.insert(6);
        list.insertAtEnd(7);


        System.out.println("Before Reverse: " + list.display());
        list.reverse();
        System.out.println("After Reverse: " + list.display());



        if(list.isEmpty()){
            System.out.println("List is empty");
       }else{
            System.out.println("List is not empty");
        }
}
}
