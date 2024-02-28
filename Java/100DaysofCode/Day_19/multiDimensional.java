import java.util.ArrayList;
import java.util.Scanner;

public class multiDimensional {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            // intitialise the list
            for (int i = 0; i < 3; i++) { 
                list.add(new ArrayList<>());
            }

            // add elements through user input
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    list.get(i).add(in.nextInt());   
                }                
            }
            System.out.println(list);
        }        
    }
}
