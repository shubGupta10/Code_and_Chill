import java.util.Arrays;

public class Same_Character_In_TwoString {
    public static void main(String[] args) {
        String A = "choice";
        String B = "chancE";

        int result = printDuplicates(A, B);
        System.out.println("Output: " + result);
    }

    public static int printDuplicates(String A, String B) {
        if (A.length() != B.length()) {
            throw new IllegalArgumentException("Strings must be of equal length");
        }

        A = A.toLowerCase();
        B = B.toLowerCase();

        int count = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(i)) {
                count++;
            }
        }

        return count;
    }
}
