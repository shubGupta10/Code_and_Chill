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
            if (a1[i] < a2[j]) { //yha hum a2 me check kr rhe hai ki agar a2 ka current element is less than a1 than we will do i++ 
                i++;
            } else if(a1[i] == a2[j]){
                //yha hum check kr rhe h ki agar a1 aur a2 ka current elem same h to its a match..
                i++;
                j++;
            } else{
                //if a1 is greater than a2 subset is not present in a1
                return 0;
            }
        }

        return j == a2.length ? 1 : 0;
    }
}