import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int [] arr1 = {7,3,9};
        int [] arr2 = {6,3,9,2,9,4};

        System.out.println(intersectionofTwoArray(arr1, arr2));
    }

    static int intersectionofTwoArray(int[] arr1, int [] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int j =0; j<arr2.length; j++){
            if(set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]); // arr2 waale element remove ho jaaynge jo match hue set me se.
            }
        }

        return count; //output 2 aayega, 3 aur 9 aayega
    }
}
