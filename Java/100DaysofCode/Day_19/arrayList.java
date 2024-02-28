import java.util.*;
public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //adding values
        list.add(0);
        list.add(1);
        list.add(2);
        
        System.out.println(list);


        //get elements
        int elem = list.get(2);
        System.out.println(elem);

        //add in between
        list.add(1,4);
        System.out.println(list);


        //set element
        list.set(1,6); //1 index value h aur 6 value add krni h
        System.out.println(list);


        //delete element
        list.remove(1);
        System.out.println(list);


        //size of the arraylist
        int size = list.size();
        System.out.println(size);

        //Interate over the Arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //Sorting over the ArrayList
        Collections.sort(list);
        System.out.println(list);
    }
}
