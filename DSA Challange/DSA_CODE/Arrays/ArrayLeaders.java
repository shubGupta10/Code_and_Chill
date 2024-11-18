import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        int maxRight = arr[arr.length -1];
        result.add(maxRight);


        for(int i=arr.length - 2; i>=0; i--){
            if(arr[i] >= maxRight){
                result.add(arr[i]);
                maxRight = arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> leadersList = leaders(arr);

        System.out.println("Leaders in the array: " + leadersList);
    }
}
