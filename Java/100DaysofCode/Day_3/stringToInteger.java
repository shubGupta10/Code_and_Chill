import java.util.Scanner;

class stringToInteger{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String you want to change:- ");
        String str = in.next();

        int result = stringtoInt(str);
        System.out.println("The Result is :- " + result);
    }

    static int stringtoInt(String str){
        int num = Integer.parseInt(str);
        return num; 
    }
}