import java.util.LinkedList;

public class LL{
    public static void main(String[]args){
        LinkedList<String> list = new LinkedList<String>();

        //adding element at first and last
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("a");
        list.addLast("list");
        System.out.println(list);


        //to print the list
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("Null");

        // to delete the element

        list.removeFirst();
        System.out.println(list);
        
        list.removeLast();
        System.out.println(list);

        //can remove elem at a particular position

        list.remove(1);
        System.out.println(list);
    }
}