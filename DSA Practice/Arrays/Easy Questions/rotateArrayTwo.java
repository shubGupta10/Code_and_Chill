import java.util.ArrayList;

public class rotateArrayTwo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        int k= 2;
        ArrayList<Integer> rotatedArray =  rotateArray(arr, k);
        System.out.println(rotatedArray);
    }

    static ArrayList<Integer> rotateArray(ArrayList<Integer> arr , int k){
        int n = arr.size();
        k= k % n;

        ArrayList<Integer> rotatedArray = new ArrayList<>(n);

        for(int i=0; i< n; i++){
            int newIndex = (i-k+n) % n;
            rotatedArray.add(arr.get(newIndex));
        }

        return rotatedArray;
        
    }
}
