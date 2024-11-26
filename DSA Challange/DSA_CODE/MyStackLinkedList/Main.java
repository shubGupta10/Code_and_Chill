package MyStackLinkedList;

public class Main {
    public static void main(String[] args) {
        MyStackLinkedList list = new MyStackLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        list.pop();

        list.printElement();
    }
}
