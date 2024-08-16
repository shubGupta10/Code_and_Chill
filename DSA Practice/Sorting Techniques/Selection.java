public class Selection {
    public static void main(String[] args){
        int [] arr = {74,3,38,12,24,56};
        selectionSort(arr);
        for (int num: arr){
            System.out.printf(num + " ");
        }
    }

    static  void selectionSort(int [] arr ){
        for (int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
//
//Approach:
//1. using a for loop first we find a minimum element.
//2. using a second for loop we checked if the arr[j] is greater than arr[min] then min ko j kr do
//3. then elem swap kr do
