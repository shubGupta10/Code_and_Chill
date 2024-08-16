public class reverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int reverseNum = reverse(num);
        System.out.println("Here is your reversed number: " + reverseNum);
    }

    static int reverse(int num){
        int reverseNum = 0;
        while(num!=0){
           int digit = num % 10; //extract the last num;
           reverseNum = reverseNum * 10 + digit;
           num = num / 10;
        }
        return reverseNum;
    }
}
