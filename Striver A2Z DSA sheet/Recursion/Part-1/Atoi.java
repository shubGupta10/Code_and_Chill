public class Atoi{
    
    int ImplementedAtoi(String str){
       return atoi(str,0,0);
    }

    static int atoi(String str, int index, int result){
        //base case:
        //if index exceeds the string length
        if (index >= str.length() || !Character.isDigit(str.charAt(index))) {
            return result;
        }


        //extract the current digit:
        int digit = str.charAt(index) - '0';

        //checking for overflow before adding another value
        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit > 8)) {
            return Integer.MIN_VALUE;
        }

        //update the result:
        result = result * 10 + digit;


        //recursion call
        return atoi(str, index + 1, result);

    }
    
    public static void main(String[] args){
        Atoi sollution = new Atoi();
        String test1 = "45rohit12";

        System.out.println(sollution.ImplementedAtoi(test1));
    }
}