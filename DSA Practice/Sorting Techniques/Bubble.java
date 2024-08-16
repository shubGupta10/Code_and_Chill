public class Bubble {
    public static void main(String[] args) {
        int [] arr = {74,3,38,12,24,56};
        int n = arr.length;
        bubbleSort(arr, n);
        for (int num: arr){
            System.out.printf(num + " ");
        }
    }

    static void bubbleSort(int [] arr, int n){
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
}

//Approach:-
//compare the adjacent element int the loop and swapping the elem
