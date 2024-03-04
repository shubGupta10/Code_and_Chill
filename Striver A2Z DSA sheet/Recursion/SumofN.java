import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();

            int result = sumofN(n);
            System.out.println(result);
        }
    }

    static int sumofN(int n){
        //base condition
        if(n ==  0){
            return 0;
        } 

        return n + sumofN(n-1);
    }
    
}
