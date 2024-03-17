import java.util.ArrayList;

public class alernateNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, -4, -5};
        ArrayList<Integer> result = adjustAlternateNumbers(a);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static ArrayList<Integer> adjustAlternateNumbers(int[] a){
        int n = a.length;
        
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();


        for(int num : a){
        if(num > 0){
            positive.add(num);
        } else{
            negative.add(num);
        }
    }

    ArrayList<Integer> result = new ArrayList<>();

    int i=0, j=0;
    boolean positiveTurn = true;


    while (i< positive.size() && j< negative.size()) {
        if(positiveTurn){
            result.add(positive.get(i));
            i++;
        } else{
            result.add(negative.get(j));
            j++;
        }
        positiveTurn = !positiveTurn;
    }

    //addd remainig elem 
    while (i< positive.size()) {
        result.add(positive.get(i));
        i++;
    }

    while (j< negative.size()) {
        result.add(negative.get(j));
        j++;
    }

    return result;



    }
 }


// Array Implementation of this code :

/* public class Solution {
    public static int[] alternateNumbers(int[] a) {
        int n = a.length;

        -> Create result array
           int[] result = new int[n];

        -> Initialize pointers for positive and negative sections
           int positiveIndex = 0;
           int negativeIndex = 1;

        ->  Fill result array with alternate positive and negative elements
        for (int num : a) {
            if (num > 0) {
                result[positiveIndex] = num;
                positiveIndex += 2;
            } else {
                result[negativeIndex] = num;
                negativeIndex += 2;
            }
        }

        return result;
    }
}
*/
