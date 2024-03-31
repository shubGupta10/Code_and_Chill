import java.util.LinkedList;

public class LL{
    public static void main(String[]args){
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("is");
        list.addFirst("This");
        list.addLast("a");
        list.addLast("list");
        System.out.println(list);
    }
}