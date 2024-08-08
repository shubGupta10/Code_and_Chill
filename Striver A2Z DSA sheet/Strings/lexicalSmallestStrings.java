public class lexicalSmallestStrings {
    public String getSmallestString(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            if (swapped) {
                break;
            }
            if ((chars[i] - '0') % 2 == (chars[i + 1] - '0') % 2 && chars[i] > chars[i + 1]) {
                char temp = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = temp;
                swapped = true;
            }
        }

        return new String(chars);
    }
}
