public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs)); // Output: "fl"
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String firstStr = strs[0];

        for (int i = 0; i < firstStr.length(); i++) {
            char ch = firstStr.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                // Check if current index is out of bounds for any string or if characters do not match
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return firstStr.substring(0, i);
                }
            }
        }
        return firstStr;
    }
}
