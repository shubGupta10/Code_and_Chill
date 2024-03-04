import java.util.ArrayList;
import java.util.List;

public class Factorial_Two {
    public static void main(String[] args) {
        long n = 20;
        List<Long> result = factorialNumbers(n);
        System.out.println("Factorial numbers less than or equal to " + n + ": " + result);
    }

    public static List<Long> factorialNumbers(long n) {
        List<Long> result = new ArrayList<>();
        long factorial = 1;
        int i = 1;
        while (factorial <= n) {
            result.add(factorial);
            i++;
            factorial = Factorial(i);
        }
        return result;
    }

    static long Factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * Factorial(num - 1);
    }
}


// -> result.add(factorial) adds 1 to the result list.
// -> i++ increments i to 2.
// -> factorial = factorial(i) calculates the factorial of 2, which is 2.
// -> Now, factorial = 2.
// -> Since 2 <= 20, the loop continues.
