public class reverseString {
    public static void main(String[] args) {
        String input = "   Welcome   to    Coding   Ninjas   ";
        String reversed = reverseTheString(input);
        System.out.println(reversed);
    }

    public static String reverseTheString(String str) {
        String[] words = str.trim().split("\\s+");

        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); 
            }
        }
        return reversed.toString();
    }
}
