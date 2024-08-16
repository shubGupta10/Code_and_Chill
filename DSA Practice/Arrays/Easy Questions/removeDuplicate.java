public class removeDuplicate {
    public static void main(String[] args){
        int [] arr = {12,24,34,44,44,54,54,64,64,74};
        int newLength = removeDuplicatesfromSortedArray(arr);
        System.out.println(newLength);
        for (int i=0; i<newLength; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //arr [] = [12,24,34,44,54,64,74]

    public static int removeDuplicatesfromSortedArray(int[]arr){
      if(arr == null || arr.length == 0){
          return 0;
      }

      int n = arr.length;
      int index = 1;

      for (int i=1; i<n; i++){
          if(arr[i] != arr[i-1]){
              arr[index] = arr[i];
              index++;
          }
      }
      return index;
    }
}
