public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        boolean result = palindromeCheck(num);
        System.out.println("So the result is : "+ result);
    }

    static boolean palindromeCheck(int num){
        int reverseNum = 0;
        int originalNum = num;
        while(num!=0){
            int digit = num % 10;
             reverseNum = reverseNum * 10 + digit;
             num = num / 10; 
        }
        return originalNum == reverseNum;
    }
}
