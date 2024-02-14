import java.util.Arrays;

public class subsetArray{
    public static void main(String[] args){
        int [] a1 = {5,3,2,4,7,3,2};
        int [] a2 = {9,3,4,2,56,2,1};

        int result = Arraysubset(a1, a2);

        if(result == 1){
            System.out.println("A2 is subset of A1");
        } else if(result == 0){
            System.out.println("A2 is not subset of A1");
        } else{
            System.out.println("The Arrays are not sorted");
        }
        


    }

    static int Arraysubset(int a1 [], int a2[]  ){
          
        Arrays.sort(a1);
        Arrays.sort(a2);

        int i =0;
        int j =0;


        while (i<a1.length && j<a2.length) {
            if (a1[i] < a2[j]) {
                i++;
            } else if(a1[i] == a2[j]){
                i++;
                j++;
            } else{
                return 0;
            }
        }

        return j == a2.length ? 1 : 0;
    }
}