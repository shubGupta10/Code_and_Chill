import java.util.Scanner;

public class NToOne {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int x = in.nextInt();

            printnumber(x);
        }
    }

    static void printnumber(int x){
        //base condition
        if(x > 0){
            System.out.println(x); 
            printnumber(x - 1);
        } else {
            System.out.println(x); 
        }
        
    }
    
}
