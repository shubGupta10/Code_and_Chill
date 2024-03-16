import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class sortArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        int n = list.size();
        arraySorting(list, n);
    }

    static void arraySorting(ArrayList<Integer> arr, int n){
        n = arr.size();
        Collections.sort(arr);
        System.out.println(arr);
    }
}
