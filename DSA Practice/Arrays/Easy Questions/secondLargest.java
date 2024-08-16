public class secondLargest {
    public static void main(String[] args) {
      int[] a = {9, 8, 7, 6, 4, 32, 2};
      int n = a.length;

      int result = secondLargestElem(a, n);
      System.out.println(result);
    }   
    
    static int secondLargestElem(int [] a , int n){
        n = a.length;
        if(n < 2){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(a[i] > largest){
                secondLargest = largest;
                largest = a[i];
            } else if(a[i] > secondLargest && a[i] != largest){
                secondLargest = a[i];
            }
        }
        return secondLargest;
    }
}
