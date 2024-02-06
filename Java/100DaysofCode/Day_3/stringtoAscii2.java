public class stringtoAscii2 {
    public static void main(String[] args) {
        String str = "Hello";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            System.out.println("The ASCII value of " + ch + " is " + ascii);
        }
    }
}
