import java.util.Scanner;

public class MaximumPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of cards and k
        System.out.print("Enter number of cards (n): ");
        int n = scanner.nextInt();
        int[] cardPoints = new int[n];

        System.out.println("Enter the points of the cards:");
        for (int i = 0; i < n; i++) {
            cardPoints[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of cards to pick (k): ");
        int k = scanner.nextInt();

        // Create an instance of MaximumPoints and find the maximum points
        MaximumPoints maxPoints = new MaximumPoints();
        int result = maxPoints.findMaximumPoints(cardPoints, k);

        // Output the result
        System.out.println("Maximum points you can obtain: " + result);

        scanner.close();
    }

    public int findMaximumPoints(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxSum = 0;

        // Calculate the left sum of the first k cards
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }

        maxSum = lsum;

        int rightIndex = cardPoints.length - 1;

        // Move to the right and update lsum and rsum
        for (int i = 0; i < k; i++) {
            lsum -= cardPoints[k - 1 - i];  // Remove the left card
            rsum += cardPoints[rightIndex--]; // Add the right card
            maxSum = Math.max(maxSum, lsum + rsum); // Update maxSum
        }

        return maxSum;
    }
}
