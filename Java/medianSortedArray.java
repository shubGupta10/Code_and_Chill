package Java;

import java.util.Arrays;
import java.util.Scanner;

public class medianSortedArray {
    public static void main(String[] args){
         try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of num1:");
            int size1 = scanner.nextInt();
            int[] num1 = new int[size1];

            System.out.println("Enter elements for num1:");
            for (int i = 0; i < size1; i++) {
                num1[i] = scanner.nextInt();
            }

            System.out.println("Enter the size of num2:");
            int size2 = scanner.nextInt();
            int[] num2 = new int[size2];

            System.out.println("Enter elements for num2:");
            for (int i = 0; i < size2; i++) {
                num2[i] = scanner.nextInt();
            }

            int minLength = Math.min(num1.length, num2.length);
            int [] result = new int[minLength];


            for(int i=0; i<minLength; i++){
                result[i] = num1[i] + num2[i];
            }

            Arrays.sort(result);

            double median = findMedian(result);
            System.out.println("Median: " + median);
        }
    }

    static double findMedian(int[] array){
        int n = array.length;

        if(n % 2 == 0){
            int mid1 = n/2 -1;
            int mid2 = n/2;
            return (double) (array[mid1] + array[mid2] )/2;
        }
        else{
            return array[n/2];
        }
    }
}
