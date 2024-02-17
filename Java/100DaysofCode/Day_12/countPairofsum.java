// Q: Count pairs with given sum: let say u have aarray {1,2,3,4,5} so u have to find two or more pairs that have equal sum = k

public class countPairofsum {

    public static void main(String[] args) {
        
        int [] arr = {1,5,7,1};
    

        int result = countPair(arr, 6, 0);
        System.out.println("Here is the given pairs: " + result);
    }

    static int countPair(int [] arr, int k, int count){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == k ){
                    count++;
                }
            }

        }
        return count;
    }
}