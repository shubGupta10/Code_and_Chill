// Armstrong number : 153 = 1 * 3 + 5 * 3 + 3 * 3 = 153;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your Number: ");
            int num = in.nextInt();
            boolean result = checkArmstrong(num);
            System.out.println(result);
        }
    }

    static boolean checkArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int power = String.valueOf(num).length(); // Number of digits in the number

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, power); // Raise the digit to the power of the number of digits
            num /= 10;
        }

        return originalNum == sum;
    }
}
