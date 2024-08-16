import java.util.Scanner;

public class countDigit{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int [] num = {1,2,3,4,5,6,7,8,9};
            int checkNum = in.nextInt();

            int result = countNum(num, checkNum);
            System.out.println("The result of this operation is : " + result );
        }
    }

    static int countNum(int [] num, int checkNum){
        int count = 0;
        String numString = Integer.toString(checkNum);
        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            if (digit != 0 && checkNum % digit == 0) {
                count++;
            }
        }
        return count;
    }
}