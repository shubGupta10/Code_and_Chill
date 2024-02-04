import java.util.Scanner;

class ReverseNumber{
    public static void main(String[] args){

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the Number :- ");
            int num = in.nextInt();
            int reversed = reverse(num);
            System.out.println("The Result of the Number is:- " + reversed);
        }
    }


    static int reverse(int num){
        int reversed = 0;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        return reversed;
    }
}