public class arraySorted {
    public static void main(String[] args) {
        int [] a = {23,67,12,45,34,87,10};
        int n = a.length;
        int result = isSorted(a, n);
        System.out.println(result);
    }   
    
    static int isSorted(int [] a, int n){
        n = a.length;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                return 0; // Return 0 if any element is greater than the next element
            }
        }
        return 1;
    }
}
