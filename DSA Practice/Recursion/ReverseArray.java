public class ReverseArray {
 
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.println("Original array:");
        printArray(array);
        
        reverseArray(array, 0, array.length - 1);
        
        System.out.println("Reversed array:");
        printArray(array);
    }

    static void reverseArray(int [] arr, int start, int end){
        if(start >= end){
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;


        reverseArray(arr, start+ 1, end-1);
    }

    static void printArray(int [] arr){
        for(int num : arr){
            System.out.println(num);
        }
        System.out.println();
    }
}
