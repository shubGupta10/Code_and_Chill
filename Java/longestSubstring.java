package Java;

import java.util.Scanner;

public class longestSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:-");
        String str = sc.nextLine();
        int[] uniqueAsciiValues = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int ascii = (int) c;

            if (uniqueAsciiValues[ascii] == 0) {
                System.out.print(c + " ");

                uniqueAsciiValues[ascii] = 1;
            }

        }

    }
}
