public class stringPalindrome {
    public static void main(String[] args) {
        
        String str = "MADAM";
        int result = checkPalindrome(str);
        if(result == 1){
            System.out.println("This is Palindrome");
        }else{
            System.out.println("No,its not palindrome.");
        }
    }
    
    static int checkPalindrome(String str){
        if(str.isEmpty() || str.length() == 1){
        return 1;
        }


        char first = str.charAt(0);
        char end = str.charAt(str.length()-1);


        if(first == end){
            return checkPalindrome(str.substring(1, str.length()-1));
        } else{
            return 0;
        }
    }

    
}
