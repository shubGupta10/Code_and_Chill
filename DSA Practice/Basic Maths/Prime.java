import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int num = in.nextInt();

            boolean result = isPrime(num);
            if(result){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }

    public static boolean isPrime(int num){
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        } else{
            return false;
        }
    }
}
