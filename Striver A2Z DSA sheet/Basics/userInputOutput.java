import java.util.Scanner;

public class userInputOutput {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().charAt(0);

        if(Character.isUpperCase(ch)){
            System.out.println("1");
        } else if(Character.isLowerCase(ch)){
            System.out.println("0");
        } else{
            System.out.println("-1");
        }

    }
}
