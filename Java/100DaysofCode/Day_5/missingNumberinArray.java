import java.util.Scanner;

public class missingNumberinArray {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array");
            int n = in.nextInt();
            System.out.println("Enter the Array elements");
            int [] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = in.nextInt();
            }
            System.out.println("The missing number is " + missingNumber(arr, n));
        }
    }

    static int missingNumber(int array[], int n) {
        int totalSum = (n+1)*(n+2)/2;
        int arraySum = 0;
        for (int i = 0; i < n; i++) {
            arraySum += array[i];
        }
        return totalSum - arraySum;
    }
}
