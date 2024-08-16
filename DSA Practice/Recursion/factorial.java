import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();

            int result = CalcFactorial(n);
            System.out.println(result);
        }
    }

    static int CalcFactorial(int n){
        if(n == 0){
            return 0;
        }
        return n * CalcFactorial( n - 1);
    }
    
}
