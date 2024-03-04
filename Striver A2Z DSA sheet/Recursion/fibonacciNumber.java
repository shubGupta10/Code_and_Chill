import java.util.Scanner;

public class fibonacciNumber{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();

            int result = checkFibo(n);
            System.out.println(result);
        }
    }

    static int checkFibo(int n){
        if (n == 0) {
            return 0; 
        } else if (n == 1 || n == 2) {
            return 1; 
        } else {
            return checkFibo(n - 1) + checkFibo(n - 2);
        }
    }
}