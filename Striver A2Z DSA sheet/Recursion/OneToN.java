import java.util.Scanner;

public class OneToN{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        printNum(num);
    }

    static void printNum(int num) {
        if (num > 0) {
            printNum(num - 1); 
        }
        System.out.print(num + " "); 
    }
}