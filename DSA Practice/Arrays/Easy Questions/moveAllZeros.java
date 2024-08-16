public class moveAllZeros {
    public static void main(String[] args){
        int [] arr =  {0, 1, 0, 3, 12};
        moveAllZerosToEnd(arr);

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static  void moveAllZerosToEnd(int[]arr){
        if(arr.length == 0){
            return ;
        }

        int nonZeroIndex = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        while(nonZeroIndex < arr.length){
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
