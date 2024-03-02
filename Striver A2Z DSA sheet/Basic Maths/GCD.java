// GCD = greatest common divisor

public class GCD {
    public static void main(String[] args) {
        int n = 12;
        int m = 20;
        int result = calcGCD(n, m);
        System.out.println("The result is: "+ result);
    }

    static int calcGCD(int n, int m){
        int gcd = 1;
        for(int i=1; i<=n && i<=m; i++){
            if(n % i == 0 && m % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}
