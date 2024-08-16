public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);
        System.out.println(result);
    }

    //to check if it isPalindrome
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char Chstart = Character.toLowerCase(s.charAt(start));
            char chEnd = Character.toLowerCase(s.charAt(end));

            if(!Character.isLetter(Chstart)){
                start++;
                continue;
            }

            if(!Character.isLetter(chEnd)){
                end--;
                continue;
            }

            if(chEnd != Chstart){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
