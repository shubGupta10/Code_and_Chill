import java.util.Scanner;

public class reverseAString{
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the String:- ");
            String str = sc.nextLine();
            System.out.println("Here is your Reversed Number:- " + revStr(str));
        }

    }

    static String revStr(String str){
        String reversed = "";
        for(int i = str.length() - 1; i>=0; i--){
            reversed = reversed + str.charAt(i);
        } 
        return reversed;
    }
}