package Day_8;

import java.util.Scanner;

public class Sum_of_ADD{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:- ");
        int x = in.nextInt();

        System.out.println("Enter the second number:- ");
        int y = in.nextInt();

        int sum =0 ;
        for(int i=x; i<=y; i++){
            if(i%2==1){
                sum = sum + i;
            }
        }
        
    }

}