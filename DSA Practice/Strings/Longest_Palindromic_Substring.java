public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        Longest_Palindromic_Substring solution = new Longest_Palindromic_Substring();
        String s = "babad";
        System.out.println(solution.longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        //we check if it is null or not
        if(s == null || s.length() == 0) {
            return "";
        }

        //from start and end
        int start = 0, end = 0;

        for(int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i,i);
            int len2 = expandAroundCenter(s, i, i+1);
            int len = Math.max(len1, len2);


            if(len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    //expand around function
    private int expandAroundCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
