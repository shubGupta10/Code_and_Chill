import java.util.Scanner;

public class dicisionMaking {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();

            if(a<b){
                System.out.println("Smaller");
            } else if(a>b){
                System.out.println("Greater");
            } else if(a==b){
                System.out.println("Equal");
            }
        }
    }
    
}
