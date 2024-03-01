import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int index = in.nextInt();
            int result = fibonacci(index);
            System.out.println("Fibonacci number at index " + index + " is: " + result);
        }
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}
