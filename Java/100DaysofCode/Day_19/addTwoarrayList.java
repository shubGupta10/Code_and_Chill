import java.util.ArrayList;
public class addTwoarrayList {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<Object>();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(list1);


        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Mango");
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Lichi");
        list2.add("Pineapple");
        list2.add("Promogranade");

        System.out.println(list2);


       list1.addAll(list2);
       System.out.println(list1);


    }
}
