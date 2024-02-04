package Java;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[] myNums = { 2, 4, 5, 6, 7 };
            System.out.println("Enter the Target Element:-");
            int target = sc.nextInt();
            int[] indices = findTwoSumIndices(myNums, target);

            if (indices != null) {

                System.out.println("Element is found at the indices :- " + indices[0] + " and " + indices[1]);
            } else {
                System.out.println("Element is not found");
            }
        }

    }

    private static int[] findTwoSumIndices(int[] myNums, int target) {
        for (int i = 0; i < myNums.length; i++) {
            for (int j = i+1 ; j < myNums.length; j++) {
                if (myNums[i] + myNums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}