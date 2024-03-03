import java.util.Scanner;

public class printNtimes {
    public static void main(String[] args){

        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();

            printName(n, 1);
        }
    }

    static void printName(int n, int i){
        if(i>n){
            return;
        }
        System.out.println("Coding Ninjas");
        printName(n, i+1);
    }
}
